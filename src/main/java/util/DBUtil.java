package util;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws ClassNotFoundException {
        MysqlDataSource mySqlDS = new MysqlDataSource();

        mySqlDS.setUrl("jdbc:mysql://localhost:3306/CENSUSDB");
        mySqlDS.setUser("root");
        mySqlDS.setPassword("password");

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = null;
        try {
            connection = mySqlDS.getConnection();
        } catch (SQLException e) {
            printSQLException(e);
        }

        return connection;
    }

    public static void createUser(String username, String password) {
        try {
            Connection dbConnection = DBUtil.getConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement("INSERT INTO USER (username, passwordHash) VALUES (?, ?)");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean verifyCredentials(String username, String password) {
        try {
            Connection dbConnection = DBUtil.getConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT * FROM USER WHERE username = ? AND passwordHash = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet result = preparedStatement.executeQuery();
            return result.next();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

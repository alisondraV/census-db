package util;

import com.mysql.cj.jdbc.MysqlDataSource;
import entities.GeographicAreaEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static List<GeographicAreaEntity> getGeographicAreas() {
        List<GeographicAreaEntity> areasList = new ArrayList<>();

        try {
            Connection dbConnection = getConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement("select geographicAreaId, name from GEOGRAPHICAREA");

            ResultSet result = preparedStatement.executeQuery();

            if (result != null) {
                while (result.next()) {
                    GeographicAreaEntity entity = new GeographicAreaEntity();
                    entity.setGeographicAreaId(result.getInt("geographicAreaId"));
                    entity.setName(result.getString("name"));
//                    entity.setName(result.getString("name"));
//                    entity.setName(result.getString("name"));
                    areasList.add(entity);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return areasList;
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

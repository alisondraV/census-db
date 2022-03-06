package util;

import com.mysql.cj.jdbc.MysqlDataSource;
import entities.GeographicAreaEntity;
import entities.AgeGroupEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Provides utility methods to transact with the DB
public class DBUtil {
    // connects to the DB and creates a connection
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

    /**
     * Creates a user provided a username and a password
     * @param username a unique username
     * @param password a secure password
     */
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

    /**
     * Tries to retrieve a user by username and password
     * @param username a unique username
     * @param password a matching password
     * @return whether a user with the given username and password exists
     */
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

    /**
     * Gets a list of age data for a specific year
     * @param year the census year to retrieve the data for
     * @return the list populations grouped by age groups
     */
    public static List<AgeGroupEntity> getAges(int year) {
        List<AgeGroupEntity> ageGroups = new ArrayList<>();

        try {
            Connection dbConnection = DBUtil.getConnection();
            String sql =
                    "SELECT SUM(male) AS male, SUM(female) AS female, A.description AS ageGroup FROM AGE\n" +
                            "JOIN AGEGROUP A ON A.ageGroupID = AGE.ageGroup\n" +
                            "JOIN CENSUSYEAR C on AGE.censusYear = C.censusYearID\n" +
                            "WHERE C.censusYear = ? AND AGE.geographicArea = 1\n" +
                            "GROUP BY A.ageGroupID;";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setInt(1, year);
            ResultSet result = preparedStatement.executeQuery();

            if (result != null) {
                while(result.next()) {
                    AgeGroupEntity ageGroup = new AgeGroupEntity();
                    ageGroup.setDescription(result.getString("ageGroup"));
                    ageGroup.setMale(result.getInt("male"));
                    ageGroup.setFemale(result.getInt("female"));
                    ageGroups.add(ageGroup);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return ageGroups;
    }

    /**
     * Retrieves a list of geographic areas
     * @return a list of all geographic areas
     */
    public static List<GeographicAreaEntity> getGeographicAreas() {
        List<GeographicAreaEntity> areasList = new ArrayList<>();

        try {
            Connection dbConnection = getConnection();
            String sql = "SELECT geographicAreaId, name, level FROM GEOGRAPHICAREA";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);

            ResultSet result = preparedStatement.executeQuery();

            if (result != null) {
                while (result.next()) {
                    GeographicAreaEntity entity = new GeographicAreaEntity();
                    entity.setGeographicAreaId(result.getInt("geographicAreaId"));
                    entity.setName(result.getString("name"));
                    entity.setLevel(result.getInt("level"));
                    areasList.add(entity);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return areasList;
    }

    /**
     * Retrieves data for a specific geo area by id
     * @param areaId Geographic Area ID
     * @return a geographic area data (including population)
     */
    public static GeographicAreaEntity getGeographicArea(int areaId) {
        GeographicAreaEntity area = new GeographicAreaEntity();

        try {
            Connection dbConnection = getConnection();
            String sql =
                    "SELECT name, code, level, IFNULL(SUM(H.numberReported), 0) as population FROM GEOGRAPHICAREA G\n" +
                            "LEFT JOIN HOUSEHOLD H ON G.geographicAreaID = H.geographicArea\n" +
                            "WHERE (H.geographicArea IS NULL OR H.censusYear = 1) AND G.geographicAreaID = ?\n" +
                            "GROUP by G.geographicAreaID;";
            PreparedStatement getArea = dbConnection.prepareStatement(sql);
            getArea.setInt(1, areaId);

            ResultSet result = getArea.executeQuery();

            if (result != null) {
                result.next();
                area.setName(result.getString("name"));
                area.setCode(result.getInt("code"));
                area.setLevel(result.getInt("level"));
                area.setPopulation(result.getInt("population"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return area;
    }

    /**
     * Displays a human-readable exception message
     * @param ex the exception to display
     */
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

package be.ucll.campus;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.fail;

public class DbGebouwRepositoryTest {

    private static Connection connection;

    @BeforeAll
    public static void setupConnectionToDatabase(){
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/campus",
                    "root","student"
            );
        } catch (SQLException e){
            try {
                connection.close();
            } catch (SQLException ex) {
                fail(ex);
            }
            fail(e);
        }
    }

    @AfterAll
    public static void closeEverything(){
        try {
            connection.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}

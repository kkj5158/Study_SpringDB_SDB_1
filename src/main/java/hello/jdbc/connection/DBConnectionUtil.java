package hello.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {

    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
    }
}

package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection dbConnection;

    public static Connection getConnection() {
        if (dbConnection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/t1811e?useLegacyDatetimeCode=false&amp&serverTimezone=UTC";
                String user = "root";
                String password = "";

                dbConnection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return dbConnection;
    }
}

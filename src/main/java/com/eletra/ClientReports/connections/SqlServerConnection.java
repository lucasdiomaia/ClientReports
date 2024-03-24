package com.eletra.ClientReports.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerConnection {
    public static Connection getConnection(String base) throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ClientReportsDB;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String password = "ClaintR3ports!";
        return DriverManager.getConnection(url, user, password);
    }
}

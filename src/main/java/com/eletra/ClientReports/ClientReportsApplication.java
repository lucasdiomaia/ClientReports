package com.eletra.ClientReports;

import com.eletra.ClientReports.connections.SqlServerConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class ClientReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientReportsApplication.class, args);
		System.out.println("Starting ClientReports.");
		try {
			var connection = SqlServerConnection.getConnection("ClientReportsDB");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringandRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringandRestApplication.class, args);
	
	
//		
//		  String sql="CREATE TABLE tutorials_tbl (\n" + "id INT NOT NULL,\n" +
//		  "title VARCHAR(50) NOT NULL,\n" + "author VARCHAR(20) NOT NULL,\n" +
//		  "submission_date DATE,\n" + "PRIMARY KEY (id) \n" + ");";
//		 
//	
//		Connection con = null;
//		Statement stmt = null;
//		int result = 0;
//		try {
//		Class.forName("org.hsqldb.jdbc.JDBCDriver");
//		con = DriverManager.getConnection("jdbc:hsqldb:mem://localhost/testdb", "SA", "");
//		stmt = con.createStatement();
//		result = stmt.executeUpdate(sql);
//		System.out.println(result);
//		System.out.println("Table created successfully");
//		}  catch (Exception e) {
//		e.printStackTrace(System.out);
//		}
//	
//		
}
	
	

}

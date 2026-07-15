package storedprocedure;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class sample {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee2","root","root");
				Statement s=c.createStatement();
//				s.execute("create database employee2");
//				System.out.println("data base created");
				
//				
//				s.execute("CREATE DATABASE IF NOT EXISTS employee2");
//				s.execute("USE employee2");  // select the database
//				s.execute("CREATE TABLE emp_det(e_id INT PRIMARY KEY, e_name VARCHAR(40))");
//				System.out.println("Table created");
				
//				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				
				CallableStatement cs = c.prepareCall("INSERT INTO emp_det VALUES(?, ?)");
				cs.setInt(1, 101);
				cs.setString(2, "Madiha Azam Ahmed");
				cs.execute();

				
				System.err.println("enter name");
				String name1=sc.next();
				cs.setString(2, name1);
				
				cs.execute();
				System.out.println("values inserted");
				
				
				
				
				
				
	
	}
}

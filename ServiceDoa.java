package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.entity.StudentEntity;

public class ServiceDoa {
	
   public void insertData() throws Exception {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	   
	   Statement s=c.createStatement();
	   s.executeUpdate("insert into STUDENT1 values(12,'MITHOO','Pune',12)");
	   s.close();
	   }
   public void updateData() throws Exception{
	   //load and register driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
       Statement s=c.createStatement();
       s.executeUpdate("Update STUDENT1 set CITY = 'Mumbai' where ID=10");
       s.close();
   
   }
   public void deleteData() throws Exception{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	   Statement s=c.createStatement();
	   s.executeUpdate("Delete from STUDENT1 where ID=9");
	   s.close();
   }
   public void fetchAllRecords() throws Exception{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	   Statement s=c.createStatement();
	  ResultSet rs= s.executeQuery("Select * from STUDENT1");
	  while(rs.next()) {
		  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getInt(4));
	  }
	   s.close();
   }
}

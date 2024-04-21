package com.ts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class User extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uid = req.getParameter("userid");
		
		//-------------------------
		
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	String url = "jdbc:mysql://127.0.0.1:3306/school_db";
	    	String username = "root";
	    	String password = "root";
	    	
	    	Connection connection = DriverManager.getConnection(url, username, password);
	    	Statement st =  connection.createStatement();
	    	ResultSet rs =  st.executeQuery("SELECT * FROM user WHERE id = "+ uid);
	    	
	    	while(rs.next()) {
	    		System.out.println(rs.getString("name"));
	    		req.setAttribute("data", rs.getString("name"));
	    		req.getRequestDispatcher("index.jsp").forward(req, resp);
	    	}
	    	
	    	while(!rs.next()) {
	    		req.setAttribute("data", "User data is not available");
	    		req.getRequestDispatcher("index.jsp").forward(req, resp);
	    	}
	    	
	    	connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			
		}	
    	

		//-------------------------
		
		
		
		
		
    }
}
package com.gen.serve;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class track
 */
@WebServlet("/track")
public class track extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public track() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "world";
		String driver = "com.mysql.jdbc.Driver";
		int agent = 0;
		
		try{
			String userid = request.getParameter("name1");
			String TrackingIDs = request.getParameter("ids");
			request.setAttribute("ids", TrackingIDs);
			
	    	
			Class.forName(driver).newInstance();
			conn = (Connection) DriverManager.getConnection(url
					+ dbName, "root", "1415");

			String sql1 = "SELECT * from users where username = '"+userid+"'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			
			while(rs.next()) {
				
			   
			     agent = rs.getInt(8);
			     
			    
			}
			    
			    	if(agent == 1){
			    	RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/trackdetails.jsp");
			    	RequetsDispatcherObj.forward(request, response);
			    	}
			    	else{
			    	RequestDispatcher RequetsDispatcherObj1 =request.getRequestDispatcher("/trackdetailsuser.jsp");
			    	RequetsDispatcherObj1.forward(request, response);
			    	}
		
		}catch (Exception e) {
			
		}
		
	}

}

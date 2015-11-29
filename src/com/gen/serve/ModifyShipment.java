package com.gen.serve;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyShipment
 */
@WebServlet("/ModifyShipment")
public class ModifyShipment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyShipment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/number/html");
		PrintWriter pw = response.getWriter();	
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "world"; 
		String driver = "com.mysql.jdbc.Driver";
		
		try{
			String Tracking_ID= request.getParameter("TrackingID");
			String Item=request.getParameter("Item");
			String No_of_packages=request.getParameter("NoofPackages");
			String Packaging_type=request.getParameter("Packagingtype");
			String Package_Declared_Value=request.getParameter("PackageDeclaredValue");
			String SCity=request.getParameter("Scity");
			String DCity=request.getParameter("Dcity");
			//To address
			String Company_or_name=request.getParameter("CompanyorName");
			String Contact=request.getParameter("Contact");
			String Address_line1=request.getParameter("Addressline1");
			String Address_line2=request.getParameter("Addressline2");
			String zipcode=request.getParameter("Zipcode");
			String Email=request.getParameter("Email");
			String Country=request.getParameter("Country");
			
			//From address
			String from_Company_or_name=request.getParameter("from_CompanyorName");
			String from_Contact=request.getParameter("from_Contact");
			String from_Address_line1=request.getParameter("from_Addressline1");
			String from_Address_line2=request.getParameter("from_Addressline2");
			String from_zipcode=request.getParameter("from_Zipcode");
			String from_Email=request.getParameter("from_Email");
			String from_Country=request.getParameter("from_Country");
			
			String radio=request.getParameter("radio");
			
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection(url+dbName, "root","1415");
			String sql = "update Shipment_Creation set Item='"+ Item +"', No_of_packages='"+No_of_packages+"', Packaging_type='"+Packaging_type+"', "
					+ "Package_Declared_Value='"+Package_Declared_Value+"', SCity='"+SCity+"', DCity='"+DCity+"', to_Company_or_name='"+Company_or_name+"',"
					+ "to_Address_line1='"+Address_line1+"', to_Contact='"+Contact+"', to_Address_line2='"+Address_line2+"', to_zipcode='"+zipcode+"',"
					+ "to_Email='"+Email+"', to_Country='"+Country+"', from_Company_or_name='"+from_Company_or_name+"', from_Contact='"+from_Contact+"',"
					+ "from_Address_line1='"+from_Address_line1+"', from_Address_line2= '"+from_Address_line2+"', from_zipcode='"+from_zipcode+"',"
							+ "from_Email='"+from_Email+"',from_Country='"+from_Country+"',radio='"+radio+"' where TrackingID='"+Tracking_ID+"'";
			
			
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			
			RequestDispatcher RequetsDispatcherObj1 =request.getRequestDispatcher("/agenthome2.jsp");
	    	RequetsDispatcherObj1.forward(request, response);
			
		
		}		
		catch (Exception e) { 
			pw.println(e);
		}
		
	}

}

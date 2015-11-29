<%@ page import="java.io.IOException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.sql.Statement" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		PrintWriter pw = response.getWriter();	
		//pw.println("connecting");
		Connection Conn=null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "world"; 
		String driver = "com.mysql.jdbc.Driver";
		String Item="";
		String No_of_Packages="";
		String Packaging_type="";
		String Package_Declared_Value="";
		String SCity="";
		String DCity="";
		String to_Company_or_name="";
		String to_Contact="";
		String to_Address_line1="";
		String to_Address_line2="";
		String to_zipcode="";
		String to_Email="";
		String to_Country="";
		String from_Company_or_name="";
		String from_Contact="";
		String from_Address_line1="";
		String from_Address_line2="";
		String from_zipcode="";
		String from_Country="";
		String from_Email="";
		String radio="";
		String Tracking_ID=request.getParameter("TrackingNo");
		try {
			Class.forName(driver).newInstance();
			
			request.setAttribute("Tracking_ID", Tracking_ID);
			pw.println(Tracking_ID);
			Conn=DriverManager.getConnection(url+dbName, "root","1415");	
			
			String sql= "select * from Shipment_Creation where TrackingID='"+Tracking_ID+"'";
			//pw.println(sql);
			Statement st = Conn.createStatement();
			st.executeQuery(sql);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
			int TrackID = rs.getInt("TrackingID");	
			 Item=rs.getString("Item");
			 No_of_Packages=rs.getString("No_of_Packages");
			 Packaging_type=rs.getString("Packaging_type");
			 Package_Declared_Value=rs.getString("Package_Declared_Value");
			 SCity=rs.getString("SCity");
			 DCity=rs.getString("DCity");
			 to_Company_or_name=rs.getString("to_Company_or_name");
			 to_Address_line1=rs.getString("to_Address_line1");
			 to_Address_line2=rs.getString("to_Address_line2");
			 to_zipcode=rs.getString("to_zipcode");
			 to_Email=rs.getString("to_Email");
			 to_Country=rs.getString("to_Country");
			 to_Contact=rs.getString("to_Contact");
			 from_Company_or_name=rs.getString("from_Company_or_name");
			 from_Contact = rs.getString("from_Contact");
			 from_Address_line1 = rs.getString("from_Address_line1");
			 from_Address_line2 = rs.getString("from_Address_line2");
			 from_zipcode = rs.getString("from_zipcode");
			 from_Country = rs.getString("from_Country");
			 from_Email = rs.getString("from_Email");
			 radio = rs.getString("radio");
			 
		
				
			}}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			%>
<form   action="ModifyShipment" method="post"  onsubmit="return validateform()">
<input type="hidden" name="TrackingID" value="<%=Tracking_ID%>">
<u><h3>Begin Your Shipment</h3></u>
<u><h4>What are you Shipping?</h4></u>
<pre>Item                     <input type="text" name="Item" value="<%=Item%>"/><br>
No of Packages        	 <input type="number" name="NoofPackages" value="<%=No_of_Packages%>" min="0"/><br>
Packaging type        	 <select name="Packagingtype" value="<%=Packaging_type%>">
<option>package</option>
<option>Express Freight</option>
<option>Envelope</option>
</select><br>
Package Declared Value   <input type="number" name="PackageDeclaredValue" value="<%=Package_Declared_Value%>" min="0"/>in $<br></pre>


<u><h4>Where is this shipment going?</h4></u>
<pre>Company or Name 	 <input type="text" name="CompanyorName" value="<%=to_Company_or_name%>"/><br>
Contact 		 <input type="number" name="Contact"  value="<%=to_Contact%>" min="0"/><br>
Country 		 <select name="Country" value="<%=to_Country%>">
<option value="">Country...</option>
<option value="United States">United states</option></select><br>
D.City 			 <select name="Dcity"/><br>
<option value="">City</option>
<option value="Northborough MA">Northborough MA</option>
<option value="Edison NJ">Edison NJ</option>
<option value="Allentown PA">Allentown PA</option>
<option value="Martinsburg WV">Martinsburg WV</option>
<option value="Charlotte NC">Charlotte NC</option>
<option value="Atlanta GA">Atlanta GA</option>
<option value="Orlando FL">Orlando FL</option>
<option value="Memphis TN">Memphis TN</option>
<option value="Grove City OH">Grove City OH</option>
<option value="Baltimore MD">Baltimore MD</option>
<option value="Indianapolis IN">Indianapolis IN</option>
<option value="Detroit MI">Detroit MI</option>
<option value="New Berlin WI">New Berlin WI</option>
<option value="Minneapolis MN">Minneapolis MN</option>
<option value="St. Louis MO">St. Louis MO</option>
<option value="Kansas KS">Kansas KS</option>
<option value="Dallas TX">Dallas TX</option>
<option value="Houston TX">Houston TX</option>
<option value="Denver CO">Denver CO</option>
<option value="Salt Lake City U">Salt Lake City U</option>
<option value="Phoenix AZ">Phoenix AZ</option>
<option value="Los Angeles CA">Los Angeles CA</option>
<option value="Chino CA">Chino CA</option>
<option value="Sacramento CA">Sacramento CA</option>
<option value="Seattle WA">Seattle WA</option></select>

Address line1 	         <input type="text" name="Addressline1" value="<%=to_Address_line1%>"/><br>
Address line2 	         <input type="text" name="Addressline2" value="<%=to_Address_line2%>"/><br>
Zip code 		 <input type="number" name="Zipcode" value="<%=to_zipcode%>" min="0"/><br>
Email 			 <input type="text" name="Email" value="<%=to_Email%>"/><br></pre>


<u><h4>Where is this shipment coming from?</h4></u>
<pre>Company or Name 	 <input type="text" name="from_CompanyorName" value="<%=from_Company_or_name%>"/><br>
Contact 		 <input type="number" name="from_Contact" value="<%=from_Contact%>" min="0"/><br>
Country 		 <select name="from_Country" value="<%=from_Country%>">
<option value="">Country...</option>
<option value="United States">United states</option></select><br>
S.City 			 <select name="Scity" value="<%=SCity%>"/><br>
<option value="">City</option>
<option value="Northborough MA">Northborough MA</option>
<option value="Edison NJ">Edison NJ</option>
<option value="Allentown PA">Allentown PA</option>
<option value="Martinsburg WV">Martinsburg WV</option>
<option value="Charlotte NC">Charlotte NC</option>
<option value="Atlanta GA">Atlanta GA</option>
<option value="Orlando FL">Orlando FL</option>
<option value="Memphis TN">Memphis TN</option>
<option value="Grove City OH">Grove City OH</option>
<option value="Baltimore MD">Baltimore MD</option>
<option value="Indianapolis IN">Indianapolis IN</option>
<option value="Detroit MI">Detroit MI</option>
<option value="New Berlin WI">New Berlin WI</option>
<option value="Minneapolis MN">Minneapolis MN</option>
<option value="St. Louis MO">St. Louis MO</option>
<option value="Kansas KS">Kansas KS</option>
<option value="Dallas TX">Dallas TX</option>
<option value="Houston TX">Houston TX</option>
<option value="Denver CO">Denver CO</option>
<option value="Salt Lake City U">Salt Lake City U</option>
<option value="Phoenix AZ">Phoenix AZ</option>
<option value="Los Angeles CA">Los Angeles CA</option>
<option value="Chino CA">Chino CA</option>
<option value="Sacramento CA">Sacramento CA</option>
<option value="Seattle WA">Seattle WA</option></select>

Address line1 	         <input type="text" name="from_Addressline1" value="<%=from_Address_line1%>"/><br>
Address line2 	         <input type="text" name="from_Addressline2" value="<%=from_Address_line2%>"/><br>
Zip code 		 <input type="number" name="from_Zipcode" value="<%=from_zipcode%>" min="0"/><br>
Email 			 <input type="text" name="from_Email" value="<%=from_Email%>"/><br></pre>

<u><h4>How do you want us to collect your shipment?</h4></u>
<input type="radio" name="radio" value="Pickup"/>Pick up from your above address
<input type="radio" name="radio" value="Dropoff"/>Drop off at nearest location
<br><br>
<input type="submit" value="submit"/>
<input type="button" value="Cancel" onclick="window.location='userhome3.jsp'"/>
<input type="reset" value="Reset"/>


</form>
</body>
</html>
</body>
</html>
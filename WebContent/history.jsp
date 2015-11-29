<%@ page import="java.sql.*" %>
<%@ page import="com.gen.serve.dbconnection" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authorize Requests</title>
</head>
<body>
<%
String name=session.getAttribute("name").toString();
session.setAttribute("name", name);
%>
<input type="button" value="logout" style="float:right"onclick="window.location='home.jsp'">

<center>
<br><br><br>
Valued Customer!!<br>Here are Your Previous Requests
<br><br><br>
<table border="2">
<tr>
<td><center>TrackingID</center></td>
<td><center>Item</center></td>
<td><center>From</center></td>
<td><center>City</center></td>
<td><center>To</center></td>
<td><center>City</center></td>
<td><center>Status</center></td>
</tr>
<%
String query="select TrackingID,Item,from_Contact,SCity,to_Contact,DCity,status from shipment_creation where username='"+name+"'";
//query="select TrackingID,Item,from_Contact,SCity,to_Contact,DCity,status from shipment_creation";
Connection conn=dbconnection.dbconnectionmethod();
Statement stmt=conn.createStatement();
String[] ckarray=new String[100];
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{
%>
    <tr><td><center><%=rs.getInt("TrackingID")%></center></td>
    <td><center><%=rs.getString("Item")%></center></td>
    <td><center><%=rs.getString("from_Contact")%></center></td>
    <td><center><%=rs.getString("SCity")%></center></td>
    <td><center><%=rs.getString("to_Contact")%></center></td>
    <td><center><%=rs.getString("DCity")%></center></td>
    <td><center><%=rs.getString("status")%></center></td>
    </tr>
        <%
}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
%>


<input type="button" value="Back" onclick="window.location='agenthome1.jsp'"/>

</center>
</body>
</html> 
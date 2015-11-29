<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EnterTrackingNo</title>
</head>
<body bgcolor="green">
<script>
function shipmentdetails(){
	var TrackingNo=document.Editshipment.TrackingNo.value;
if(TrackingNo==null||TrackingNo == ""){
	alert("please enter Tracking no")
	return false;
}
else 
	return true;
}

</script>
<form action="Dispatch_to_modifyshipment" method="post" name="Editshipment" onsubmit="return shipmentdetails()">

<%

String id = session.getAttribute("name").toString();
session.setAttribute("name", id);

%>

<br>
<br>
<center><h4>EnterTrackingNo<input type="text" name="TrackingNo"/></h4> <br></center> 
<p style="text-indent:39em;"><button type="submit" value="edit" >EditShipment</button>
<button type="button" onclick="window.location='agenthome2.jsp'">Cancel</button></p>

</form>
</body>
</html>
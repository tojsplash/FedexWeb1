<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create shipment</title>
</head>
<body bgcolor="green">
<form>
<u><h3>Begin Your Shipment</h3></u>  
<u><h4>What are you Shipping?</h4></u>
<pre>Item                     <input type="text"/><br>
No of Packages        	 <input type="number" name="No of Packages" min="0"/><br>
Packaging type        	 <select name="Item1">
<option>package</option>
<option>Express Freight</option>
<option>Envelope</option>
</select><br>
Package Declared Value   <input type="number" name="Package Declared Value" min="0"/>in $<br></pre>

<u><h4>Where is this shipment going?</h4></u>
<pre>Company or Name 	 <input type="text"/><br>
Contact 		 <input type="number" name="contact" min="0"/><br>
Country 		 <select name="country">
<option value="">Country...</option>
<option value="United States">United states</option></select><br>
State 			 <select name="State">
<option value="">State</option>
<option value="North Carolina">North Carolina</option></select><br>
City 			 <input type="text" /><br>
Address line1 	         <input type="text" /><br>
Address line2 	         <input type="text" /><br>
Zip code 		 <input type="text" /><br>
Email 			 <input type="text" /><br></pre>

<u><h4>Where is this shipment coming from?</h4></u>
<pre>Company or Name 	 <input type="text"/><br>
Contact 		 <input type="number" name="contact" min="0"/><br>
Country 		 <select name="country">
<option value="">Country...</option>
<option value="United States">United states</option></select><br>
State 			 <select name="State">
<option value="">State</option>
<option value="North Carolina">North Carolina</option></select><br>
City 			 <input type="text" /><br>
Address line1 	         <input type="text" /><br>
Address line2 	         <input type="text" /><br>
Zip code 		 <input type="text" /><br>
Email 			 <input type="text" /><br></pre>

<u><h4>How do you want us to collect your shipment?</h4></u>
<input type="radio" name="Pick up from your above address" value="From Address"/>Pick up from your above address
<input type="radio" name="Drop off at nearest location" value="Drop Off"/>Drop off at nearest location
<br><br>
<input type="submit" value="submit"/>
<input type="button" value="Cancel" onclick="window.location='userhome.jsp'"/>
<input type="reset" value="Reset"/>
</form>
</body>
</html>

package com.gen.serve;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.TestCase;
public class Package_CreationTest extends TestCase {

	public void test_type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertNotNull(Package_Creation.class);
	}

	public void test_instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		Package_Creation target = new Package_Creation();
		assertNotNull(target);
	}

	
	public void test_doPost_A$HttpServletRequest$HttpServletRespose_T$IOException() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("(*&(9879834");
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}

	public void test_doPost_A$HttpServletRequest$HttpServletResponse_T$IOExcepton() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("#$#$#%#$"); 
 		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}

	
	public void test_doPost_A$HttpServletRequest$HttpSrvletResponse_T$IOException() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("122"); 
        when(request.getParameter("Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("Contact")).thenReturn("1122332211"); 
        when(request.getParameter("Address_line1")).thenReturn("hello"); 
        when(request.getParameter("Address_line2")).thenReturn("hello"); 
        when(request.getParameter("zipcode")).thenReturn("112112"); 				
        when(request.getParameter("Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("Country")).thenReturn(""); 
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}

	
	
	public void test_doPost_A$HttpServletRequest$HttpServletResponse_T$IOExcetion() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("122"); 
        when(request.getParameter("Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("Contact")).thenReturn("1122332211"); 
        when(request.getParameter("Address_line1")).thenReturn("hello"); 
        when(request.getParameter("Address_line2")).thenReturn("hello"); 
        when(request.getParameter("zipcode")).thenReturn("112112"); 				
        when(request.getParameter("Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("Country")).thenReturn("hello"); 
        when(request.getParameter("State")).thenReturn("hello"); 
        when(request.getParameter("from_Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("from_Contact")).thenReturn("1100229933"); 
        when(request.getParameter("from_Address_line1")).thenReturn(""); 
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}

	
	
	public void test_doPost_A$HttpServletRequest$HtpServletResponse_T$IOException() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("122"); 
        when(request.getParameter("Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("Contact")).thenReturn("1122332211"); 
        when(request.getParameter("Address_line1")).thenReturn("hello"); 
        when(request.getParameter("Address_line2")).thenReturn("hello"); 
        when(request.getParameter("zipcode")).thenReturn("112112"); 				
        when(request.getParameter("Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("Country")).thenReturn("hello"); 
        when(request.getParameter("State")).thenReturn("hello"); 
        when(request.getParameter("from_Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("from_Contact")).thenReturn("1100229933"); 
        when(request.getParameter("from_Address_line1")).thenReturn("hello"); 
        when(request.getParameter("from_Address_line2")).thenReturn("hello"); 
        when(request.getParameter("from_zipcode")).thenReturn("hello"); 
        when(request.getParameter("from_Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("from_Country")).thenReturn(""); 
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}

	
	
	public void test_doPost_A$HttpServletRequest$HttpServltResponse_T$IOException() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("122"); 
        when(request.getParameter("Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("Contact")).thenReturn("1122332211"); 
        when(request.getParameter("Address_line1")).thenReturn("hello"); 
        when(request.getParameter("Address_line2")).thenReturn("hello"); 
        when(request.getParameter("zipcode")).thenReturn("112112"); 				
        when(request.getParameter("Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("Country")).thenReturn("hello"); 
        when(request.getParameter("State")).thenReturn("hello"); 
        when(request.getParameter("from_Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("from_Contact")).thenReturn("1100229933"); 
        when(request.getParameter("from_Address_line1")).thenReturn("hello"); 
        when(request.getParameter("from_Address_line2")).thenReturn("hello"); 
        when(request.getParameter("from_zipcode")).thenReturn("hello"); 
        when(request.getParameter("from_Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("from_Country")).thenReturn("hello"); 
        when(request.getParameter("from_State")).thenReturn(""); 
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}

	
	
	
	
	public void test_doPost_A$HttpServletRequest$HttpSevletResponse_T$IOException() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("122"); 
        when(request.getParameter("Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("Contact")).thenReturn("1122332211"); 
        when(request.getParameter("Address_line1")).thenReturn("hello"); 
        when(request.getParameter("Address_line2")).thenReturn("hello"); 
        when(request.getParameter("zipcode")).thenReturn("112112"); 				
        when(request.getParameter("Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("Country")).thenReturn("hello"); 
        when(request.getParameter("State")).thenReturn("hello"); 
        when(request.getParameter("from_Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("from_Contact")).thenReturn("1100229933"); 
        when(request.getParameter("from_Address_line1")).thenReturn("hello"); 
        when(request.getParameter("from_Address_line2")).thenReturn("hello"); 
        when(request.getParameter("from_zipcode")).thenReturn("hello"); 
        when(request.getParameter("from_Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("from_Country")).thenReturn("hello"); 
        when(request.getParameter("from_State")).thenReturn("hello"); 
        when(request.getParameter("radio")).thenReturn(""); 
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}
	
	public void test_doPost_A$HttpServletRequest$HttpServletResponse_T$IOException() throws Exception {
		
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    
        when(request.getParameter("Item")).thenReturn("hello");
        when(request.getParameter("No_of_packages")).thenReturn("2"); 
        when(request.getParameter("Package_Declared_Value ")).thenReturn("122"); 
        when(request.getParameter("Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("Contact")).thenReturn("1122332211"); 
        when(request.getParameter("Address_line1")).thenReturn("hello"); 
        when(request.getParameter("Address_line2")).thenReturn("hello"); 
        when(request.getParameter("zipcode")).thenReturn("112112"); 				
        when(request.getParameter("Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("Country")).thenReturn("hello"); 
        when(request.getParameter("State")).thenReturn("hello"); 
        when(request.getParameter("from_Company_or_name")).thenReturn("hello"); 
        when(request.getParameter("from_Contact")).thenReturn("1100229933"); 
        when(request.getParameter("from_Address_line1")).thenReturn("hello"); 
        when(request.getParameter("from_Address_line2")).thenReturn("hello"); 
        when(request.getParameter("from_zipcode")).thenReturn("hello"); 
        when(request.getParameter("from_Email")).thenReturn("hello@mmm.com"); 
        when(request.getParameter("from_Country")).thenReturn("hello"); 
        when(request.getParameter("from_State")).thenReturn("hello"); 
        when(request.getParameter("radio")).thenReturn("hello"); 
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);
		Package_Creation target = new Package_Creation();
		try {
			target.doPost(request, response);
		} catch (ServletException e) {
			fail("UnExpected exception was thrown!");
		}
	}
}
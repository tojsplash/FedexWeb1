package com.gen.serve;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.TestCase;

public class ValidateuserTest extends TestCase {

	public void test_type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertNotNull(Validateuser.class);
	}

	public void test_instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		Validateuser target = new Validateuser();
		assertNotNull(target);
	}

	public void test_doGet_A$HttpServletRequest$HttpServletResponse() throws Exception {
		// TODO auto-generated by JUnit Helper.
		Validateuser target = new Validateuser();
		HttpServletRequest request = null;
		HttpServletResponse response = null;
		target.doGet(request, response);
	}

	public void test_doGet_A$HttpServletRequest$HttpServletResponse_T$ServletException() throws Exception {
		// TODO auto-generated by JUnit Helper.
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("password")).thenReturn("hello");
        when(request.getParameter("username")).thenReturn("hello");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
		Validateuser target = new Validateuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}

	public void test_doPost_A$HttpServletRequest$HttpServletResponse() throws Exception {
		// TODO auto-generated by JUnit Helper.
		
		
		HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    

        when(request.getParameter("passwd")).thenReturn("");
        when(request.getParameter("username")).thenReturn("");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
		Validateuser target = new Validateuser();
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

        when(request.getParameter("password")).thenReturn("h1e2l3l4o");
        when(request.getParameter("username")).thenReturn("hello");
        PrintWriter writer = new PrintWriter("somefile.txt");
        when(response.getWriter()).thenReturn(writer);
		Validateuser target = new Validateuser();
		try {
    		target.doPost(request, response);
	    } catch (ServletException e) {
	    	fail("UnExpected exception was thrown!");
	    }
	}

}

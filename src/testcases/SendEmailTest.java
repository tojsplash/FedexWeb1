package testcases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.gen.serve.SendEmail;

import junit.framework.TestCase;

public class SendEmailTest extends TestCase {

	public void test_type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertNotNull(SendEmail.class);
	}

	public void test_instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		SendEmail target = new SendEmail();
		assertNotNull(target);
	}

	public void test_main_A$String() throws Exception {
		// TODO auto-generated by JUnit Helper.
		try {
			SendEmail.main(null);
		} catch (Exception e) {
			assert(false);
		}

	}
}

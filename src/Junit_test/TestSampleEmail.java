package Junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSampleEmail {
	@Test
	public void testEmailID() {
		SampleEmail rv = new SampleEmail();
// Valid email-ID
		assertEquals("abc@yahoo.com", rv.valid_Invalid_emailID("abc@yahoo.com"));
		assertEquals("abc@yahoo.com", rv.valid_Invalid_emailID("abc@yahoo.com"));
		assertEquals("abc-100@yahoo.com", rv.valid_Invalid_emailID("abc-100@yahoo.com"));
		assertEquals("abc.100@yahoo.com", rv.valid_Invalid_emailID("abc.100@yahoo.com"));
		assertEquals("abc111@abc.com", rv.valid_Invalid_emailID("abc111@abc.com"));
		assertEquals("abc-100@abc.net", rv.valid_Invalid_emailID("abc-100@abc.net"));
		assertEquals("abc.100@abc.com.au", rv.valid_Invalid_emailID("abc.100@abc.com.au"));
		assertEquals("abc@1.com", rv.valid_Invalid_emailID("abc@1.com"));
		assertEquals("abc@gmail.com.com", rv.valid_Invalid_emailID("abc@gmail.com.com"));
		assertEquals("abc+100@gmail.com", rv.valid_Invalid_emailID("abc+100@gmail.com"));
// Invalid email-ID	
		assertEquals("abc",rv.valid_Invalid_emailID("abc"));
		assertEquals("abc@.com.my",rv.valid_Invalid_emailID("abc@.com.my"));
		assertEquals("abc123@gmail.a",rv.valid_Invalid_emailID("abc123@gmail.a"));
		assertEquals("abc123@.com",rv.valid_Invalid_emailID("abc123@.com"));
		assertEquals( "abc123@.com.com",rv.valid_Invalid_emailID( "abc123@.com.com"));
		assertEquals(".abc@abc.com",rv.valid_Invalid_emailID(".abc@abc.com"));
		assertEquals("abc()*@gmail.com",rv.valid_Invalid_emailID("abc()*@gmail.com"));
		assertEquals("abc@%*.com",rv.valid_Invalid_emailID("abc@%*.com"));
		assertEquals("abc..2002@gmail.com",rv.valid_Invalid_emailID("abc..2002@gmail.com"));
		assertEquals("abc.@gmail.com",rv.valid_Invalid_emailID("abc.@gmail.com"));
		assertEquals("abc@abc@gmail.com",rv.valid_Invalid_emailID("abc@abc@gmail.com"));
		assertEquals("abc@gmail.com.1a",rv.valid_Invalid_emailID("abc@gmail.com.1a"));
		assertEquals("abc@gmail.com.aa.au",rv.valid_Invalid_emailID("abc@gmail.com.aa.au"));
	}
}
package Junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSampleEmail {
	@Test
	public void testEmailID() throws CustomException {
		SampleEmail rv = new SampleEmail();
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
	}

	@Test
	public void testEmailIDName_Exception() throws CustomException {
		try {
			SampleEmail rv = new SampleEmail();
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
		} catch (CustomException ex) {
			assertEquals("abc@yahoo.com", ex.getMessage());
			assertEquals("abc@yahoo.com", ex.getMessage());
			assertEquals("abc-100@yahoo.com", ex.getMessage());
			assertEquals("abc.100@yahoo.com", ex.getMessage());
			assertEquals("abc111@abc.com", ex.getMessage());
			assertEquals("abc-100@abc.net", ex.getMessage());
			assertEquals("abc.100@abc.com.au", ex.getMessage());
			assertEquals("abc@1.com", ex.getMessage());
			assertEquals("abc@gmail.com.com", ex.getMessage());
			assertEquals("abc+100@gmail.com", ex.getMessage());
		}
	}
}
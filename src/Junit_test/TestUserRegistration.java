package Junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserRegistration {
	@Test
	public void testFirstName() throws CustomException {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("Praveen", rv1.firstname("Praveen"));
	}

	@Test
	public void testFirstName_Exception() throws CustomException {
		try {
			UserRegistration rv1 = new UserRegistration();
			assertEquals("Praveen", rv1.firstname("Praveen"));
		} catch (CustomException ex) {
			assertEquals("Praveen", ex.getMessage());
		}
	}

	@Test
	public void testLastName() throws CustomException {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("Kumar", rv1.lastname("Kumar"));
	}

	@Test
	public void testLastName_Exception() throws CustomException {
		try {
			UserRegistration rv1 = new UserRegistration();
			assertEquals("Kumar", rv1.lastname("Kumar"));
		} catch (CustomException ex) {
			assertEquals("Kumar", ex.getMessage());
		}
	}

	@Test
	public void testemailID() throws CustomException {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("abc.XYZ@bl.co.in", rv1.validEmail("abc.XYZ@bl.co.in"));
	}

	@Test
	public void testemailID_Exception() throws CustomException {
		try {
			UserRegistration rv1 = new UserRegistration();
			assertEquals("abc.XYZ@bl.co.in", rv1.validEmail("abc.XYZ@bl.co.in"));
		} catch (CustomException ex) {
			assertEquals("abc.XYZ@bl.co.in", ex.getMessage());
		}
	}

	@Test
	public void testMobileNumber() throws CustomException {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("+1 (212) 555-3456", rv1.preDefinedMobileFormat("+1 (212) 555-3456"));
	}

	@Test
	public void testMobileNumber_Exception() throws CustomException {
		try {
			UserRegistration rv1 = new UserRegistration();
			assertEquals("+1 (212) 555-3456", rv1.preDefinedMobileFormat("+1 (212) 555-3456"));
		} catch (CustomException ex) {
			assertEquals("+1 (212) 555-3456", ex.getMessage());
		}
	}

	@Test
	public void testPassword() throws CustomException {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("PraveenPKE@97", rv1.min_8_char("PraveenPKE@97"));
	}

	public void testPassword_Exception() throws CustomException {
		try {
			UserRegistration rv1 = new UserRegistration();
			assertEquals("PraveenPKE@97", rv1.min_8_char("PraveenPKE@97"));
		} catch (CustomException ex) {
			assertEquals("PraveenPKE@97", ex.getMessage());
		}
	}
}
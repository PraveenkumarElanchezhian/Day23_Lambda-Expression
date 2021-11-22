package Junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserRegistration {
	@Test
	public void testFirstName() {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("Praveen", rv1.firstname("Praveen"));
	}
	@Test
	public void testLastName() {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("Kumar", rv1.lastname("Kumar"));
	}
	@Test
	public void testemailID() {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("abc.XYZ@bl.co.in", rv1.validEmail("abc.XYZ@bl.co.in"));
	}
	@Test
	public void testMobileNumber() {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("91 9544663377", rv1.preDefinedMobileFormat("91 9544663377"));
	}
	@Test
	public void testPassword() {
		UserRegistration rv1 = new UserRegistration();
		assertEquals("PraveenPKE@97", rv1.min_8_char("PraveenPKE@97"));
	}
}

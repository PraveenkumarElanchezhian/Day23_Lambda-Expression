package Junit_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

	}

	public String firstname(String firstName) {
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		Matcher matcher = p.matcher(firstName);
		if (matcher.find()) {
			return firstName;
		} else {
			return "Invalid Character";
		}

	}

	public String lastname(String lastName) {
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		Matcher matcher = p.matcher(lastName);
		if (matcher.find()) {
			return lastName;
		} else {
			return "Invalid Character";
		}
	}

	public String validEmail(String email) {
		String regex = ("^(.+)@(.+)$");
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()) {
			return email;
		} else {
			return "Invalid email";
		}
	}

	public String preDefinedMobileFormat(String mobileNumber) {
		Pattern pattern = Pattern.compile("[1-9]{2}[ \\S\\s]{1}+[1-9]*]");
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.find()) {
			return mobileNumber;
		} else {
			return "Invalid Mobile format";
		}
	}

	public String min_8_char(String password) {
		Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
		Matcher matcher = pattern.matcher(password);
		if (matcher.find()) {
			return password;
		} else {
			return "Invalid Password";
		}
	}
}
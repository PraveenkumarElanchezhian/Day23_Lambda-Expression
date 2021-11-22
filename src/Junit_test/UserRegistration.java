package Junit_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

	}

	public String firstname(String firstName) throws CustomException {
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		Matcher matcher = p.matcher(firstName);
		if (matcher.find()) {
			return firstName;
		} else {
			throw new CustomException("Invalid firstName");
		}

	}

	public String lastname(String lastName) throws CustomException {
		Pattern p = Pattern.compile("\\b([A-Z]\\w*)\\b");
		Matcher matcher = p.matcher(lastName);
		if (matcher.find()) {
			return lastName;
		} else {
			throw new CustomException("Invalid lastName");
		}
	}

	public String validEmail(String email) throws CustomException {
		String regex = ("^(.+)@(.+)$");
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()) {
			return email;
		} else {
			throw new CustomException("Invalid email");
		}
	}

	public String preDefinedMobileFormat(String mobileNumber) throws CustomException {
		Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.find()) {
			return mobileNumber;
		} else {
			throw new CustomException("Invalid Mobile format");
		}
	}

	public String min_8_char(String password) throws CustomException {
		Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
		Matcher matcher = pattern.matcher(password);
		if (matcher.find()) {
			return password;
		} else {
			throw new CustomException("Invalid Password");
		}
	}
}
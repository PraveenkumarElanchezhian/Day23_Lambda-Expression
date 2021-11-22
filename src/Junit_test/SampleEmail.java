package Junit_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmail {

	public String valid_Invalid_emailID(String emails) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
		Matcher matcher = pattern.matcher(emails);
		if (matcher.find()) {
			return emails;
		} else {
			return "Invalid email-ID";
		}
	}

	public static void main(String[] args) {

	}

}

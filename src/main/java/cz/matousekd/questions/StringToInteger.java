package cz.matousekd.questions;

/**
 * Created by David.Matousek on 26.8.2015.
 */
public class StringToInteger {

	public static String number = "12345";

	public static void main(String[] args) {

		int value = 0;
		int zeroAscii = (int) '0';
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			int num = (int) ch - zeroAscii;
			value += num;
			if (i != number.length() - 1) {
				value *= 10;
			}
		}
		System.out.println("Result is: " + value);

	}
}

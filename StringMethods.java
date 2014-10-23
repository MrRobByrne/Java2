import java.io.*;

class StringMethods {
	public static void main (String[] args) {
		String s1 = new String ("abc");
		String s2 = new String ("de");
		String s3 = s1.concat(s2);
		String s4 = s3.substring(2);
		String s5 = s3.substring(0,2);
	System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);
	}
}
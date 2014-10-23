import java.io.*;

class Palendrome {
	public static void main (String [] args) {
		String r = reverse (args[0]);
		if (args[0].equals(r))
			System.out.println("Palendrome");
		else
			System.out.println("Not a Palendrome");
		System.out.println (args[0] + " " + r);
		}
	public static String reverse (String s) { //prototype
		char [] c = new char [s.length()];
		for (int i=0; i<s.length(); i++) {
			c[i] = s.charAt(s.length()-i-1);// s.length=3, i=0 :: 3-0-1 
			}
	return new String (c);
	}
}

//remember that there is no string arg to reverse, so you must type java Reverse "xyz" or anything you want to reverse.

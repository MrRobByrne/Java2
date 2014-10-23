import java.io.*;

class StringBufferMethods {
	public static void main (String[] args) {
		StringBuffer sb = new StringBuffer();
		char c = 'a';
		int n = 10;
		double d = 2.25;
		boolean b = true;
		char [] ca = {'a','b','c'};
		String s = new String("word");
		sb.append(c); // a
		sb.append(n); // a10
		sb.append(d); // a102.25
		sb.append(b); // a102.25true
		sb.append(ca); // a102.25trueabc
		sb.append(s); // a102.25trueabcword
		System.out.println(sb);
		sb.insert(0, 'x');
		System.out.println(sb);
		}
}
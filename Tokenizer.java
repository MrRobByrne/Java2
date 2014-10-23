import java.io.*;
import java.util.*;

class Tokenizer {
	public static void main (String[] args) throws IOException {
		File f = new File (args[0]);
		String s = readFile(f);
		tokenize(s);
		}
	public static String readFile(File f) throws IOException {
		FileReader in = new FileReader(f);
		int size = (int)f.length();
		char[] data = new char [size];
		in.read(data,0,size);
		in.close();
		return new String(data);
		}
	public static void tokenize(String s) {
		StringTokenizer st = new StringTokenizer(s);
		int i = 1;
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println("Token " + i + ";" + temp);
			i++;
		}
	}
}
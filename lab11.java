import java.io.*;
import java.util.*;
class lab11{

public static void main(String[] args){
   int a = new int[1000];

init(a);
findPrimes(a);
printPrimes(a);
}

public static void init([]a){


}

public static void findPrimes([] a){  //should find prime
	int UBsquareroot = int Math.sqrt(UB);
	boolean[] isComposite = new boolean[UB+1];
	for(int i=2; i<=UBsquareroot; i++){
	if(!isComposite[i]){
	system.out.print(i + " ");
	for (int a = i*i; a<=UB; a+=i)
	isComposite[a]=true;
}
}
	for(int i = UBsquareroot; i<=UB; i++)
	if(!isComposite[i]
	System.out.print(i + " ");
}
public static void printPrimes([]a){  //not done
for(int i=0; i<a.length; i++);


}

}
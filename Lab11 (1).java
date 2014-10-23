class Lab11{
	public static void main(String[]args){
		int[] a = new int[1000];
		init(a);
		findPrimes(a);
		printPrimes(a);
	}
	public static void init(int[] a){
	for (int z = 0; z < a.length; z++)
  	 a[z] = 1;
	}
	public static void findPrimes(int[] a){
	for ( int i = 1; i < a.length; i++ )
        if ( a[i] == 1 && i != 1 )
        	for (int j = i; j < a.length; j++)
        	if (j%i == 0 && j!=i)
        	a[j] = 0;
	}
	public static void printPrimes(int[] a){
	for (int n = 2; n < a.length; n++)
	if(a[n]== 1)
		System.out.print(n +" ");
	}
}

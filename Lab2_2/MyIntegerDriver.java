// Driver class for the MyInteger file
class MyIntegerDriver
{
	public static void main (String args[])
	{
	MyInteger number1 = new MyInteger(1);
	MyInteger number2 = new MyInteger(7);
	MyInteger number3 = new MyInteger(49);
	MyInteger number4 = new MyInteger(496);

	System.out.println(number1);
	    number1.print();
	System.out.println(number2);
	    number2.print();
	System.out.println(number3);
	    number3.print();
	System.out.println(number4);
	    number4.print();
	}
}
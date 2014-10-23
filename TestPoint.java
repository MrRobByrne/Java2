class TestPoint {
	public static void main (String []args) {
		Point p = new Point ();//0,0
		Point q = new Point (3,4);//3,4
		System.out.println(p);
		System.out.println(q);
		p.move(2,2);//to move or change the point
		q.move(5,5);
		System.out.println(p);
		System.out.println(q);
		
	if(p.equals(q))
		System.out.println("Same point");
	else
		System.out.println("Diffrent points");
	}
}
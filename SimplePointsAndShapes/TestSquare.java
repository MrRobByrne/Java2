class TestSquare {
	public static void main (String[] args) {
		Point p = new Point (3,4);
		Square s = new Square (5,p);
		System.out.println (s);
		s.move (1,2);
		System.out.println ("Area: " + s.area());
		System.out.println (s.perimeter());
		System.out.println(s.diagonal());
	}
}
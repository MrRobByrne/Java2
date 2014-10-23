class Square extends Rect {
	private int side;
	
	public Square (int side, Point origin) {
		super (side, side, origin);  //call to Rects constructer
		this.side = side;
	}

	public int area () {
		return side * side;
	}

	public int perimeter () {
		return 4 * side;
	}

	public double diagonal () {
		return Math.sqrt(2 * side * side);
	}
}
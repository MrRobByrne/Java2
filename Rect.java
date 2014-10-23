class Rect {
	protected int width, height;
	protected Point origin;
	
	public Rect (int width, int height, Point origin) {
		this.width = width;
		this.height = height;
		this.origin = origin;
	}

	public void move (int x, int y) {
		origin.move (x, y);
		}

	public int area () {
		return width * height;
	}
	
	public String toString () {
		return origin.toString () + "Width: " + width + "Height: " + height;
	}
}
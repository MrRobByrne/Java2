class Point {
	private int x,y; //private-a member access specifier: private fields and methods are accessable, modifiable only within the class.
	public Point () {
		x=y=0;
	}
	public Point (int x, int y) {
		this.x=x; //use this to acces from within the method
		this.y=y;
	}
	public void move (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "x: " + x + " y: " + y; //shows points instead of memory adresses

	}
	public boolean equals (Point p) {
		if(this.x == p.x && this.y == p.y) //only exception where you can access x outside
			return true;
		else
			return false;
	}
}

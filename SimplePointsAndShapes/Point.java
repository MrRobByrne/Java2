// Simple Point class is a 2D point class
// @Params

class Point 
{
	private int x,y; //private-a member access specifier: private fields and methods are accessable, modifiable only within the class.
	public Point () 
	{
		x=y=0;
	}

	// Point() creates a new point 
	public Point (int x, int y) 
	{
		this.x=x; //use this to acces from within the method
		this.y=y;
	}

	// move() moves the Points x and y coordinates to new values
	public void move (int x, int y) 
	{
		this.x=x;
		this.y=y;
	}

	// toString() returns the points x and y coordinates as a string
	public String toString() 
	{
		return "x: " + x + " y: " + y; //shows points instead of memory adresses

	}

	/* equals() method compares 2 Points to see if they are the same
	*  @Param Point P : this is the point to be compared
	*/
	public boolean equals(Point pCompare) 
	{
		if(this.x == pCompare.x && this.y == pCompare.y) //only exception where you can access x outside
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

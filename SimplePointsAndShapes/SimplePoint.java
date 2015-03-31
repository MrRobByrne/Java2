// SimplePoint class has a constructor SimplePoint(), move(), and toString()

class SimplePoint 
{
	private int x;
	private int y;

  	public SimplePoint() 
    {
    	x = 0;
    	y = 0;
  	}

    // constructor SimplePoint() class
    // @Params int x, int y
  	public SimplePoint(int x, int y) 
    {
    	this.x = x;
    	this.y = y;
  	}

    // move() moves the selected points coordinates to new x and y points
    // @Params int m, int n ~ (x, y)
  	public void move(int m, int n) 
    {
    	x = m;
    	y = n;
  	}

    // toString()
    // returns string of the simple points coordinates
  	public String toString() 
    {
    	String s = "x: " + x + "\ty: " + y;
    	return s;
  	}
}

class Circle 
{

  private int radius;
  private SimplePoint center;

  public Circle() 
  {
    radius = 1;
    center = new SimplePoint(0,0);
  }

  public Circle(int radius) 
  {
    this.radius = radius;
  }

  public Circle(SimplePoint center) 
  {
    this.center = center;
  }

  public Circle(int radius, SimplePoint center) 
  {
    this.center = center;
    this.radius = radius;
  }

  public double area() 
  {
    return 3.14 * radius * radius;
  }

  public double circumference() 
  {
    return 3.14 * (2 * radius);
  } 

  public String toString() 
  {
    String s = center.toString().concat("\nradius: " + radius + "\ncenter: " + center);
    return s;
  }
}

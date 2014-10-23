/* Example 16
   Rectangle.java
   Example demonstrates the HasA relationship between objects.
*/

class Rectangle {
  private int width;
  private int height;
  private SimplePoint origin;

  public Rectangle() {
    width = height = 10;
    origin = new SimplePoint(0, 0);
  }

  public Rectangle(SimplePoint p) {
    width = height = 10;
    origin = p;
  }

  public Rectangle(int m, int n) {
    width = m;
    height = n;
    origin = new SimplePoint(0, 0);
  }

  public Rectangle(int m, int n, SimplePoint p) {
    width = m;
    height = n;
    origin = p;
  }

  public int area() {
    return width * height; 
  }

  public int perimeter() {
    return 2 * (width + height);
  }

  public double diagonal() {
    return Math.sqrt(width * width + height * height);
  }

  public String toString() {
    String s = origin.toString().concat("\nwidth: " + width +
               "\theight: " + height);
    return s;
  }

  public void print() {
    System.out.println("Area: " + area());
    System.out.println("Perimeter: " + area());
    System.out.println("Diagonal: " + diagonal());
  }
}



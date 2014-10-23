
class Circle {
  private int radius;
  private SimplePoint origin;

  public Circle(){
    radius = 0;
    origin = new SimplePoint(0, 0);
  }

  public Circle(SimplePoint p) {
    radius = 0;
    origin = p;
  }

  public Circle(int m){
    radius = m;
    origin = new SimplePoint(0, 0);
  }

  public Circle(int m, SimplePoint p){
    radius = m;
    origin = p;
  }

  public double area() {
    return Math.PI * Math.pow(radius,2);
  }

  public double circumference(){
    return Math.PI * radius * 2;
  }

  public String toString() {
    String s = origin.toString().concat("\rradius" + radius);
    return s;
  }

  public void print(){
    System.out.println("area" + area());
    System.out.println("circumference" + circumference());
  }
}


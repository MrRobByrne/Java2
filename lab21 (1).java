class lab21 {
  public static void main(String args[]) {
    SimplePoint p1 = new SimplePoint(1,1);
    SimplePoint p2 = new SimplePoint(2,2);
    Circle C1 = new Circle();
    Circle C2 = new Circle(420);
    Circle C3 = new Circle(p1);
    Circle C4 = new Circle(7,p2);

  System.out.println(C1);
    C1.print();
  System.out.println(C2);
    C2.print();
  System.out.println(C3);
    C3.print();
  System.out.println(C4);
    C4.print();
  }
}
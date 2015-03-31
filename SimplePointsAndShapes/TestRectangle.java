class TestRectangle {
  public static void main(String args[]) {
    SimplePoint p1 = new SimplePoint(1,1);
    SimplePoint p2 = new SimplePoint(2,2);
    Rectangle R1 = new Rectangle();
    Rectangle R2 = new Rectangle(3,4);
    Rectangle R3 = new Rectangle(p1);
    Rectangle R4 = new Rectangle(2,3,p2);

    System.out.println(R1);
    R1.print();
    System.out.println(R2);
    R2.print();
    System.out.println(R3);
    R3.print();
    System.out.println(R4);
    R4.print();
  }
}

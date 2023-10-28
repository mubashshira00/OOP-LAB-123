//Shape.java
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public static void main(String[] args) {
    }
  }
//Rectangle.java
public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  public double getArea() {
    return length * width;
  }
  public double getPerimeter() {
    return 2 * (length + width);
  }
}
//main.java
public class main {
      public static void main(String[] args) {
    // create shape
    Shape rectangle = new Rectangle(14, 16);
    System.out.println("\nArea and perimeter of various shapes:");
    System.out.println("\nRectangle: Length 14, Width 16");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());

    
}
}
    

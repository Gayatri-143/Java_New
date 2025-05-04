/*
 interface Shape{
     void area();

}
class Rectangle implements Shape{
    private int a,b;
    
    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void area(){
        
        System.out.println("Area of Rectangle: " + a*b);
    }
}
class Triangle implements Shape{
    
    private int a,b;
    public Triangle(int a, int b){
        this.a=a;
        this.b=b;
        
    }
   
   void area(){
    System.out.println("Area of Triangle: " + ((0.5)*a*b));
   }
}
public class ShapeMain{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        r.area(12, 45);
        t.area(23, 10);
    }
}
 */
// Shape Interface
interface Shape {
    double area(); // Abstract method to calculate area
}

// Rectangle Class implementing Shape interface
class Rectangle implements Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing area() method
    @Override
    public double area() {
        return length * width;
    }
}

// Triangle Class implementing Shape interface
class Triangle implements Shape {
    private double base, height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing area() method
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Test Class
public class TestShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 4);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

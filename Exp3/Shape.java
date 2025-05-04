abstract class Shape{
    abstract void area();
}

class Rectangle extends Shape{
    public void area(){
        double lenght = 5;
        double breadth = 10;

        double rect_area;
        rect_area = 0.5*(lenght*breadth);

        System.out.println("Area of Reactangle: " + rect_area);
    }
}

import java.util.Scanner;

public class Area {
    float l,b;

    public void setDim(float lenght, float breadth){
        this.l = lenght;
        this.b = breadth;
    }

    public void getArea(){
        double area;
        area = 0.5*(l*b);
        System.out.println("Area of triangle is: " +area);
    }

    public static void main(String[] args){
        Area obj = new Area();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lenght: ");
        float l = sc.nextFloat();

        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        obj.setDim(l, b);
        obj.getArea();
    }
}

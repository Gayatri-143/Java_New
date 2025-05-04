// StaticDemo.java
public class StaticDemo {
   
    private static int count;

    
    static {
        count = 0;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    private String name;

   
    public StaticDemo(String name) {
        this.name = name;
        count++; 
        System.out.println("Object created: " + name + ", Count: " + count);
    }

   
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    
    public void displayName() {
        System.out.println("Object Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects
        StaticDemo obj1 = new StaticDemo("Object1");
        StaticDemo obj2 = new StaticDemo("Object2");

     
        StaticDemo.displayCount();
        obj1.displayName();
        obj2.displayName();
    }
}

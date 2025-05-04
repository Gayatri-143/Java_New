public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Gayatri", "Jadhav", 3000);
        Employee emp2 = new Employee("Satej", "Jadhav", 3500);

        
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary() +"/-");
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary() +"/-");

        
        emp1.giveRaise();
        emp2.giveRaise();

        
        System.out.println("\nAfter 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary() +"/-");
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary() +"/-");
    }
}

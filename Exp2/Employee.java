// Employee.java
public class Employee {
    private String firstName;
    private String lastName;
    private float monthlySalary;

    
    public Employee(String firstName, String lastName, float monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0f;
        }
    }

   
    public float getYearlySalary() {
        return monthlySalary * 12;
    }

    
    public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}



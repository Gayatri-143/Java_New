class Employee {
    String name,address,job_title;
    double salary;

    public Employee(String name, String address,double salary, String job_title){
        this.name=name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    public double calculateBonus() {
        return salary * 0.10; 
    }
    
    public void generatePerformanceReport() {
        System.out.println("Performance report for: " + name);
    }

    public void giveRaise() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'giveRaise'");
    }

}
class Manager extends Employee {
    private int managedProjects;
    
    public Manager(String name, String address, double salary, int managedProjects) {
        super(name, address, salary, "Manager");
        this.managedProjects = managedProjects;
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.20 + managedProjects * 500; // Managers get 20% bonus plus $500 per project
    }
    
    public void manageProject() {
        System.out.println(name + " is managing " + managedProjects + " projects.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.15; 
    }
    
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, programmingLanguage);
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.12; 
    }
    
    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Gayatri", "Kololi,Panhala", 90000, 5);
        Developer developer = new Developer("Satej", "Salwan,Gaganbawda", 80000, "Java");
        Programmer programmer = new Programmer("Sanika", "Radhanagari", 70000, "Python");
        
        manager.manageProject();
        System.out.println("Manager Bonus: " + manager.calculateBonus());
        manager.generatePerformanceReport();
        
        developer.writeCode();
        System.out.println("Developer Bonus: " + developer.calculateBonus());
        developer.generatePerformanceReport();
        
        programmer.debugCode();
        System.out.println("Programmer Bonus: " + programmer.calculateBonus());
        programmer.generatePerformanceReport();
    }
}

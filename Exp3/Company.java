class Employee {
    String name, address, job_title;
    double salary;

    public Employee(String name, String address, double salary, String job_title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    public Employee(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for: " + name);
    }

    public void giveRaise() {
        this.salary *= 1.10; // Give a 10% raise
    }

    public String getFirstName() {
        return name.split(" ")[0];
    }

    public String getLastName() {
        String[] parts = name.split(" ");
        return parts.length > 1 ? parts[1] : "";
    }

    public String getYearlySalary() {
        return String.format("%.2f", salary * 12);
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
        Manager manager = new Manager("Gayatri Desai", "Kololi, Panhala", 90000, 5);
        Developer developer = new Developer("Satej Patil", "Salwan, Gaganbawda", 80000, "Java");
        Programmer programmer = new Programmer("Sanika Joshi", "Radhanagari", 70000, "Python");

        System.out.println("--- MANAGER DETAILS ---");
        manager.manageProject();
        System.out.println("Manager Bonus: $" + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.giveRaise();
        System.out.println("New Monthly Salary (after raise): $" + manager.salary);
        System.out.println("Yearly Salary: $" + manager.getYearlySalary());
        System.out.println("First Name: " + manager.getFirstName());
        System.out.println("Last Name: " + manager.getLastName());

        System.out.println("\n--- DEVELOPER DETAILS ---");
        developer.writeCode();
        System.out.println("Developer Bonus: $" + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.giveRaise();
        System.out.println("New Monthly Salary (after raise): $" + developer.salary);
        System.out.println("Yearly Salary: $" + developer.getYearlySalary());
        System.out.println("First Name: " + developer.getFirstName());
        System.out.println("Last Name: " + developer.getLastName());

        System.out.println("\n--- PROGRAMMER DETAILS ---");
        programmer.debugCode();
        System.out.println("Programmer Bonus: $" + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.giveRaise();
        System.out.println("New Monthly Salary (after raise): $" + programmer.salary);
        System.out.println("Yearly Salary: $" + programmer.getYearlySalary());
        System.out.println("First Name: " + programmer.getFirstName());
        System.out.println("Last Name: " + programmer.getLastName());
    }
}

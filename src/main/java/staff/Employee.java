package staff;

public abstract class Employee {
    private String name;
    private int NiNumber;
    private double salary;

    public Employee(String name, int NiNumber, double salary) {
        this.name = name;
        this.NiNumber = NiNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        if(name != null) {
            this.name = name;
        }
        return this.name;
    }

    public int getNiNumber() {
        return this.NiNumber;
    }

    public double getSalary() {
        return this.salary;
    }


    public double raiseSalary(double increaseSalary) {
        if (increaseSalary > 0) {
            this.salary += increaseSalary;
        }
        return this.salary;
    }

    public double payBonus() {
        return this.salary / 100;
    }
}

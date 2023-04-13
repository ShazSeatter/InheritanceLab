package staff;

public abstract class Employee {
    String name;
    int niNumber;
    double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public int getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }


    public double raiseSalary(double increaseSalary) {
        if (increaseSalary >= 0) {
            this.salary += increaseSalary;
        }
        return this.salary;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}

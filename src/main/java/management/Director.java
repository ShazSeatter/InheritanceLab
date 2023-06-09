package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }


    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus() {
        return this.getSalary() * 2 / 100;
    }


}

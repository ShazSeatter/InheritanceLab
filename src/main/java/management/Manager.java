package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NiNumber, double salary, String deptName) {
        super(name, NiNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}

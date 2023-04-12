
import management.Manager;
import org.junit.Test;
import staff.Employee;


import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void managerAsEmployeeSalaryRaise() {
        employee = new Manager("Bill", 23456, 50000, "Management");
        assertEquals(52000, employee.raiseSalary(2000), 0.01);
    }

    @Test
    public void managerAsEmployeePayBonus() {
        employee = new Manager("Bill", 23456, 50000, "Management");
        assertEquals(500, employee.payBonus(), 0.01);
    }

    @Test
    public void employeeChangeName() {
        employee = new Manager("Bill", 23456, 50000, "Management");
        Employee newEmployeeName = new Manager("Sarah", 23456, 50000, "Management");
        assertEquals("Sarah", employee.setName(newEmployeeName.getName()));
    }

    @Test
    public void employeeChangeNameNull() {
        employee = new Manager("Bill", 23456, 50000, "Management");
        Employee newEmployeeName = new Manager(null, 23456, 50000, "Management");
        assertEquals("Bill", employee.setName(newEmployeeName.getName()));
    }
}

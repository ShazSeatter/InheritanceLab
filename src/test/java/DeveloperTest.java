import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Robert", 23457, 40000);
    }

    @Test
    public void hasName() {
        assertEquals("Robert", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(23457, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, developer.getSalary(), 0.01);
    }

    @Test
    public void employeeSalaryRaise() {
        assertEquals(41000, developer.raiseSalary(1000), 0.01);
    }

    @Test
    public void raiseNegativeSalary() {
        assertEquals(40000, developer.raiseSalary(-2000), 0.01);
    }
    @Test
    public void employeePayBonus() {
        assertEquals(400, developer.payBonus(), 0.01);
    }
}

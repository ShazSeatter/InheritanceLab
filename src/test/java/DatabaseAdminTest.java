import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("William", 23557, 40000);
    }

    @Test
    public void hasName() {
        assertEquals("William", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(23557, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void employeeSalaryRaise() {
        assertEquals(41000, databaseAdmin.raiseSalary(1000), 0.01);
    }

    @Test
    public void raiseNegativeSalary() {
        assertEquals(40000, databaseAdmin.raiseSalary(-2000), 0.01);
    }
    @Test
    public void employeePayBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.01);
    }

}

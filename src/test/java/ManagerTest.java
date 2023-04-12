import org.junit.Before;

import management.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bill", 23456, 50000, "Management");
    }

    @Test
    public void hasName() {
        assertEquals("Bill", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(23456, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, manager.getSalary(), 0.01);
    }
    @Test
    public void hasDepartment() {
       assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void managerRaiseSalary() {
        assertEquals(52000, manager.raiseSalary(2000), 0.01);
    }

    @Test
    public void raiseNegativeSalary() {
        assertEquals(50000, manager.raiseSalary(-2000), 0.01);
    }
    @Test
    public void managerGetPayBonusAmount() {
        assertEquals(500, manager.payBonus(), 0.01);
    }

    @Test
    public void changeName() {
        assertEquals("Sarah", manager.setName("Sarah"));
    }


}

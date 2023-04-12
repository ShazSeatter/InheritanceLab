import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jane", 23456, 100000, "Management", 50000);
    }

    @Test
    public void hasNiNumber() {
        assertEquals(23456, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary(), 0.01);
    }
    @Test
    public void hasDepartment() {
        assertEquals("Management", director.getDeptName());
    }
    @Test
    public void hasBudget() {
        assertEquals(50000, director.getBudget(), 0.01);
    }

    @Test
    public void directorSalaryRaise() {
        assertEquals(105000, director.raiseSalary(5000), 0.01);
    }
    @Test
    public void raiseNegativeSalary() {
        assertEquals(100000, director.raiseSalary(-2000), 0.01);
    }
    @Test
    public void directorPayBonus() {
        assertEquals(2000, director.payBonus(), 0.01);
    }

}

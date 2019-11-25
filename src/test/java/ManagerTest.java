import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "NI75632", 2000d, "Foods");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NI75632", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(2000, manager.getSalary(), 0.0001);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Foods", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(2500, manager.raiseSalary(500.0), 0.0001);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(2020, manager.payBonus(), 0.0001);
    }
}

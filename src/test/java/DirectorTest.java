import Staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Paul", "NI48228", 3000d, "Foods", 1000000d);
    }

    @Test
    public void hasName(){
        assertEquals("Paul", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NI48228", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(3000, director.getSalary(), 0.0001);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Foods", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000.0, director.getBudget(), 0.0001);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(3500, director.raiseSalary(500.0), 0.0001);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(3030, director.payBonus(), 0.0001);
    }
}

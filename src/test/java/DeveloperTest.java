import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Lisa", "NI6789", 2100d);
    }

    @Test
    public void hasName(){
        assertEquals("Lisa", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NI6789", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(2100, developer.getSalary(), 0.0001);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(2600, developer.raiseSalary(500.0), 0.0001);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(2121, developer.payBonus(), 0.0001);
    }
}



import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jim", "NI12345", 1500d);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NI12345", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1500, databaseAdmin.getSalary(), 0.0001);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(2000, databaseAdmin.raiseSalary(500.0), 0.0001);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(1515, databaseAdmin.payBonus(), 0.0001);
    }
}


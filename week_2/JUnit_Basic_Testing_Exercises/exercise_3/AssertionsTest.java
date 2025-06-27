package exercise_3;


import org.junit.Test;
import static org.junit.Assert.*;  
public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals("Addition result should be 5", 5, 2 + 3);

        // Assert true
        assertTrue("5 should be greater than 3", 5 > 3);

        // Assert false
        assertFalse("5 is not less than 3", 5 < 3);

        // Assert null
        String nullString = null;
        assertNull("The object should be null", nullString);

        // Assert not null
        String nonNullString = "JUnit";
        assertNotNull("The object should not be null", nonNullString);
    }
}


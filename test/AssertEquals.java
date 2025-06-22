import org.junit.Assert;
import org.junit.Test;

public class AssertEquals {

    @Test
    public void testSuperheroAssertions() {
        // Simple Superhero JUnit Assertions

        // Asserting equality
        int expectedPowerLevel = 100;
        int actualPowerLevel = 90;
        Assert.assertEquals(expectedPowerLevel, actualPowerLevel);
        
    }
}

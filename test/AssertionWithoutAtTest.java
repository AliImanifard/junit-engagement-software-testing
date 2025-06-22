import org.junit.Assert;
import org.junit.Test;

public class AssertionWithoutAtTest {

    @Test
    public void testSuperheroAssertions() {
        // Simple Superhero JUnit Assertions

        // Asserting equality
        int expectedPowerLevel = 100;
        int actualPowerLevel = 90;
        Assert.assertEquals(expectedPowerLevel, actualPowerLevel);

        // Asserting true
        boolean hasCape = false;
        Assert.assertTrue("The superhero should have a cape", hasCape);

        // Asserting false
        boolean hasSuperStrength = true;
        Assert.assertFalse("The superhero should not have super strength",
                hasSuperStrength);

        // Asserting not null
        String mainAbility = "Flying";
        Assert.assertNotNull("The main ability should not be null",
                mainAbility);

        // Asserting null
        String secretIdentity = null;
        Assert.assertNull("The secret identity should be null", secretIdentity);
    }
}


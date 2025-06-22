import org.junit.Assert;
import org.junit.Test;

public class AssertFalse {

    @Test
    public void testSuperheroAssertions() {
        // Simple Superhero JUnit Assertions

        // Asserting false
        boolean hasSuperStrength = true;
        Assert.assertFalse("The superhero should not have super strength", hasSuperStrength);

    }
}

import org.junit.Assert;
import org.junit.Test;

public class AssertTrue {

    @Test
    public void testSuperheroAssertions() {
        // Simple Superhero JUnit Assertions

        // Asserting true
        boolean hasCape = false;
        Assert.assertTrue("The superhero should have a cape", hasCape);

    }
}

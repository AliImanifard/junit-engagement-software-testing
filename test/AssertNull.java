import org.junit.Assert;
import org.junit.Test;

public class AssertNull {

    @Test
    public void testSuperheroAssertions() {
        // Simple Superhero JUnit Assertions

        // Asserting null
        String secretIdentity = null;
        Assert.assertNull("The secret identity should be null", secretIdentity);
    }
}

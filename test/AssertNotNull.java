import org.junit.Assert;
import org.junit.Test;

public class AssertNotNull {

    @Test
    public void testSuperheroAssertions() {
        // Simple Superhero JUnit Assertions

        // Asserting not null
        String mainAbility = "Flying";
        Assert.assertNotNull("The main ability should not be null", mainAbility);

    }
}

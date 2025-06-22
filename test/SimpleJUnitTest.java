
import org.junit.Assert;
import org.junit.Test;

public class SimpleJUnitTest {
    @Test
    public void testSum() {
        // Test data
        int a = 5;
        int b = 7;
        
        // Perform the operation to be tested
        int result = a + b;

        // Assert the expected result
        Assert.assertEquals(13, result); // This will pass
    }
}

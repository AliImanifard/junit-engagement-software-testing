import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class DoNotSleep {
    private static DontSleep dontSleep;

    @Before
    public void setUp() {
        dontSleep = new DontSleep();
    }

    @Test
    public void testInitialState() {
        assertFalse(dontSleep.isAwake());
        assertEquals(0, dontSleep.getShockLevel());
    }

    @Test
    public void testInsufficientShockLevel() {
        int[] levels = {0, 3, 4};
        for (int level : levels) {
            dontSleep.wakeUp(level);
            assertFalse(dontSleep.isAwake());
        }
    }

    @Test
    public void testSufficientShockLevel() {
        int[] levels = {5, 7, 10};
        for (int level : levels) {
            dontSleep.wakeUp(level);
            assertTrue(dontSleep.isAwake());
            assertEquals(level, dontSleep.getShockLevel());
        }
    }
    
    private static class DontSleep {
    private boolean isAwake;
    private int shockLevel;

    public DontSleep() {
        this.isAwake = false;
        this.shockLevel = 0;
    }

    public void wakeUp(int level) {
        if (level >= 5) {
            this.isAwake = true;
            this.shockLevel = level;

            System.out.println("Wake up!!!!!! (Shock Level: " + shockLevel + ")");
        }
    }

    public boolean isAwake() {
        return this.isAwake;
    }

    public int getShockLevel() {
        return this.shockLevel;
    }
}
}
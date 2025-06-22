
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFixtures {
    private Superhero superhero;
    private Villain villain;

    // Test Fixture: Set up objects for testing
    @Before
    public void setUp() {
        superhero = new Superhero("Captain Coder",
                100,
                "Super Coding");
        villain = new Villain("Bug Smasher",
                80,
                "Debugging");
    }

    // Test Fixture: Clean up after each test
    @After
    public void tearDown() {
        superhero = null;
        villain = null;
    }

    @Test
    public void testSuperheroPower() {
        // Test that the superhero's power is "Super Coding"
        assertEquals("Super Coding", superhero.getPower());
    }

    @Test
    public void testSuperheroBattle() {
        // Test that the superhero wins the battle against the villain
        boolean result = superhero.battle(villain);
        assertTrue(result);
    }

    @Test
    public void testSuperheroDamage() {
        // Test that the superhero takes damage from the villain
        int initialHealth = superhero.getHealth();
        superhero.takeDamage(villain.getStrength());
        int newHealth = superhero.getHealth();
        assertTrue(newHealth < initialHealth);
    }

    // Superhero and Villain classes (simplified for example)
    private static class Superhero {
        private String name;
        private int health;
        private String power;

        public Superhero(String name, int health, String power) {
            this.name = name;
            this.health = health;
            this.power = power;
        }

        public String getPower() {
            return power;
        }

        public int getHealth() {
            return health;
        }

        public boolean battle(Villain villain) {
            return this.health > villain.getStrength();
        }

        public void takeDamage(int damage) {
            this.health -= damage;
        }
    }

    private static class Villain {
        private String name;
        private int strength;
        private String power;

        public Villain(String name, int strength, String power) {
            this.name = name;
            this.strength = strength;
            this.power = power;
        }

        public int getStrength() {
            return strength;
        }
    }
}
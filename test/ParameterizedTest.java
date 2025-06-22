
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)   
// tells JUnit to run the test class with the Parameterized runner,
//  which allows us to pass multiple sets of parameters to the test methods.

public class ParameterizedTest {

    private String superheroName;
    private int expectedStrength;

    public ParameterizedTest(String superheroName, int expectedStrength) {
        this.superheroName = superheroName;
        this.expectedStrength = expectedStrength;
    }

    @Parameters
    public static Collection<Object[]> superheroData() {
        return Arrays.asList(new Object[][]{
                {"Captain America", 100},
                {"Iron Man", 80},
                {"Thor", 120},
                {"Hulk", 200},
                {"Black Widow", 70},
                {"Spider-Man", 90}
        });
    }
    // Each array represents a set of parameters that will be passed
    // to the Test method. In this case, we have six sets of parameters,
    // each containing a superhero name and their expected strength.



    @Test
    public void testSuperheroStrength() {
        Superhero superhero = new Superhero(superheroName);
        int actualStrength = superhero.getStrength();
        assertEquals("Incorrect strength for " + superheroName,
                expectedStrength,
                actualStrength);
    }
    // The @Test method testSuperheroStrength() is the actual test method
    // that will be executed multiple times, once for each set of parameters.
    // It creates a Superhero instance with the provided superheroName,
    // gets the actual strength using the getStrength() method,
    // and then asserts that the actual strength matches the expectedStrength.

    
    // Superhero class implementation
    private static class Superhero {
        private String name;
        private int strength;

        public Superhero(String name) {
            this.name = name;
            setStrength(name);
        }

        private void setStrength(String name) {
            switch (name) {
                case "Captain America":
                    strength = 100;
                    break;
                case "Iron Man":
                    strength = 80;
                    break;
                case "Thor":
                    strength = 120;
                    break;
                case "Hulk":
                    strength = 10;
                    break;
                case "Black Widow":
                    strength = 70;
                    break;
                case "Spider-Man":
                    strength = 90;
                    break;
                default:
                    strength = 50;
                    break;
            }
        }

        public int getStrength() {
            return strength;
        }
    }
}
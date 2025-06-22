
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnitRule {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void shouldThrow_whenHeroIsNull() {
        thrown.expect(NullPointerException.class);
        Superhero nullHero = null;
        nullHero.saveTheDay();
    }

    private static class Superhero {

        public Superhero() {
        }

        private void saveTheDay() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
        
    }
}

//Via import static org.junit.Assert.*;,
//vous devez faire appel dans les tests aux méthodes statiques assertTrue, assertFalse, assertEquals, assertNull, fail, etc. en fournissant un message :
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    void TestAddition() {
        assertEquals(16, calculator.addition(4,12));
    }

    //Pour désigner une méthode comme un test, il suffit de poser l'annotation @Test

    @Test
    void TestSubstraction() {
        assertEquals(-8,calculator.substraction(4,12));
    }

    @Test
    void TestMultiply() {
        assertEquals(48,calculator.multiply(4,12));
    }

    @Test
    void TestDivision() {
        assertEquals(0.33,calculator.division(4,12));
    }
}

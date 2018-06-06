import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBuzzTest {
    @Test
    @DisplayName("Should return Java when passed a multiple of 3")

    public void returnsJava() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.generate(3);
        assertEquals("java", result);
    }

    @Test
    @DisplayName("Should return Buzz when passed a multiple of 5")

    public void returnsBuzz() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.generate(5);
        assertEquals("buzz", result);
    }
}
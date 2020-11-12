import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)
    @Test
    void randomBoyName() {
        Algorithms1 a1 = new Algorithms1();
        a1.rand.setSeed(10L);
        assertEquals("Kritte", a1.randomBoyName());
    }

    @Test
    void randomGirlName() {
        Algorithms1 a1 = new Algorithms1();
        a1.rand.setSeed(10L);
        assertEquals("Glød", a1.randomGirlName());
    }

    // TODO 6 - Skriv en test til randomName() metoden
    @Test
    void randomName() {
        Algorithms1 a1 = new Algorithms1();
        a1.rand.setSeed(10L);
        assertEquals("Glød", a1.randomName());
    }
}
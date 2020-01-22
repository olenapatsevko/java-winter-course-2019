import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PerfectNumberTest {

    @Test
    public void findPerfectNumbers() {
        assertEquals(" 6 28 496 8128", PerfectNumber.findPerfectNumbers(2, 10000));
    }

    @Test
    public void isNumPerfect() {
        assertTrue(PerfectNumber.isNumPerfect(28));

    }
}
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LnTest {
    private static final double DELTA = 0.001;
    Ln ln = new Ln();

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.123, -2.0955709236},
                {0.211, -1.5558971455},
                {1.213, 0.19309662996},
                {2.456, 0.89853401028},
                {7.311, 1.9893800633},
                {77.666, 4.3524175812},
                {1777.666, 7.4830565469}
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public LnTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() throws Exception{
        assertEquals(expected, ln.ln(input), DELTA);
    }
}

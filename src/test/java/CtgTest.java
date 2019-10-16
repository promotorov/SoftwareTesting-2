import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CtgTest {
    private static final double DELTA = 0.001;
    Ctg ctg = new Ctg(TestMocks.createSinus());

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.0, Double.POSITIVE_INFINITY},
                {Math.PI/6, 1.7320508076},
                {-Math.PI/6, -1.7320508076},
                {Math.PI/3, 0.5773502692},
                {-Math.PI/3, -0.5773502692},
                {Math.PI/2, 0.0},
                {-Math.PI/2, 0.0},
                {Math.PI, Double.POSITIVE_INFINITY},
                {-Math.PI, Double.POSITIVE_INFINITY},

                {-3.0, 7.0152525514},
                {-2.0, 0.4576575544},
                {-1.0, -0.6420926159},
                {-0.22, -4.4718834939},
                {0.3, 3.2327281438},
                {1.3, 0.2776156465},
                {2.23, -0.7748297153},
                {3.1, -24.0288415769},

                {-3.0+ 2 * Math.PI, 7.0152525514},
                {-2.0+ 2 * Math.PI, 0.4576575544},
                {-1.0+ 2 * Math.PI, -0.6420926159},
                {-0.22+ 2 * Math.PI, -4.4718834939},
                {0.3+ 2 * Math.PI, 3.2327281438},
                {1.3+ 2 * Math.PI, 0.2776156465},
                {2.23+ 2 * Math.PI, -0.7748297153},
                {3.1+ 2 * Math.PI, -24.0288415769},
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public CtgTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, ctg.ctg(input), DELTA);
    }
}

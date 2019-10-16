import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SecTest {
    private static final double DELTA = 0.001;
    Sec sec = new Sec(TestMocks.createCosinus());

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.0, 1.0},
                {Math.PI/6, 1.15470053838},
                {-Math.PI/6, 1.15470053838},
                {Math.PI/3, 2.0},
                {-Math.PI/3, 2.0},
                {Math.PI/2, Double.POSITIVE_INFINITY},
                {-Math.PI/2, Double.POSITIVE_INFINITY},
                {Math.PI, -1.0},
                {-Math.PI, -1.0},

                {-3.0, -1.01010866591},
                {-2.0, -2.40299796172},
                {-1.0, 1.85081571768},
                {-0.22, 1.0246978314},
                {0.3, 1.04675160154},
                {1.3, 3.73833412708},
                {2.23, -1.63268620633},
                {3.1, -1.00086559834},

                {-3.0 + Math.PI * 2, -1.01010866591},
                {-2.0 + Math.PI * 2, -2.40299796172},
                {-1.0 + Math.PI * 2, 1.85081571768},
                {-0.22 + Math.PI * 2, 1.0246978314},
                {0.3 + Math.PI * 2, 1.04675160154},
                {1.3 + Math.PI * 2, 3.73833412708},
                {2.23 + Math.PI * 2, -1.63268620633},
                {3.1 + Math.PI * 2, -1.00086559834},
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public SecTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, sec.sec(input), DELTA);
    }
}

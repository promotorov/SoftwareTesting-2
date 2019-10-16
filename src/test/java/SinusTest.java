import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SinusTest {
    private static final double DELTA = 0.001;
    Sin sin = new Sin(TestMocks.createCosinus());

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.0, 0.0},
                {Math.PI/6, 0.5},
                {-Math.PI/6, -0.5},
                {Math.PI/3, 0.8660254},
                {-Math.PI/3, -0.8660254},
                {Math.PI/2, 1.0},
                {-Math.PI/2, -1.0},
                {Math.PI, 0.0},
                {-Math.PI, 0.0},

                {-3.0, -0.14112000806},
                {-2.0, -0.90929742682},
                {-1.0, -0.8414709848},
                {-0.22, -0.21822962308},
                {0.3, 0.29552020666},
                {1.3, 0.96355818541},
                {2.23, 0.79048022234},
                {3.1, 0.04158066243},

                {-3.0 + Math.PI * 2, -0.14112000806},
                {-2.0 + Math.PI * 2, -0.90929742682},
                {-1.0 + Math.PI * 2, -0.8414709848},
                {-0.22 + Math.PI * 2, -0.21822962308},
                {0.3 + Math.PI * 2, 0.29552020666},
                {1.3 + Math.PI * 2, 0.96355818541},
                {2.23 + Math.PI * 2, 0.79048022234},
                {3.1 + Math.PI * 2, 0.04158066243},
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public SinusTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, sin.sin(input), DELTA);
    }
}

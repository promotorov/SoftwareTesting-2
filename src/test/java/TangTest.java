import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TangTest {
    private static final double DELTA = 0.001;
    Tang tang = new Tang(TestMocks.createCtg());

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.0, 0.0},
                {Math.PI/6, 0.5773502692},
                {-Math.PI/6, -0.5773502692},
                {Math.PI/3, 1.7320508076},
                {-Math.PI/3, -1.7320508076},
                {Math.PI/2, Double.POSITIVE_INFINITY},
                {-Math.PI/2, Double.POSITIVE_INFINITY},
                {Math.PI, 0.0},
                {-Math.PI, 0.0},

                {-3.0, 0.1425465431},
                {-2.0, 2.1850398633},
                {-1.0, -1.5574077247},
                {-0.22, -0.2236194215},
                {0.3, 0.3093362496},
                {1.3, 3.6021024480},
                {2.23, -1.2906061554},
                {3.1, -0.0416166546},

                {-3.0+2*Math.PI, 0.1425465431},
                {-2.0+2*Math.PI, 2.1850398633},
                {-1.0+2*Math.PI, -1.5574077247},
                {-0.22+2*Math.PI, -0.2236194215},
                {0.3+2*Math.PI, 0.3093362496},
                {1.3+2*Math.PI, 3.6021024480},
                {2.23+2*Math.PI, -1.2906061554},
                {3.1, -0.0416166546},
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public TangTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, tang.tang(input), DELTA);
    }
}

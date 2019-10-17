import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CosinusTest {
    private static final double DELTA = 0.000001;
    Cos cos = new Cos();

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.0, 1.0},
                {Math.PI/6, 0.86602540378},
                {-Math.PI/6, 0.86602540378},
                {Math.PI/3, 0.5},
                {-Math.PI/3, 0.5},
                {Math.PI/2, 0.0},
                {-Math.PI/2, 0.0},
                {Math.PI, -1.0},
                {-Math.PI, -1.0},
                {-3.0, -0.9899924966},
                {-2.0, -0.41614683654},
                {-1.0, 0.54030230586},
                {-0.22, 0.97589744933},
                {0.3, 0.95533648912},
                {1.3, 0.26749882862},
                {2.23, -0.61248756565},
                {3.1, -0.99913515027},

                {-3.0 + 2 * Math.PI, -0.9899924966},
                {-2.0 + 2 * Math.PI, -0.41614683654},
                {-1.0 + 2 * Math.PI, 0.54030230586},
                {-0.22 + 2 * Math.PI, 0.97589744933},
                {0.3 + 2 * Math.PI, 0.95533648912},
                {1.3 + 2 * Math.PI, 0.26749882862},
                {2.23 + 2 * Math.PI, -0.61248756565},
                {3.1 + 2 * Math.PI, -0.99913515027},
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public CosinusTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, cos.cos(input), DELTA);
    }
}

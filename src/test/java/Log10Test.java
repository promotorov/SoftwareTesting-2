import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Log10Test {
    private static final double DELTA = 0.001;

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.123, -0.91009488856},
                {0.211, -0.6757175447},
                {1.213, 0.083860800867},
                {2.456, 0.39022836247},
                {7.311, 0.8639767839},
                {77.666, 1.8902309384},
                {1777.666, 3.2498501661}
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public Log10Test(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() throws Exception{
        Log log = new Log(TestMocks.createLn());
        assertEquals(expected, log.log(10, input), DELTA);
    }
}

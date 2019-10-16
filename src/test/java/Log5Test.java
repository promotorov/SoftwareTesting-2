import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Log5Test {
    private static final double DELTA = 0.001;

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.123, -1.3020514227},
                {0.211, -0.96673325108},
                {1.213, 0.11997768194},
                {2.456, 0.55829057048},
                {7.311, 1.2360713315},
                {77.666, 2.704309093},
                {1777.666, 4.6494844499}
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public Log5Test(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() throws Exception{
        Log log = new Log(TestMocks.createLn());
        assertEquals(expected, log.log(5, input), DELTA);
    }
}

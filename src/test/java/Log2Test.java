import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Log2Test {
    private static final double DELTA = 0.001;

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.123, -3.0232697793},
                {0.211, -2.244685096},
                {1.213, 0.27857955046},
                {2.456, 1.2963105607},
                {7.311, 2.8700687518},
                {77.666, 6.2792112602},
                {1777.666, 10.795768571}
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public Log2Test(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() throws Exception{
        Log log = new Log(TestMocks.createLn());
        assertEquals(expected, log.log(2, input), DELTA);
    }
}

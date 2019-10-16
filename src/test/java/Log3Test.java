import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Log3Test {
    private static final double DELTA = 0.001;

    @Parameters
    public static Collection data() {
        Double[][] data = new Double[][] {
                {0.123, -1.9074708568},
                {0.211, -1.4162386144},
                {1.213, 0.17576412712},
                {2.456, 0.81788090262},
                {7.311, 1.8108117703},
                {77.666, 3.961741213},
                {1777.666, 6.8113716041}
        };
        return Arrays.asList(data);
    }

    private double input;
    private double expected;

    public Log3Test(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() throws Exception{
        Log log = new Log(TestMocks.createLn());
        assertEquals(expected, log.log(3, input), DELTA);
    }
}

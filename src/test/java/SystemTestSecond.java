import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SystemTestSecond {
    private static final double DELTA = 0.1;

    @Parameters
    public static Collection data() {
        System[] data = new System[] {
                new System(TestMocks.createSec(),
                        TestMocks.createCtg(),
                        TestMocks.createTang(),
                        TestMocks.createCosinus(),
                        TestMocks.createLog(),
                        TestMocks.createLn())
        };
        return Arrays.asList(data);
    }

    private System system;

    public SystemTestSecond(System system) {
        this.system = system;
    }

    @Test
    public void test0123() {
        assertEquals(6.18079, system.calc(0.123), DELTA);
    }

    @Test
    public void test0211() {
        assertEquals(13.3191, system.calc(0.211), DELTA);
    }

    @Test
    public void test1213() {
        assertEquals(0.523715, system.calc(1.213), DELTA);
    }

    @Test
    public void test2456() {
        assertEquals(8.76427, system.calc(2.456), DELTA);
    }

    @Test
    public void test7311() {
        assertEquals(8.22423, system.calc(7.311), DELTA);
    }

    @Test
    public void test77666() {
        assertEquals(1030.13, system.calc(77.666), DELTA);
    }

    @Test
    public void test1777666() {
        assertEquals(47650.03, system.calc(1777.666), DELTA);
    }
}

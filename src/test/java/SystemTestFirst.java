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
public class SystemTestFirst {
    private static final double DELTA = 0.1;

    @Parameters
    public static Collection data() {
        System[] data = new System[] {
                new System(TestMocks.createSec(),
                        TestMocks.createCtg(),
                        TestMocks.createTang(),
                        TestMocks.createCosinus(),
                        TestMocks.createLog(),
                        TestMocks.createLn()),
                new System(TestMocks.createSec(),
                        TestMocks.createCtg(),
                        new Tang(TestMocks.createCtg()),
                        TestMocks.createCosinus(),
                        TestMocks.createLog(),
                        TestMocks.createLn()),
                new System(new Sec(TestMocks.createCosinus()),
                        TestMocks.createCtg(),
                        TestMocks.createTang(),
                        TestMocks.createCosinus(),
                        TestMocks.createLog(),
                        TestMocks.createLn()),
                new System(TestMocks.createSec(),
                        TestMocks.createCtg(),
                        TestMocks.createTang(),
                        TestMocks.createCosinus(),
                        new Log(TestMocks.createLn()),
                        TestMocks.createLn()),
                //
                new System(new Sec(TestMocks.createCosinus()),
                        new Ctg(TestMocks.createSinus()),
                        new Tang(new Ctg(TestMocks.createSinus())),
                        TestMocks.createCosinus(),
                        new Log(TestMocks.createLn()),
                        TestMocks.createLn()),
                new System(new Sec(TestMocks.createCosinus()),
                        TestMocks.createCtg(),
                        new Tang(new Ctg(TestMocks.createSinus())),
                        TestMocks.createCosinus(),
                        new Log(new Ln()),
                        new Ln()),

                new System(new Sec(new Cos()),
                        new Ctg(new Sin(new Cos())),
                        new Tang(new Ctg(TestMocks.createSinus())),
                        new Cos(),
                        new Log(new Ln()),
                        new Ln())
        };
        return Arrays.asList(data);
    }

    private System system;

    public SystemTestFirst(System system) {
        this.system = system;
    }

    @Test
    public void test0() {
        assertEquals(Double.POSITIVE_INFINITY, system.calc(0), DELTA);
    }

    @Test
    public void testMPi6() {
        assertEquals(26.2034, system.calc(-Math.PI / 6), DELTA);
    }

    @Test
    public void testMPi3() {
        assertEquals(51.4100, system.calc(-Math.PI / 3), DELTA);
    }

    @Test
    public void testMPi2() {
        assertEquals(NaN, system.calc(-Math.PI / 2), DELTA);
    }

    @Test
    public void testM3() {
        assertEquals(81.66549, system.calc(-3), DELTA);
    }

    @Test
    public void testM2() {
        assertEquals(42.76369, system.calc(-2), DELTA);
    }

    @Test
    public void testM1() {
        assertEquals(45.46269, system.calc(-1), DELTA);
    }

    @Test
    public void testM022() {
        assertEquals(48.4852, system.calc(-0.22), DELTA);
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

    /*@Test
    public void testMP3_2PI() {
        assertEquals(81.66549, system.calc(-3 + 2 * Math.PI), DELTA);
    }

    @Test
    public void testM2_2PI() {
        assertEquals(42.76369, system.calc(-2 + 2 * Math.PI), DELTA);
    }

    @Test
    public void testM1_2PI() {
        assertEquals(45.46269, system.calc(-1 + 2 * Math.PI), DELTA);
    }

    @Test
    public void testM022_2PI() {
        assertEquals(48.4852, system.calc(-0.22 + 2 * Math.PI), DELTA);
    }*/
}

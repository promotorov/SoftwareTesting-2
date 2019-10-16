import static org.mockito.Mockito.*;

public class TestMocks {
    static double PI = Math.PI;

    public static Sin createSinus() {
        Sin sin = mock(Sin.class);

        //key points
        when(sin.sin(0)).thenReturn(0.0);
        when(sin.sin(PI / 6)).thenReturn(0.5);
        when(sin.sin(-PI / 6)).thenReturn(-0.5);
        when(sin.sin(PI / 3)).thenReturn(0.8660254);
        when(sin.sin(-PI / 3)).thenReturn(0.8660254);
        when(sin.sin(-PI / 2)).thenReturn(-1.0);
        when(sin.sin(PI / 2)).thenReturn(1.0);
        when(sin.sin(PI)).thenReturn(0.0);
        when(sin.sin(-PI)).thenReturn(0.0);

        when(sin.sin(-3)).thenReturn(-0.14112000806);
        when(sin.sin(-2)).thenReturn(-0.90929742682);

        when(sin.sin(-1)).thenReturn(-0.8414709848);
        when(sin.sin(-0.22)).thenReturn(-0.21822962308);

        when(sin.sin(0.3)).thenReturn(0.29552020666);
        when(sin.sin(1.3)).thenReturn(0.96355818541);

        when(sin.sin(2.23)).thenReturn(0.79048022234);
        when(sin.sin(3.1)).thenReturn(0.04158066243);

        // 2PI offser
        when(sin.sin(-3 + 2*PI)).thenReturn(-0.14112000806);
        when(sin.sin(-2 + 2*PI)).thenReturn(-0.90929742682);

        when(sin.sin(-1 + 2*PI)).thenReturn(-0.8414709848);
        when(sin.sin(-0.22 + 2*PI)).thenReturn(-0.21822962308);

        when(sin.sin(0.3 + 2*PI)).thenReturn(0.29552020666);
        when(sin.sin(1.3 + 2*PI)).thenReturn(0.96355818541);

        when(sin.sin(2.23 + 2*PI)).thenReturn(0.79048022234);
        when(sin.sin(3.1 + 2*PI)).thenReturn(0.04158066243);

        return sin;
    }

    public static Cos createCosinus() {
        Cos cos = mock(Cos.class);

        //key points
        when(cos.cos(0)).thenReturn(1.0);
        when(cos.cos(PI / 6)).thenReturn(0.86602540378);
        when(cos.cos(-PI / 6)).thenReturn(0.86602540378);
        when(cos.cos(PI / 3)).thenReturn(0.5);
        when(cos.cos(-PI / 3)).thenReturn(0.5);
        when(cos.cos(-PI / 2)).thenReturn(0.0);
        when(cos.cos(PI / 2)).thenReturn(0.0);
        when(cos.cos(PI)).thenReturn(-1.0);
        when(cos.cos(-PI)).thenReturn(-1.0);

        when(cos.cos(-3)).thenReturn(-0.9899924966);
        when(cos.cos(-2)).thenReturn(-0.41614683654);

        when(cos.cos(-1)).thenReturn(-0.54030230586);
        when(cos.cos(-0.22)).thenReturn(-0.97589744933);

        when(cos.cos(0.3)).thenReturn(0.95533648912);
        when(cos.cos(1.3)).thenReturn(0.26749882862);

        when(cos.cos(2.23)).thenReturn(-0.61248756565);
        when(cos.cos(3.1)).thenReturn(-0.99913515027);

        // 2PI offser
        when(cos.cos(-3 + 2 * PI)).thenReturn(-0.9899924966);
        when(cos.cos(-2 + 2 * PI)).thenReturn(-0.41614683654);

        when(cos.cos(-1 + 2 * PI)).thenReturn(-0.54030230586);
        when(cos.cos(-0.22 + 2 * PI)).thenReturn(-0.97589744933);

        when(cos.cos(0.3 + 2 * PI)).thenReturn(0.95533648912);
        when(cos.cos(1.3 + 2 * PI)).thenReturn(0.26749882862);

        when(cos.cos(2.23 + 2 * PI)).thenReturn(-0.61248756565);
        when(cos.cos(3.1 + 2 * PI)).thenReturn(-0.99913515027);

        return cos;
    }

    public static Ctg createCtg() {
        Ctg ctg = mock(Ctg.class);

        //key points
        when(ctg.ctg(0)).thenReturn(Double.POSITIVE_INFINITY);
        when(ctg.ctg(PI / 6)).thenReturn(1.7320508076);
        when(ctg.ctg(-PI / 6)).thenReturn(-1.7320508076);
        when(ctg.ctg(PI / 3)).thenReturn(0.5773502692);
        when(ctg.ctg(-PI / 3)).thenReturn(-0.5773502692);
        when(ctg.ctg(-PI / 2)).thenReturn(0.0);
        when(ctg.ctg(PI / 2)).thenReturn(0.0);
        when(ctg.ctg(PI)).thenReturn(Double.NEGATIVE_INFINITY);
        when(ctg.ctg(-PI)).thenReturn(Double.NEGATIVE_INFINITY);

        when(ctg.ctg(-3)).thenReturn(7.0152525514);
        when(ctg.ctg(-2)).thenReturn(0.4576575544);

        when(ctg.ctg(-1)).thenReturn(-0.6420926159);
        when(ctg.ctg(-0.22)).thenReturn(-4.4718834939);

        when(ctg.ctg(0.3)).thenReturn(3.2327281438);
        when(ctg.ctg(1.3)).thenReturn(0.2776156465);

        when(ctg.ctg(2.23)).thenReturn(-0.7748297153);
        when(ctg.ctg(3.1)).thenReturn(-24.0288415769);

        // 2PI offser
        when(ctg.ctg(-3 + 2 * PI)).thenReturn(7.0152525514);
        when(ctg.ctg(-2 + 2 * PI)).thenReturn(0.4576575544);

        when(ctg.ctg(-1 + 2 * PI)).thenReturn(-0.6420926159);
        when(ctg.ctg(-0.22 + 2 * PI)).thenReturn(-4.4718834939);

        when(ctg.ctg(0.3 + 2 * PI)).thenReturn(3.2327281438);
        when(ctg.ctg(1.3 + 2 * PI)).thenReturn(0.2776156465);

        when(ctg.ctg(2.23 + 2 * PI)).thenReturn(-0.7748297153);

        return ctg;
    }

    public static Tang createTang() {
        Tang tang = mock(Tang.class);

        //key points
        when(tang.tang(0)).thenReturn(0.0);
        when(tang.tang(PI / 6)).thenReturn(0.5773502692);
        when(tang.tang(-PI / 6)).thenReturn(-0.5773502692);
        when(tang.tang(PI / 3)).thenReturn(1.7320508076);
        when(tang.tang(-PI / 3)).thenReturn(-1.7320508076);
        when(tang.tang(-PI / 2)).thenReturn(Double.NEGATIVE_INFINITY);
        when(tang.tang(PI / 2)).thenReturn(Double.POSITIVE_INFINITY);
        when(tang.tang(PI)).thenReturn(0.0);
        when(tang.tang(-PI)).thenReturn(0.0);

        when(tang.tang(-3)).thenReturn(0.1425465431);
        when(tang.tang(-2)).thenReturn(2.1850398633);

        when(tang.tang(-1)).thenReturn(-1.5574077247);
        when(tang.tang(-0.22)).thenReturn(-0.2236194215);

        when(tang.tang(0.3)).thenReturn(0.3093362496);
        when(tang.tang(1.3)).thenReturn(3.6021024480);

        when(tang.tang(2.23)).thenReturn(-1.2906061554);
        when(tang.tang(3.1)).thenReturn(-0.0416166546);

        // 2PI offser
        when(tang.tang(-3 + 2 * PI)).thenReturn(0.1425465431);
        when(tang.tang(-2 + 2 * PI)).thenReturn(2.1850398633);

        when(tang.tang(-1 + 2 * PI)).thenReturn(-1.5574077247);
        when(tang.tang(-0.22 + 2 * PI)).thenReturn(-0.2236194215);

        when(tang.tang(0.3 + 2 * PI)).thenReturn(0.3093362496);
        when(tang.tang(1.3 + 2 * PI)).thenReturn(3.6021024480);

        when(tang.tang(2.23 + 2 * PI)).thenReturn(-1.2906061554);
        when(tang.tang(3.1 + 2 * PI)).thenReturn(-0.0416166546);

        return tang;
    }

    public static Sec createSec() {
        Sec sec = mock(Sec.class);

        //key points
        when(sec.sec(0)).thenReturn(1.0);
        when(sec.sec(PI / 6)).thenReturn(1.15470053838);
        when(sec.sec(-PI / 6)).thenReturn(1.15470053838);
        when(sec.sec(PI / 3)).thenReturn(2.0);
        when(sec.sec(-PI / 3)).thenReturn(-2.0);
        when(sec.sec(-PI / 2)).thenReturn(Double.POSITIVE_INFINITY);
        when(sec.sec(PI / 2)).thenReturn(Double.POSITIVE_INFINITY);
        when(sec.sec(PI)).thenReturn(-1.0);
        when(sec.sec(-PI)).thenReturn(-1.0);

        when(sec.sec(-3)).thenReturn(-1.01010866591);
        when(sec.sec(-2)).thenReturn(-2.40299796172);

        when(sec.sec(-1)).thenReturn(1.85081571768);
        when(sec.sec(-0.22)).thenReturn(1.0246978314);

        when(sec.sec(0.3)).thenReturn(1.04675160154);
        when(sec.sec(1.3)).thenReturn(3.73833412708);

        when(sec.sec(2.23)).thenReturn(-1.63268620633);
        when(sec.sec(3.1)).thenReturn(-1.00086559834);

        // 2PI offser
        when(sec.sec(-3 + 2 * PI)).thenReturn(-1.01010866591);
        when(sec.sec(-2 + 2 * PI)).thenReturn(-2.40299796172);

        when(sec.sec(-1 + 2 * PI)).thenReturn(1.85081571768);
        when(sec.sec(-0.22 + 2 * PI)).thenReturn(1.0246978314);

        when(sec.sec(0.3 + 2 * PI)).thenReturn(1.04675160154);
        when(sec.sec(1.3 + 2 * PI)).thenReturn(3.73833412708);

        when(sec.sec(2.23 + 2 * PI)).thenReturn(-1.63268620633);
        when(sec.sec(3.1 + 2 * PI)).thenReturn(-1.00086559834);

        return sec;
    }

    public static Log createLog() throws Exception{
        Log log = mock(Log.class);

        when(log.log(2, 0.123)).thenReturn(-3.0232697793);
        when(log.log(2, 0.211)).thenReturn(-2.244685096);
        when(log.log(2, 1.213)).thenReturn(0.27857955046);
        when(log.log(2, 2.456)).thenReturn(1.2963105607);
        when(log.log(2, 7.311)).thenReturn(2.8700687518);
        when(log.log(2, 77.666)).thenReturn(6.2792112602);
        when(log.log(2, 1777.666)).thenReturn(10.795768571);

        when(log.log(3, 0.123)).thenReturn(-1.9074708568);
        when(log.log(3, 0.211)).thenReturn(-1.4162386144);
        when(log.log(3, 1.213)).thenReturn(0.17576412712);
        when(log.log(3, 2.456)).thenReturn(0.81788090262);
        when(log.log(3, 7.311)).thenReturn(1.8108117703);
        when(log.log(3, 77.666)).thenReturn(3.961741213);
        when(log.log(3, 1777.666)).thenReturn(6.8113716041);

        when(log.log(5, 0.123)).thenReturn(-1.3020514227);
        when(log.log(5, 0.211)).thenReturn(-0.96673325108);
        when(log.log(5, 1.213)).thenReturn(0.11997768194);
        when(log.log(5, 2.456)).thenReturn(0.55829057048);
        when(log.log(5, 7.311)).thenReturn(1.2360713315);
        when(log.log(5, 77.666)).thenReturn(2.704309093);
        when(log.log(5, 1777.666)).thenReturn(4.6494844499);

        return log;
    }

    public static Ln createLn() throws Exception {
        Ln log = mock(Ln.class);

        when(log.ln(0.123)).thenReturn(-2.0955709236);
        when(log.ln(0.211)).thenReturn(-1.5558971455);
        when(log.ln(1.213)).thenReturn(0.19309662996);
        when(log.ln(2.456)).thenReturn(0.89853401028);
        when(log.ln(7.311)).thenReturn(1.9893800633);
        when(log.ln(77.666)).thenReturn(4.3524175812);
        when(log.ln(1777.666)).thenReturn(7.4830565469);

        return log;
    }
}

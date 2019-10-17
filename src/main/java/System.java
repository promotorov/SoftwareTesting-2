public class System extends AbstractModule {
    private Sec sec;
    private Ctg ctg;
    private Tang tang;
    private Cos cos;

    private Log log;
    private Ln ln;

    public System(Sec sec, Ctg ctg, Tang tang, Cos cos, Log log, Ln ln) {
        this.sec = sec;
        this.ctg = ctg;
        this.tang = tang;
        this.cos = cos;
        this.log = log;
        this.ln = ln;
    }

    public double calc(double x) {
        if (x <= 0)
            return Math.pow( (((sec.sec(x) + sec.sec(x) - ctg.ctg(x)) - tang.tang(x))) - (tang.tang(x) * cos.cos(x)), 2);
        else {
            double left = Math.pow(Math.pow(log.log(2, x) / log.log(3, x), 3) - (ln.ln(x) * log.log(5, x)), 2);
            double right = (log.log(5, x) * log.log(2, x)) - ((log.log(10, x) - log.log(10, x)) / log.log(5, x));
            return left * right;
        }
    }

    @Override
    public double calcModule(double x) {
        try {
            return calc(x);
        } catch (Exception e) {
            e.printStackTrace();
            return -999;
        }
    }
}

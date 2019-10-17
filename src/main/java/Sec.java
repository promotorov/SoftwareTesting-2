public class Sec extends AbstractModule {
    private Cos cos;

    public Sec(Cos cos) {
        this.cos = cos;
    }

    public double sec(double x) {
        return 1 / cos.cos(x);
    }

    @Override
    public double calcModule(double x) {
        return sec(x);
    }
}

public class Sin extends AbstractModule {
    private Cos cos;

    public Sin(Cos cos) {
        this.cos = cos;
    }

    public double sin(double x) {
        double r = Math.sqrt(1 - Math.pow(cos.cos(x), 2));
        x %= 2 * Math.PI;
        if (x >=0 && x <= Math.PI)
            return r;
        if (x >= -2*Math.PI && x <= -Math.PI)
            return r;
        else
            return -r;
    }

    @Override
    public double calcModule(double x) {
        return sin(x);
    }
}

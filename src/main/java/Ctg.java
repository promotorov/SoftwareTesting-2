public class Ctg extends AbstractModule {
    private Sin sin;

    public Ctg(Sin sin) {
        this.sin = sin;
    }

    public double ctg(double x) {
        double r = Math.sqrt(1 / Math.pow(sin.sin(x), 2) - 1);
        x %= 2 * Math.PI;
        if ((x >=0 && x <= Math.PI/2) || (x >=Math.PI && x <= Math.PI/2*3))
            return r;
        if ((x >=-Math.PI && x <= -Math.PI/2) || (x >=-2*Math.PI && x <= -Math.PI/2*3))
            return r;
        else
            return -r;
    }

    @Override
    public double calcModule(double x) {
        return ctg(x);
    }
}

public class Ctg {
    private Sin sin;

    public Ctg(Sin sin) {
        this.sin = sin;
    }

    public double ctg(double x) {
        return Math.sqrt(1 / Math.pow(sin.sin(x), 2) - 1);
    }
}

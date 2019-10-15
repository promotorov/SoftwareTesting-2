public class Tang {
    private Ctg ctg;

    public Tang(Ctg ctg) {
        this.ctg = ctg;
    }

    public double tang(double x) {
        return 1 / ctg.ctg(x);
    }
}

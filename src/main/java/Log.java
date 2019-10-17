public class Log {
    private Ln ln;

    public Log(Ln ln) {
        this.ln = ln;
    }

    public double log(int b, double x) {
        return ln.ln(x) / ln.ln(b);
    }
}

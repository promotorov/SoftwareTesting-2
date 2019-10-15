public class Sin {
    private Cos cos;

    public Sin(Cos cos) {
        this.cos = cos;
    }

    public double sin(double x) {
        return Math.sqrt(1 - Math.pow(cos.cos(x), 2));
    }
}

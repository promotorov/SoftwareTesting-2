public class Cos extends AbstractModule {
    public double accuracy = 0.000001;

    private double factorial(int val) {
        //if (val >= 16)
            //return 1000000;
        if(val <= 1)
            return 1.0;
        else
            return val * (factorial(val - 1));
    }

    public double cos(double x) {
        x %= Math.PI * 2;

        if (x > Math.PI)
            x = -Math.PI + x % Math.PI;
        else if (x < -Math.PI)
            x = Math.PI + x % Math.PI;

        double result = 0;
        double prevResult = 0;
        for (int i = 0; ; i++) {
            double f = factorial(i * 2);
            result += Math.pow(-1, i) * Math.pow(x, i * 2) / factorial(i * 2);
            if (Math.abs(result - prevResult) < accuracy || i > 16)
                return result;
            else
                prevResult = result;
        }
    }

    @Override
    public double calcModule(double x) {
        return cos(x);
    }
}

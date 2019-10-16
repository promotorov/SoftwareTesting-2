public class Cos {
    public double accuracy = 0.01;

    private int factorial(int val) {
        if(val <= 1)
            return 1;
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
            result += Math.pow(-1, i) * Math.pow(x, i * 2) / factorial(i * 2);
            if (Math.abs(result - prevResult) < accuracy || i > 10000)
                return result;
            else
                prevResult = result;
        }
    }
}

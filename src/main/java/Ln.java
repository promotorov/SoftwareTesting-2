public class Ln extends AbstractModule {
    public double accuracy = 0.000000001;

    public double ln(double x)  {
        double result = 0;
        double prevResult = 0;

        for (int i = 0; ; i++) {
            result +=  Math.pow((x - 1) / (x + 1), i * 2 + 1) / (i * 2 + 1) * 2;
            if (Math.abs(result - prevResult) < accuracy || i > 1000000)
                return result;
            else
                prevResult = result;
        }
    }

    @Override
    public double calcModule(double x) {
        double result;
        try {
            result = ln(x);
        } catch (Exception e) {
            e.printStackTrace();
            result = -999;
        }
        return result;
    }
}

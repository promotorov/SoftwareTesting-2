public class Ln {
    public double accuracy = 0.000000001;

    public double ln(double x) throws Exception {
        double result = 0;
        double prevResult = 0;

        if (x <= 0)
            throw new Exception();

        for (int i = 0; ; i++) {
            result +=  Math.pow((x - 1) / (x + 1), i * 2 + 1) / (i * 2 + 1) * 2;
            if (Math.abs(result - prevResult) < accuracy || i > 1000000)
                return result;
            else
                prevResult = result;
        }
    }
}

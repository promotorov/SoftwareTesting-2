public class Main {
    public static void main(String[] args) throws Exception{
        CSVBuilder b = new CSVBuilder(new Cos());
        b.write(0, 10, 0.1);
    }
}

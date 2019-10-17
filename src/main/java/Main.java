public class Main {
    public static void main(String[] args) throws Exception{
        CSVBuilder b = new CSVBuilder(new Sin(new Cos()));
        b.write(3, 3.2, 0.1);
    }
}

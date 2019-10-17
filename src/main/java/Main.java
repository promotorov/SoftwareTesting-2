public class Main {
    public static void main(String[] args) throws Exception{
        CSVBuilder b = new CSVBuilder(new System(new Sec(new Cos()), new Ctg(new Sin(new Cos())), new Tang(new Ctg(new Sin(new Cos()))), new Cos(), new Log(new Ln()), new Ln()));
        b.write(0, 1000, 0.1);
    }
}

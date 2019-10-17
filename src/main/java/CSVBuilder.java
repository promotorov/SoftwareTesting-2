import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class CSVBuilder {
    char SEPARATOR = ',';
    boolean append = false;
    private AbstractModule module;

    public CSVBuilder(AbstractModule module) {
        this.module = module;
    }

    public void write(double from, double to, double step){
        try (FileWriter writer = new FileWriter(getFilename(), append)) {
            for (double x = from; x < to; x += step) {
                double value = module.calcModule(x);
                writer.append(String.format(Locale.US, "%f%s%f\n", x, SEPARATOR, value));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFilename(){
        String moduleName = this.module.getClass().getSimpleName();
        if(moduleName == null){
            moduleName = "module";
        }
        return moduleName + "-data.csv";
    }

}

package Assignment6;
//Jlon Manning Jmanning14@toromail.csudh.edu
import java.io.*;

public class FileCurrencyLoader extends AbstractCurrencyLoader {
    private static final String FILE_NAME = "currencies.csv";

    @Override
    protected InputStream getInputStream() throws IOException {
        return new FileInputStream(FILE_NAME);
    }
}

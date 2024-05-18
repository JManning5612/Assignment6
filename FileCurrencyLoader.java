package Assignment6;
import java.io.*;

public class FileCurrencyLoader extends AbstractCurrencyLoader {
    private static final String FILE_NAME = "currencies.csv";

    @Override
    protected InputStream getInputStream() throws IOException {
        return new FileInputStream(FILE_NAME);
    }
}

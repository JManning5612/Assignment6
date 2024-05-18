package Assignment6;
import java.io.*;
import java.net.*;

public class NetworkCurrencyLoader extends AbstractCurrencyLoader {
    private static final String URL_STRING = "http://www.usman.cloud/banking/exchange-rate.csv";

    @Override
    protected InputStream getInputStream() throws IOException {
        URL url = new URL(URL_STRING);
        return url.openStream();
    }
}


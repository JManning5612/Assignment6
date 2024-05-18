package Assignment6;
//Jlon Manning Jmanning14@toromail.csudh.edu
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


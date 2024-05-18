package Assignment6;
//Jlon Manning Jmanning14@toromail.csudh.edu
import java.io.*;
import java.util.*;

import Lab14.MyCurrency;

public abstract class AbstractCurrencyLoader {
    public Map<String, MyCurrency> loadCurrencies() throws IOException {
        Map<String, MyCurrency> currencies = new HashMap<>();
        try (InputStream inputStream = getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String currencyCode = parts[0].trim();
                    double exchangeRate = Double.parseDouble(parts[1].trim());
                    currencies.put(currencyCode, new MyCurrency(currencyCode, exchangeRate));
                }
            }
        }
        return currencies;
    }

    protected abstract InputStream getInputStream() throws IOException;
}

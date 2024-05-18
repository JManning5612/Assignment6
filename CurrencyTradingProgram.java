package Assignment6;
//Jlon Manning Jmanning14@toromail.csudh.edu
import java.io.IOException;
import java.util.Map;

import Lab14.MyCurrency;

public class CurrencyTradingProgram {
    public static void main(String[] args) {
        try {
            AbstractCurrencyLoader fileLoader = new FileCurrencyLoader();
            Map<String, MyCurrency> fileCurrencies = fileLoader.loadCurrencies();
            System.out.println("File currencies: " + fileCurrencies);

            AbstractCurrencyLoader networkLoader = new NetworkCurrencyLoader();
            Map<String, MyCurrency> networkCurrencies = networkLoader.loadCurrencies();
            System.out.println("Network currencies: " + networkCurrencies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



/**
 * Created by Gaming on 4/24/2015.
 */
public class EuroStrategy implements CountStrategy{
    private int totalCoins = 0;
    private Integer change, dollars;

    public int calculateChange(String coinString) {
        dollars = Integer.parseInt(coinString.substring(1, coinString.indexOf(".")));
        change = Integer.parseInt(coinString.substring(coinString.length()-2));
        processTwoDollars();
        processDollars();
        processQuarters();
        processDimes();
        processNickles();
        processPennies();
        return totalCoins;
    }

    private void processTwoDollars() {
        totalCoins = dollars / 2;
        dollars = dollars % 2;
    }

    public void processDollars() {
        totalCoins = totalCoins + dollars;
    }


    public void processQuarters() {
        totalCoins += change / 25;
        change = change % 25;
    }

    public void processDimes() {
        totalCoins += change / 10;
        change = change % 10;
    }

    public void processPennies() {
        totalCoins += change;
    }

    public void processNickles() {
        totalCoins += change / 5;
        change = change % 5;
    }
}

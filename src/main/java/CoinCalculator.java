/**
 * Created by Gaming on 4/23/2015.
 */
public class CoinCalculator {
    private CountStrategy myStrategy;
    public void setStrategy(CountStrategy strategy) {
        this.myStrategy = strategy;
    }

    public int processChange(String s){
        if(s.charAt(0) == '$'){
            this.setStrategy(new DollarStrategy());
        }
        else{
            this.setStrategy(new EuroStrategy());
        }
        return myStrategy.calculateChange(s);
    }
}
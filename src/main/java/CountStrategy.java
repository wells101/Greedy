/**
 * Created by Gaming on 4/24/2015.
 */
public interface CountStrategy {
    public int calculateChange(String s);
    public void processDollars();
    public void processQuarters();
    public void processDimes();
    public void processNickles();
    public void processPennies();
}

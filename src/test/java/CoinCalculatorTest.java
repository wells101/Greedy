/**
 * Created by Gaming on 4/23/2015.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinCalculatorTest{
    CoinCalculator c;

    @Before
    public void setUp() throws Exception {
        c = new CoinCalculator();
    }

    @Test
    public void zeroChangeGivesZeroCoins() throws Exception {
        int coins = c.processChange("$0.00");
        assertEquals(0, coins);
    }

    @Test
    public void testPennyGivesOneCoin() throws Exception {
        int coins = c.processChange("$0.01");
        assertEquals(1, coins);
    }

    @Test
    public void testSixCentsGivesTwoCoins() throws Exception {
        int coins = c.processChange("$0.06");
        assertEquals(2, coins);

    }

    @Test
    public void testSixteenCentsGivesThreeCoins() throws Exception {
        int coins = c.processChange("$0.16");
        assertEquals(3, coins);

    }

    @Test
    public void testFortyOneCentsGivesFourCoins() throws Exception {
        int coins = c.processChange("$0.41");
        assertEquals(4, coins);

    }

    @Test
    public void testOneFortyOneGivesFiveCoins() throws Exception {
        int coins = c.processChange("$1.41");
        assertEquals(5, coins);
    }

    @Test
    public void testOneFortyTwoGivesSixCoins() throws Exception {
        int coins = c.processChange("$1.42");
        assertEquals(6, coins);

    }

    @Test
    public void testWorksForEuroReturnsOneCoin() throws Exception {
        int coins = c.processChange("€1.00");
        assertEquals(1, coins);

    }

    @Test
    public void testSevenEurosgivesThreeCoins() throws Exception {
        EuroStrategy myStrategy = new EuroStrategy();
        int coins = myStrategy.calculateChange("€7.00");
        assertEquals(4, coins);

    }
}

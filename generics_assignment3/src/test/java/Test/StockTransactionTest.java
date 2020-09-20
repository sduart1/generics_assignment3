
package Test;

import Enum.StockSymbolType;
import static Enum.StockSymbolType.AMZ;
import static Enum.StockSymbolType.APPL;
import Main.StockTransaction;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;


public class StockTransactionTest {
    
    /**
     * @param: transaction new Stock Transaction implementation
     * @param: price new BigDecimal value
     * @param: stockSymbol any enum from Stock Symbol enum class
     * @param: time new time in millis
     * 
     */
    StockTransaction transaction;
    BigDecimal price;
    StockSymbolType stockSymbol;
    Timestamp time;
    
    
    /**
     *  Set a new price and symbol then build a new transaction
     */
    @Before
    public void setUp(){
       price = new BigDecimal(50);
       stockSymbol = APPL;
       time = new Timestamp (Calendar.getInstance().getTimeInMillis());
       transaction = new StockTransaction(price, stockSymbol, time);
    }
    
    // test the transaction isn't null
    @Test
    public void testStockTransaction(){
        assertNotNull("Stock Transaction test failed", transaction);
    }
    
    // test the price was received properly
    @Test
    public void testPrice(){
        Object priceChecker = transaction.getPrice();
        BigDecimal comparePrice = new BigDecimal(50);
        assertEquals("Price check failed", priceChecker, comparePrice);
    }
    
    // test the symbol was received properly
    @Test
    public void testStockSymbol(){
        Object stockSymbolCheck = transaction.getStockSymbol();
        assertEquals("Symbol test failed", stockSymbolCheck, APPL);
    }
    
    // test the time was received properly
    @Test
    public void testTime(){
        Object timeCheck = transaction.getTime();
        assertEquals("Time test failed", timeCheck, time);
    }
    
  
}

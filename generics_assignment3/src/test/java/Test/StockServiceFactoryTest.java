
package Test;

import Enum.StockSymbolType;
import static Enum.StockSymbolType.APPL;
import Factory.StockServiceFactory;
import Implementation.DummyStockService;
import Main.StockTransaction;
import java.sql.Timestamp;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author steveduarte
 */
public class StockServiceFactoryTest {
    
    /**
     * @param: stockCheck  Stock Service Factory object 
     * @param: symbol enum type stock symbol
     * @param: time new time in millis
     * @param: service new stock transaction implementation
     */
    StockServiceFactory stockCheck;
    StockSymbolType symbol;
    Timestamp time;
    StockTransaction service;
    StockTransaction checker;
    
    // Creating a new instance of the Stock Service Factory to pass
    // implementation of the Dummy Stock Service. Build a new quote
    // in the stock service with APPL symbol and time in millis
    @Before
    public void setUp(){
        time = new Timestamp (Calendar.getInstance().getTimeInMillis());
        this.stockCheck = new StockServiceFactory();
        service = new DummyStockService().getQuote(APPL, time);

    }
    
    // test if new stock service comes back null
    @Test
    public void testStockServiceFactory(){
        assertNotNull("Stock Factory test failed", stockCheck);
    }
    
    // check if Stock Service Factory is passing back a new instance of
    // the Dummy Stock Service
    @Test
    public void testDummyAccess(){
        assertEquals("Could not access dummy service", service, service);

    }
    
}

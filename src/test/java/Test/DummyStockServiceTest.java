
package Test;

import Enum.StockSymbolType;
import static Enum.StockSymbolType.APPL;
import Implementation.DummyStockService;
import Interface.StockService;
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
public class DummyStockServiceTest {
 
    /**
     * @param: service new Dummy Stock Service 
     * @param: time new time in millis
     */
    DummyStockService service; 
    Timestamp time;
    
    /**
     * Create a new instance of the Dummy Stock Service and get a new quote
     */
    @Before
    public void setUp(){
        this.service = new DummyStockService();
        time = new Timestamp (Calendar.getInstance().getTimeInMillis());
        service.getQuote(APPL, time);
    }
 
    // test the service didn't come back null
    @Test
    public void testDummyStockService(){
        assertNotNull("Failed to test the dummy stock service", service);         
    }
    
    // test to make sure you were able to create a new dummy stock service 
    @Test
    public void testImplementation(){
        assertEquals("Service not instantiated", service, new DummyStockService());
    }
    
}

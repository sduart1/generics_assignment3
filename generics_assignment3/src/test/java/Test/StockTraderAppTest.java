
package Test;

import Main.StockTraderApp;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author steveduarte
 */
public class StockTraderAppTest {
    
    /**
     * @param:stockApp A new instance of the main application
     */
    StockTraderApp stockApp;
    
    // create a new instance of the main app
    @Before
    public void setUp(){
      this.stockApp = new StockTraderApp();  
    }
    
    // test the main app isn't null
    @Test
    public void testMainApp(){
        assertNotNull("Main app test failed", stockApp);
    }
   
}


package Factory;

import Implementation.DummyStockService;
import Interface.StockService;

/**
 *
 * @author steveduarte
 */
public class StockServiceFactory {
    
    // public class that gets a new stock service implementation and returns it
    public StockService getStockService(){
       return new DummyStockService();
    }
}

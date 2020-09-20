
package Main;

import static Enum.StockSymbolType.APPL;
import Factory.StockServiceFactory;
import Interface.StockService;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 * Client code for the StockService application.
 */
public class StockTraderApp {

    public static void main(String[] args) {
	
        // set the time related variables for getting new quotes
        Timestamp time = new Timestamp (Calendar.getInstance().getTimeInMillis());
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();
        
        // create a new instance of the DummyStockService
        // through the stock service factory 
        StockServiceFactory stockFactory = new StockServiceFactory();
        StockService service = stockFactory.getStockService();
       
        // pass some arguments to the getQuote method in DummyStockService
        service.getQuote(APPL, time);
        
        // pass some arguments to the getQuote method with specific dates
        // in DummyStockService
        service.getQuote(APPL, from, to);
      
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Enum.StockSymbolType;
import static Enum.StockSymbolType.APPL;
import Interface.StockService;
import Main.StockTransaction;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author steveduarte
 */
public class StockServiceTest {
    
    
    /**
     * To test the interface I have made a new implementation
     */
    StockService newStockService = new StockService() {
       
        // create the first get quote method
        @Override
        public StockTransaction getQuote(StockSymbolType symbol, Timestamp timeOfTransaction) {
            Timestamp timestamp = new Timestamp ( Calendar.getInstance().getTimeInMillis());
            return new StockTransaction(new BigDecimal(100), StockSymbolType.APPL, timestamp);
        }


        // second get quote method with dates
        @Override
        public List<StockTransaction> getQuote(StockSymbolType symbol, Calendar from, Calendar until) {
            List <StockTransaction> stockTransactions = new ArrayList<>();
            Timestamp timestamp = new Timestamp ( Calendar.getInstance().getTimeInMillis());
            stockTransactions.add( new StockTransaction (new BigDecimal(100), StockSymbolType.APPL, timestamp));
            return stockTransactions;

            }
        };
   
    @Before
    public void setUp(){
        
    }
     
     
     // test the stock service implementation isn't null
     @Test
     public void testStockServiceInterface (){
         assertNotNull("Failed to test interface", newStockService);
     }
      
}

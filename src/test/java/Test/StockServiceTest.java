/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Interface.StockService;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author steveduarte
 */
public class StockServiceTest {
    
    /**
     * @param:stockService object of type Stock Service
     */
     StockService stockService;

     // instantiate a new Stock Service 
     public StockServiceTest(StockService stockService){
         this.stockService = stockService;
     }
     
     // test the stock service isn't null
     @Test
     public void testStockServiceInterface (){
         assertNotNull("Failed to test interface", stockService);
     }
      
}

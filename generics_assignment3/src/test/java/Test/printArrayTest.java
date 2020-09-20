
package Test;

import static ArrayMethod.printArray.printArray;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author steveduarte
 */
public class printArrayTest {

        String[] strArray = {"Hello", "World"};
        Integer[] intArray = {1,2,3};
        
        
        @Before
        public void setUp(){
        }
          
        // pass the integer array to the method to be printed
        @Test
        public void intTest(){
         printArray(intArray);
        }
        
        // pass the string array to the method to be printed
        @Test 
        public void stringTest(){
          printArray(strArray);
        }
       
        
    
}

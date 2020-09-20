/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Container.myContainer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author steveduarte
 */
public class myContainerTest {
    
    /**
     * @param:myContainer<Integer> passing an Integer to myContainer
     * @param:myContainer<String> passing a String to myContainer
     * @param:myContainer<Integer> passing a Double to myContainer
     */
    private myContainer<Integer> integerContainer;
    private myContainer<String> stringContainer;
    private myContainer<Double> doubleContainer;


    // set new instances of container objects to test
    @Before
    public void setUp(){
        integerContainer = new myContainer<>(10);
        stringContainer = new myContainer<>("Test");
        doubleContainer = new myContainer<>(2.5);
       
    }
    
    // test the container value isn't null
    @Test
    public void testmyContainer(){
        assertNotNull("Integer assignment failed", integerContainer);
    }
    
    // test integer values being passed
    @Test
    public void intCheck(){      
      Object value = integerContainer.getValue();
      assertEquals("Input test failed", value, 10);
    }
    
    // test string value being passed
    @Test 
    public void stringCheck(){
        Object string = stringContainer.getValue();
        assertEquals("String test failed", string, "Test");
    }
    
    // test double value being passed
    @Test
    public void doubleCheck(){
        Object doubleVal = doubleContainer.getValue();
        assertEquals("Double test failed", doubleVal, 2.5);
    }
    
    
       
}

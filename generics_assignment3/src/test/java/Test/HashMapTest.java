/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import HashMap.myHashMap;
import java.util.HashMap;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author steveduarte
 */
public class HashMapTest {
    
    myHashMap map;
    
    @Before
    public void setUp(){
        this.map = new myHashMap();
    }
    
    @Test
    public void testHashMap(){
        assertNotNull("Hash map creation failed", map);
    }
    
    
}

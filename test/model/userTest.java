/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ZY LAPTOP
 */
public class userTest {
    
    public userTest() {
    }
    
    
    @Test
    public void testValidate() {
        System.out.println("validate");
          user s = new user("malak@gmail.com","azerty");
       // boolean expResult = false;
        boolean result = s.validate();
        assertEquals(true, result);
      
    }
    
}

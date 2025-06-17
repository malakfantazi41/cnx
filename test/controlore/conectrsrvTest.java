/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlore;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author ZY LAPTOP
 */
public class conectrsrvTest {
    
    public conectrsrvTest() {
    }
    
  
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher =mock( RequestDispatcher.class);
       
          when(request.getParameter("email")).thenReturn("malak@gmail.com ");
          when(request.getParameter("password")).thenReturn("azerty");
          when(request.getRequestDispatcher("success.jsp")).thenReturn(dispatcher);
             conectrsrv srs= new  conectrsrv ();
             srs.doPost(request, response); 
             
             verify(request).setAttribute("result", true);
             verify(dispatcher).forward(request, response);
    }
    }
    
}

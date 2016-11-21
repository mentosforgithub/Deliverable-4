
package Domain;
import gameoflife.*;
import junit.framework.Assert;

import org.mockito.*;//googled this import commands 
import org.mockito.Mock;  
import org.mockito.MockitoAnnotations;  
import org.mockito.ArgumentCaptor;  
import static org.mockito.Mockito.*;  

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
public class CellTest {
    @Test
    public void ToStringNotAlive(){
        Cell c =new Cell(false);
        Assert.assertEquals(c.toString(),".");
    }
    @Test
    public void ToStringAlive(){
        Cell c =new Cell(true);
        Assert.assertEquals(c.toString(), "X");
    }
    @Test
    public void ToStringWrong(){
        Cell c = new Cell();
        c.setText("aaa");
        Assert.assertEquals(c.toString(), ".");
    }
}

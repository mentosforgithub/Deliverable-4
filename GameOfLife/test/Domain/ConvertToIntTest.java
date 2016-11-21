/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import gameoflife.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.Assert;
public class ConvertToIntTest {
	//change this to static before reflection
	private static Method convertToInt;			
	private static MainPanel panel;

	@BeforeClass
	public static void NewMethods() throws Exception {
                           convertToInt = MainPanel.class.getDeclaredMethod("convertToInt", int.class);//convert this private method to reflection
                           convertToInt.setAccessible(true);//accessible
	}
	@Before
	public void NewMP() {
                            panel = new MainPanel(12);//initilize a new MainPanel
	}
                 @Test
                 public void TestRight()throws InvocationTargetException, IllegalAccessException{
                     Object ob=convertToInt.invoke(panel, 5);//5 is the arg
                     int result =(Integer)ob;//change this object to int result to assertequal
                     Assert.assertEquals(result, 5);
                 }
                 @Test
                 public void TestZero()throws InvocationTargetException, IllegalAccessException{
                     Object ob=convertToInt.invoke(panel, 0);//5 is the arg
                     int result =(Integer)ob;//change this object to int result to assertequal
                     Assert.assertEquals(result, 0);
                 }
                 @Test
                 public void TestMinus()throws InvocationTargetException, IllegalAccessException{
                     Object ob=convertToInt.invoke(panel, -5);//5 is the arg
                     int result =(Integer)ob;//change this object to int result to assertequal
                     Assert.assertEquals(result, -5);
                 }
}
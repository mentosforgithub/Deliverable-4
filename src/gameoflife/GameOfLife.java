/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author hment
 */
public class GameOfLife {

   private static void showErrorMessage() {
	System.out.println("Usage: java GameOfLife <size>");
	System.out.println("Size must be a positive integer");
	System.exit(1);
    }
    public static void main(String[] args) {
        int size = -1;
	
	if (args.length != 1) {
	    showErrorMessage();
	}
	
	try {
	    size = Integer.parseInt(args[0]);
	} catch (Exception ex) {
	    showErrorMessage();
	}
	    
	MainFrame mf = new MainFrame(size);
    }
    }
    


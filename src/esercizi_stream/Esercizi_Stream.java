/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esercizi_stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olgac
 */
public class Esercizi_Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		int intValue = Integer.parseInt(line);
	    
		System.out.println("Valore: " + intValue);
		in.close();

                in.close();
                BufferedReader inR = new BufferedReader (new InputStreamReader (System.in));
        try {
            int lineR = inR.read();
        } catch (IOException ex) {
            Logger.getLogger(Esercizi_Stream.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
	}
    }
    


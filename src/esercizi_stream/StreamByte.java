/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author olgac
 */
public class StreamByte {
   
    public static void main(String[] args) { 
    }
    
    public static void copyBytes(){
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            try {
                in = new FileInputStream("xanadu.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StreamByte.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                out = new FileOutputStream("outagain.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StreamByte.class.getName()).log(Level.SEVERE, null, ex);
            }
            int c;

            try {
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            } catch (IOException ex) {
                Logger.getLogger(StreamByte.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(StreamByte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(StreamByte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
    


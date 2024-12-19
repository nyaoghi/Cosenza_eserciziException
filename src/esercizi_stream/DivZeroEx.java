/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_stream;

/**
 *
 * @author olgac
 */
public class DivZeroEx {
        public static void main(String[] args) {
        //metodo test 
        testDividi();
    }
   //test
    public static int dividi(int n, int d) throws ArithmeticException {
        if(d == 0){
            throw new ArithmeticException("Non è possibile dividere per zero");
        }
        return n / d;
        }
    
     public static void testDividi() {
        try {
           
            int risultato = dividi(10, 0);
            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
           
            System.out.println("Si è verificato un errore: " + e.getMessage());
        } finally {
            
            System.out.println("Operazione eseguita");
        }
    }

    }
    


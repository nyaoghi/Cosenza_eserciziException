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
        // Chiamata al metodo che testa l'eccezione
        testDividi();
    }
    //test di un'eccezione aritmetica
    public static int dividi(int n, int d) throws ArithmeticException {
        if(d == 0){
            throw new ArithmeticException("Non è possibile dividere per zero");
        }
        return n / d;
        }
    
     public static void testDividi() {
        try {
            // Chiamata al metodo che può lanciare l'eccezione
            int risultato = dividi(10, 0);
            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
            // Gestione dell'eccezione
            System.out.println("Si è verificato un errore: " + e.getMessage());
        } finally {
            
            System.out.println("Operazione eseguita");
        }
    }

    }
    


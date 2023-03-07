
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proceso2 extends Thread {
   
@Override
	public void run(){
               
 for(int c=1;c<=20;c++){
 System.out.print(c + " km ");
     try {
         Proceso2.sleep(1500);
     } catch (InterruptedException ex) {
         
         System.out.println("\n DISTANCIA RECORRIDA POR EL AUTO ROJO ");
     }
 }
 }    
}
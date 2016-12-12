/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.io.*;
/**
 *
 * @author administrador
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      Runtime r=Runtime.getRuntime();
     // String comando="lss";
		String comando="java Ejemplo1.class";
	  //String comando="java Ejercicio2";
      Process p=null;
      try{
         p=r.exec(comando);
         InputStream is=p.getInputStream();
         BufferedReader br=new BufferedReader(new InputStreamReader(is));
         String linea;
	      while((linea=br.readLine())!=null){ //lee una linea
            System.out.println(linea);
 	 		}
	      br.close();
      }catch(Exception e) {
         System.out.println("Errojhkhkkjhr en: "+comando);
          System.out.println("comprobando....");
         e.printStackTrace();
      }
      //COMPROBACION DE ERROR - 0 bien - 1 mal
      int exitVal;
      try{
         exitVal=p.waitFor();
         System.out.println("Valor de Salida: "+exitVal);
      }catch(InterruptedException e){
         e.printStackTrace();
      }
   }
    
}

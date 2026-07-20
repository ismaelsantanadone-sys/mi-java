package JavaApplicacion13;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class switsh {
  public static void main (String[] args) throws FileNotFoundException{
      try {
          Scanner entrada = new Scanner(System.in);
          int e=entrada.nextInt();
          switch(e){
              case 1:
                  System.out.println("es 1");
                  break;
              case 2:
                  System.out.print("es el 2");
                  break;
          }
          File archivo = new File("C:\\Users\\Ismael\\Desktop\\Hollow Knight Optimizado");
          System.out.println ("¿existe? "+archivo.exists());
          System.out.println ("¿se puede leer? "+archivo.canRead());
          System.out.println ("¿se puede escribir? "+archivo.canWrite());
          FileReader archivo1 = new FileReader("C:\\Users\\Ismael\\Desktop\\Hollow Knight Optimizado\\Informacion.txt");
          BufferedReader leer=new BufferedReader(archivo1);
          String linea=leer.readLine();
          while(linea!=null){
          System.out.println(linea);
          linea=leer.readLine();
          }
      } catch (IOException ex) {
          Logger.getLogger(switsh.class.getName()).log(Level.SEVERE, null, ex);
      }
    
  }

}

import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AngelJair
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        String linea;
        int opcion;
        try{
            String nombrea = "src/datos.txt";
            File archivo = new File(nombrea);
            FileReader lector = new FileReader(archivo);
            Scanner sc = new Scanner(lector);
            while(sc.hasNextLine()){
                linea=sc.nextLine();
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }
    }
}
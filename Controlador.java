
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WALTER1
 */
public class Controlador {
    
    public String[] grupo;
    public String[][] MegaGrupo;
    
     public String LeerInventario(String ruta){
        
        String inventario="";
        File myObj = new File(ruta);
        try {
            
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              
              inventario=inventario+"\n"+data+"|10";
              Agrupar(inventario);
              //System.out.println(data);
        }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
        
        JOptionPane.showMessageDialog(null, inventario);
        
        return inventario;
    }
     
     
     
     public void Agrupar(String data){

         grupo=data.split("\n");
         /*
         for (int i = 0; i < grupo.length; i++){
             String separar=grupo[i];
             separar=separar.split("|");
             
          
         }
         */
     }
     
     public ArrayList RetornarGrupo(){
         
         
         ArrayList<String[]> inventario=new ArrayList();
         String[] sep={};
         for (int i = 0; i < grupo.length; i++){
             String separar=grupo[i];
             
             sep=separar.split("\\|");
             
             inventario.add(sep);
             for (int j = 0; j < sep.length; j++){
             
                 
                 //System.out.println(sep[j]);
             }
             
             
         }
             
             
         
         
         
         
         
         
         
         return inventario;
     }
    
}


import java.io.File;
import java.io.FileNotFoundException;
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
public class Main {
    
    public static void main(String[]args){
        
        
        Vista vista = new Vista();
        Controlador control= new Controlador();
        
        vista.ImprimirBienvenida();
        
        
        System.out.println("la lista es: ");
        
        
        
        String ruta=vista.PedirRuta();
        
        vista.ImprimirMenuPrincipal();
        
        
        
        
        ruta = "C:\\Users\\walte\\OneDrive\\Documentos\\NetBeansProjects\\HojaDeTrabajo6\\src\\ListadoProducto.txt";
       
        
        String Menu=vista.ImprimirMenuPrincipal();
        String inventario="";
        
        
        switch(Integer.parseInt(Menu)){
            
            case 1:
                
                break;
            case 2:
                    
                break;
                
            case 3:
                
                
                break;
                
            case 4:
                
                
                break;
                
            case 5:
                
                inventario=control.LeerInventario(ruta);
                vista.ImprimirInventario(inventario);
                String[] grupo=control.RetornarGrupo();
                break;
            
            
            default:
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}   

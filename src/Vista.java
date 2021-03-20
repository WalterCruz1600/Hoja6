
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
public class Vista {
    
    public void ImprimirBienvenida(){
        
        JOptionPane.showMessageDialog(null, "Hola Bienvenido al supermercado Estefania canta hermoso\n Presione enter para ");
        
        
        
    }
    
    public String ImprimirMenuPrincipal(){
        
        String Menu=JOptionPane.showInputDialog("Que opcion desea realizar?\n1.Agregar productos a la carreta\n2.Mostrar Categoria de los productos\n3.Mostrar datos del producto\n4.Mostrar datos del producto (por categoría)\n5.Inventario");
        
        
        
        return Menu;
    } 
    
    public String PedirRuta(){
        
        String ruta=JOptionPane.showInputDialog("Ingrese la ruta: ");
        
        return ruta;
    }
    
    public void ImprimirInventario(String inventario){
       
        
        JOptionPane.showMessageDialog(null, inventario);
        
        
    }
    
    
    
    
    
}


import java.util.ArrayList;
import java.util.Hashtable;
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
        
        
        Hashtable<Integer, String[]> carreta = new Hashtable<Integer, String[]>();
        
        ruta = "C:\\Users\\walte\\OneDrive\\Documentos\\NetBeansProjects\\HojaDeTrabajo6\\src\\ListadoProducto.txt";
       
        
        String Menu=vista.ImprimirMenuPrincipal();
        String inventario="";
        
        
        switch(Integer.parseInt(Menu)){
            //Agregar al carrito
            case 1:
                String opcion="";
                String Escoger1="";
                String Escoger2="";
                String Cant="";
                do{
                    opcion=JOptionPane.showInputDialog("Desea agregar a su carreta?\n1.Si\n2.No\nAgregue el número de la opción que desea hacer");
                    
                    inventario=control.LeerInventario(ruta);
                    ArrayList<String[]> grup=control.RetornarGrupo();


                    ArrayList<String> ListaCat=new ArrayList<String>();
                    String imprimirCat="";

                    for(int i=1; i<grup.size();i++){
                        String[] x=grup.get(i);
                        
                        if(i==1){
                            ListaCat.add(x[0]);
                            imprimirCat=x[0];
                        }else{
                            boolean Encontrado=true;
                            for(int j=0;j<ListaCat.size();j++){
                                
                                if(ListaCat.get(j).equals(x[0])){
                                    
                                    Encontrado=false;
                                    
                                }
                            }
                            if(Encontrado==true){
                                ListaCat.add(x[0]);
                                imprimirCat=imprimirCat+"\n"+x[0];
                            }
                        }
                    }
                    Escoger1=JOptionPane.showInputDialog("Escriba la categoria que esta buscando: \n"+imprimirCat);
                    
                    boolean Valido=false;
                    
                    for(int j=0;j<ListaCat.size();j++){
                        String x=ListaCat.get(j);
                        x=x.replaceAll("^\\s*","");
                        x=x.replaceAll("\\s*$","");
                        ListaCat.set(j, x );
                        
                        
                        if(ListaCat.get(j).equals(Escoger1)){

                            Valido=true;

                        }
                    }
                    
                    
                    
                    if(Valido==true){
                        String imprimirProd="";
                        ArrayList<String> ListaPro=new ArrayList<String>();



                        for(int i=1; i<grup.size();i++){
                            String[] x=grup.get(i);

                            x[0]=x[0].replaceAll("^\\s*","");
                            x[0]=x[0].replaceAll("\\s*$","");
                            x[1]=x[1].replaceAll("^\\s*","");
                            x[1]=x[1].replaceAll("\\s*$","");



                            if(x[0].equals(Escoger1)){



                                ListaPro.add(x[1]);
                                if(imprimirProd.equals("")){
                                    imprimirProd=x[1];
                                    ListaPro.add(x[1]);

                                }else{
                                    ListaPro.add(x[1]);
                                    imprimirProd=imprimirProd+"\n"+x[1];
                                }

                            }
                        }
                        
                        Escoger2=JOptionPane.showInputDialog("Los productos de la categoria "+Escoger1+" son:\n"+imprimirProd+"\nEscriba el producto que desea");
                        
                        Valido=false;
                    
                        for(int j=0;j<ListaPro.size();j++){
                            String x=ListaPro.get(j);
                            x=x.replaceAll("^\\s*","");
                            x=x.replaceAll("\\s*$","");
                            ListaPro.set(j, x );


                            if(ListaPro.get(j).equals(Escoger2)){

                                Valido=true;

                            }
                        }
                        
                        
                        if(Valido==true){
                            
                           for(int i=1; i<grup.size();i++){
                                String[] x=grup.get(i);
                                
                                x[0]=x[0].replaceAll("^\\s*","");
                                x[0]=x[0].replaceAll("\\s*$","");
                                x[1]=x[1].replaceAll("^\\s*","");
                                x[1]=x[1].replaceAll("\\s*$","");
                                x[2]=x[2].replaceAll("^\\s*","");
                                x[2]=x[2].replaceAll("\\s*$","");

                               if(x[1].equals(Escoger2)){
                                   
                                   Cant=JOptionPane.showInputDialog("Cuantas unidades va a querer?\nESCRIBA UN NUMERO NO MAYOR A : "+x[2]);
                                   
                                   
                                   
                                   
                               }
                               
                               
                               
                                
                                
                            }
                            
                            
                            
                            
                            
                        }
                        
                        
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe esta categría");
                    }
                    
                }while(opcion.equals("1"));
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                break;
                
            //Mostrar la categoría del producto. El usuario ingresará el nombre del producto y se muestra la categoría del artículo. 
            case 2:
                
                inventario=control.LeerInventario(ruta);
                
                
                
                ArrayList<String[]> grup=control.RetornarGrupo();
                
                
                String ListaProductos="";
                
                for(int i=1; i<grup.size();i++){
                    String[] x=grup.get(i);
                    
                    ListaProductos=ListaProductos+x[1]+"\n";
                    
                    
                }
                
                String product=JOptionPane.showInputDialog("lista de productos: \n\n"+ListaProductos+"\nIngrese un producto: ");
              
                
                
                
                
                for(int i=1; i<grup.size();i++){
                    String[] x=grup.get(i);
                    x[1]=x[1].replaceAll("^\\s*","");
                    x[1]=x[1].replaceAll("\\s*$","");
                    
                    if(x[1].equals(product)){
                        
                        JOptionPane.showMessageDialog(null,"Categoria: "+x[0]+" Producto: "+x[1]+" Cantidad: "+x[2]);
                        
                    }
                     
                }
                
                
                
                break;
                
                
                
                
                
                
                
                
                
            //Mostrar los datos del producto, categoría y la cantidad de cada artículo que el usuario tiene en su colección/carrito .  
            case 3:
                
                
                
                
                
                
                
                
                
                
                
                
                
                break;
            //Mostrar los datos del producto, categoría y la cantidad de cada artículo que el usuario tiene en su colección, ordenadas por tipo. 
            case 4:
                
                
                
                
                
                
                
                
                
                
                
                
                
                break;
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            //Mostrar el producto y la categoría de todo el inventario.
            case 5:
                
                inventario=control.LeerInventario(ruta);
                vista.ImprimirInventario(inventario);
                
                
                ArrayList<String[]> grupo=control.RetornarGrupo();
                
                for(int i=1; i<grupo.size();i++){
                    String[] x=grupo.get(i);
                    
                    System.out.println(x[1]);
                    
                    
                    
                }
                
                //Producto producto=new Producto();
                //producto.ListaProductos();
                
                
                
                
                
                
                
                break;
            
            
            default:
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}   

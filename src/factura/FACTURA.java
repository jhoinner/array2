
package factura;

import java.util.*;

/**
 *
 * @author CBN
 */
public class FACTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <String> nombreproducto = new ArrayList();
        ArrayList <Integer> valorproducto = new ArrayList();
        boolean continuar = true;
        int desicion=1, total = 0, control= 0,i;
        String productomasalto="";
        while(continuar){
            System.out.println("Ingrese el nombre del producto");
            nombreproducto.add(leer.next());
            System.out.println("Ingrese valor del producto");
            valorproducto.add(leer.nextInt());
            System.out.println("desea ingresar mas productos (0 para salir");
            desicion = leer.nextInt();
            if(desicion==0){
               continuar =false;
            } 
        }
        for(i=0; i<valorproducto.size(); i++){
            System.out.println(nombreproducto.get(i)+"\t"+valorproducto.get(i));
            total+=valorproducto.get(i);
            if(valorproducto.get(i)>control){
                productomasalto = nombreproducto.get(i);
                control = valorproducto.get(i);
            }
        }
        System.out.println("total: "+total);
        System.out.println("producto mas alto: "+productomasalto+" con "+control);
    }
    
}

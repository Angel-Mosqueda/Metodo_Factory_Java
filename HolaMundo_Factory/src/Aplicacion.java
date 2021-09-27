import Accion.Accion;
import Accion.Factory;

public class Aplicacion {
    
    public static void main(String[] args){
        Accion a1 = Factory.construir(tipo: "Colega");
        Accion a2 = Factory.construir(tipo: "Profesor");
        
        a1.saludar();
        a1.despedirse(); 
        System.out.println(a1.tipo());
        
        a2.saludar();
        a2.despedirse();        
        System.out.println(a2.tipo());
           
    }
}

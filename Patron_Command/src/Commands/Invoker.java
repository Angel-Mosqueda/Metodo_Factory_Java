package Commands;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class Invoker {//Apila las operaciones y las ejecuta
    private List<Operacion> operacion = new ArrayList<>();
    
    public void recibirOperacion(Operacion operacion){
        this.operacion.add(operacion);
    }
    
    public void realizarOperacion(){
        this.operacion.forEach(x -> x.execute());
        
        this.operacion.clear(); //limpamos la lista
    }
}

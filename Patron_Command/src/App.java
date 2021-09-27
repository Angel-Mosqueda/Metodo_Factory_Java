
import Commands.Cuenta;
import Commands.Depositar;
import Commands.Invoker;
import Commands.Retirar;


/**
 *
 * @author Angel
 */
public class App {
    public static void main(String[] args) {
	Cuenta cuenta = new Cuenta(1, 200);
        
        Depositar op_depositar = new Depositar(cuenta, 100);
        Retirar op_retirar = new Retirar(cuenta, 50);
        
        Invoker invok = new Invoker();
        invok.recibirOperacion(op_depositar);
        invok.recibirOperacion(op_retirar);
        
        invok.realizarOperacion();
    }
}

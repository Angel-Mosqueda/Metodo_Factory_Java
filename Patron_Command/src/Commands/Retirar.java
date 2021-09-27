package Commands;

/**
 *
 * @author Angel
 */
public class Retirar implements Operacion{
    private Cuenta cuenta;
    private double monto;
    
    public Retirar(Cuenta cuenta, double monto){
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void execute() {
        this.cuenta.retirar(this.monto);
    }
    
}

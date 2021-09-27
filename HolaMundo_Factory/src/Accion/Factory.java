package Accion;
/**
 *
 * @author Angel
 */
public class Factory {
    public static Accion construir(String tipo){
        switch (tipo){
            case "Profesor":
                return new Profesor();
            case "Colega":
                return new Colega();
            default:
                System.out.println("No se encuentra esta persona en la fabrica");
                return null;
        }
    }
}

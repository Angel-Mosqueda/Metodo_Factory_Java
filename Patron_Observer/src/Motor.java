public class Motor implements Observador {

    public Motor(){
        
    }
    
    @Override
    public void update() {
        //Accion a realizar despues de que se entere que el acelerador se presiono
        System.out.println("Subir la potencia, subir la velocidad/revoluciones");
    }
    
    
    
}

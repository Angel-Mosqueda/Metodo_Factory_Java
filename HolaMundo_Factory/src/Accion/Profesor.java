package Accion;



public class Profesor implements Accion {

    @Override
    public void saludar() {
    System.out.println("Hola mundo, Profesor");
    }

    @Override
    public void despedirse() {
     System.out.println("Adios mundo, Profesor");
    }

    @Override
    public String tipo() {
        return "Profesor";
    }
    
}

package Accion;



public class Colega implements Accion {

    @Override
    public void saludar() {
        System.out.println("Hola mundo, Colega");
    }

    @Override
    public void despedirse() {
        System.out.println("Adios mundo, Colega");
    }

    @Override
    public String tipo() {
        return "Colega";
    }
    
}

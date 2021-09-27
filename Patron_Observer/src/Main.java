
public class Main {
    public static void main(String[] args){
        Motor v8 = new Motor();
        Acelerador pedal = new Acelerador();
        
        pedal.enlazarObservador(v8);
        
        pedal.pisarAcelerador();
    }
}

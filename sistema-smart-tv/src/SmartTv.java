public class SmartTv {
    boolean ligado = false; 
    int canal = 1; 
    int volume = 25; 

    public void aumentar(){
        volume++; 
    }

    public void diminuir(){
        volume--; 
    }

    public void ligar(){
        ligado = true; 
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){ 
        canal--; 
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv(); 

        smartTv.aumentar();
        smartTv.aumentar();
        smartTv.ligar();
        smartTv.aumentar();
        smartTv.diminuir();
        smartTv.mudarCanal(32);
        System.out.println("TV ligada? " + smartTv.ligado);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Qual volume? " + smartTv.volume);
    }
}

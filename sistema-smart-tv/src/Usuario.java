public class Usuario {
    public static void main(String[] args) throws Exception {
      SmartTv smartTv = new SmartTv();
    smartTv.ligar();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    smartTv.mudarCanal(15);

    
      System.out.println("TV ligada? "  + smartTv.ligada);
      System.out.println("Canal atual: " + smartTv.canal);
      System.out.println("Volume atual: " + smartTv.volume);

    }
}

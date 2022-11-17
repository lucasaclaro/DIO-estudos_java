public class Usuario {
    
        
    // criar um exemplo de método combinado com o arquivo SmartTv

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal atual?: " + smartTv.canal);
        System.out.println("Volume atual?: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

        System.out.println("volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo volume: "+ smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(45);
        System.out.println("Canal atual: " + smartTv.canal);

    }

}

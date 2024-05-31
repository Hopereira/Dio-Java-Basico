public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV tv = new SmartTV();
        System.out.println("TV ligada: " + tv.ligada);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Canal: " + tv.canal);
        tv.ligar();
        tv.desligar();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.trocarCanal(6);
    }
}

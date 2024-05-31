public class SmartTV {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada: " + ligada);
    }
    public void desligar() {
        ligada = false;
        System.out.println("TV ligada: " + ligada);
    }
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }
    public void trocarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal: " + this.canal);
    }
    
}

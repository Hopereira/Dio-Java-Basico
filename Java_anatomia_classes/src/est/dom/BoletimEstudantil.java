package est.dom;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 4;
        if (mediaFinal >= 7) {
            System.out.println("Aprovado");
        } else if (mediaFinal >= 5 && mediaFinal < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
            
        }
    }
}

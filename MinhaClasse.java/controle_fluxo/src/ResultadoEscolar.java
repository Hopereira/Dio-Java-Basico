// Cenário 1
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        nota = 6;
        resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
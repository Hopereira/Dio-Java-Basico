package est.seg;

public class operadores {
    public static void main(String[] args) {
        // declaração de variáveis
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        // operadores aritméticos
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (a--));
        // Verifica se a é igual a b
        System.out.println("a == b = " + (a == b));
        // Verifica se a é diferente de b
        System.out.println("a != b = " + (a != b));
        // Verifica se a é maior que b
        System.out.println("a > b = " + (a > b));
        // Verifica se a é menor que b
        System.out.println("a < b = " + (a < b));
        // Verifica se a é maior ou igual a b
        System.out.println("b >= a = " + (b >= a));
        // Verifica se a é menor ou igual a b
        System.out.println("b <= a = " + (b <= a));
        // operadores lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!(x && y) = " + !(x && y));
        // operadores unarios
        // classe Operadores.java
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
        // operadores de ternário
        // classe Operadores.java
        int a1, b1;

        a1 = 5;
        b1 = 6;
        String resultado ="";

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a1 == b1) ? "verdadeiro" : "false";

        System.out.println(valor);
    }

}

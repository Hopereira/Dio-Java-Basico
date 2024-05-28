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
        

        
        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a1 == b1) ? "verdadeiro" : "falso";

        System.out.println(resultado);

        //classe Operadores.java
int numero1 = 1;
int numero2 = 2;

if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2\n");

if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2\n");

if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2\n");

if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2\n");

if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2\n");

    // Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");

    }

}

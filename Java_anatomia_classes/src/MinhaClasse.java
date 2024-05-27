public class MinhaClasse {//corpo da classe com inciais maiusculas
    public static void main(String[] args) {//medoto principal
        String nome = "Fulano";//variavel do tipo string
        System.out.println(nome);//imprime a variavel nome

        int idade = 30;//variavel do tipo inteiro
        System.out.println(idade);//imprime a variavel idade

        double altura = 1.80;//variavel do tipo double]
        System.out.println(altura);//imprime a variavel altura

        boolean estudante = true;//variavel do tipo boolean
        System.out.println(estudante);//imprime a variavel estudante
        String primeiroNome = "Hebert";//variavel do tipo string
        String segundoNome = " Pereira";//variavel do tipo string
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);//variavel do tipo string
        System.out.println(nomeCompleto);//imprime a variavel nomeCompleto
    }
    public static String nomeCompleto(String primeiroNome , String segundoNome) {//metodo do tipo string
        return "resultado de metodo: " + primeiroNome.concat("").concat(segundoNome);//retorna a concatenação das variaveis
    }




}

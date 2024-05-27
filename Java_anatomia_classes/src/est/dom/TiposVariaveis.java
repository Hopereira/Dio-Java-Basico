package est.dom;

public class TiposVariaveis {
    
    
        public static void main(String[] args) {
            byte idade = 123;
            short ano = 2021;
            int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
            long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
            float pi = 3.14F;
            double salario = 1275.33;
            char sexo = 'M';
            boolean estudante = true;
            String nome = "Fulano";
            System.out.println("Idade: " + idade);  
            System.out.println("Ano: " + ano);
            System.out.println("CEP: " + cep);
            System.out.println("CPF: " + cpf);
            System.out.println("PI: " + pi);
            System.out.println("Salário: " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estudante: " + estudante);
            System.out.println("Nome: " + nome);
            System.out.println("----------------------");
            System.out.println("");
            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short)numeroNormal;//casting
            System.out.println("Número curto: " + numeroCurto);
            System.out.println("Número normal: " + numeroNormal);
            System.out.println("Número curto 2: " + numeroCurto2);

        }

    
}

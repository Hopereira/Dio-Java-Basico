public class Comentarios {
    public static void main(String[] args) {
        // Comentário de uma linha
        System.out.println("Comentário de uma linha");

        /*
        Comentário de múltiplas linhas
        */
        System.out.println("Comentário de múltiplas linhas");
    }

        /**
         * Comentário de documentação
         */
           
        public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;

         
    
    }
}

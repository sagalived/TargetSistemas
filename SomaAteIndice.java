public class SomaAteIndice {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        //Ao final do processamento, o valor da variável SOMA será 91, 
        System.out.println("O valor Final da soma é " +SOMA);
    }
}

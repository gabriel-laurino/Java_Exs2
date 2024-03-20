public class Exercicio09 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o índice " + i + " do vetor A:");
        }

        Prompt.linhaEmBranco();
        
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o índice " + i + " do vetor B:");
        }
        
        for (int i = 0; i < vetorC.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }
        int j = 0;
        for (int valor : vetorC) {
            Prompt.imprimir("índice " + j + " do vetor C: " + valor);
            j++;
        }
    }
}

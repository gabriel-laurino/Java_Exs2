public class Exercicio08 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B:");
        }
        
        // Copia um array de origem especificado [A], começando na posição especificada[0], para o array de destino[C] começando na posição especificada[0]; [vetorA.length] Indica que todos os elementos de [A] serão copiados.
        System.arraycopy(vetorA, 0, vetorC, 0, vetorA.length);
        System.arraycopy(vetorB, 0, vetorC, vetorA.length, vetorB.length);
        
        for (int valor : vetorC) {
            Prompt.imprimir("Elemento do vetor C: " + valor);
        }
    }
}

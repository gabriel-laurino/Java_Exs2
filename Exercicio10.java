public class Exercicio10 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }

        // Copia elementos de A para B de forma invertida.
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[vetorB.length - 1 - i] = vetorA[i];
        }

        Prompt.linhaEmBranco();

        for (int i = 0; i < vetorB.length; i++) {
            Prompt.imprimir("Elemento " + (i + 1) + " do vetor B (invertido de A): " + vetorB[i]);
        }
    }
}


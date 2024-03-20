public class Exercicio11 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int produtoEscalar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }

        Prompt.linhaEmBranco();

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B:");
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        Prompt.imprimir("\nProduto escalar entre vetor A e vetor B: " + produtoEscalar);
    }
}

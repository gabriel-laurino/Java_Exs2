public class Exercicio14 {
    public static void executar() {
        int[] vetor = new int[5];
        int maxIndex = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ":");
            if (vetor[i] > vetor[maxIndex]) {
                maxIndex = i;
            }
        }

        // Passando o maior elemento para a última posição.
        int temp = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = vetor[maxIndex];
        vetor[maxIndex] = temp;

        Prompt.linhaEmBranco();

        for (int valor : vetor) {
            Prompt.imprimir(valor);
        }
    }
}

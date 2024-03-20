public class Exercicio12 {
    public static void executar() {
        int[] vetor = new int[12];
        int produto = 1;
        boolean hasPositiveEven = false;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + ":");
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
                hasPositiveEven = true;
            }
        }

        Prompt.linhaEmBranco();

        if (hasPositiveEven) {
            Prompt.imprimir("Produto dos elementos pares positivos: " + produto);
        } else {
            Prompt.imprimir("Não há elementos pares positivos no vetor.");
        }
    }
}

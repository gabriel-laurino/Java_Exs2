public class Exercicio15 {
    public static void executar() {
        int[] vetor = new int[5];
        vetor[0] = Prompt.lerInteiro("Digite o 1º número:");

        Prompt.linhaEmBranco();

        for (int i = 1; i < vetor.length; i++) {
            do {
                vetor[i] = Prompt.lerInteiro("\nDigite um número maior que " + vetor[i - 1] + ":");
            } while (vetor[i] <= vetor[i - 1]);
        }
        Prompt.linhaEmBranco();

        for (int valor : vetor) {
            Prompt.imprimir(valor);
        }
    }
}

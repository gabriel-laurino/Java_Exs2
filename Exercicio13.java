public class Exercicio13 {
    public static void executar() {
        int n = Prompt.lerInteiro("Digite o número de termos da sequência de Fibonacci que deseja:");
        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        Prompt.linhaEmBranco();

        for (int termo : fibonacci) {
            Prompt.imprimir(termo);
        }
    }
}

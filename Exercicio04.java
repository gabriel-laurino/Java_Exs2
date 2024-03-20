public class Exercicio04 {
    public static void executar() {
        int[] numeros = new int[5];
        int n = Prompt.lerInteiro("Digite um número N qualquer:");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerInteiro("\nDigite o número do índice " + i + " para o vetor:");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < n) {
                Prompt.imprimir("\nÍndice: " + i + " - Número: " + numeros[i] + " (inferior a " + n + ")");
            }
        }
    }
}

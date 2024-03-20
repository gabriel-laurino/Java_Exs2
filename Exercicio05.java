public class Exercicio05 {
    public static void executar() {
        int[] numeros = new int[5];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerInteiro("\nDigite o número do índice " + i + " para o vetor:");
        }

        int n = Prompt.lerInteiro("\nDigite um número N qualquer:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                contador++;
            }
        }
        
        Prompt.imprimir("\nO número " + n + " aparece " + contador + " vezes no vetor.");
    }
}

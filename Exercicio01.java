public class Exercicio01 {
    public static void executar() {
        double[] numeros = new double[5];
        double soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerDecimal("Digite o número " + (i + 1) + ":");
            soma += numeros[i];
        }
        
        Prompt.linhaEmBranco();
        
        double media = soma / numeros.length;
        Prompt.imprimir("Média: " + media);

        Prompt.linhaEmBranco();
        
        for (double num : numeros) {
            if (num < media) {
                Prompt.imprimir(num + " é menor que a média.");
            } else if (num > media) {
                Prompt.imprimir(num + " é maior que a média.");
            } else {
                Prompt.imprimir(num + " é igual à média.");
            }
        }
    }
}
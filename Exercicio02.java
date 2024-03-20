public class Exercicio02 {
    public static void executar() {
        int[] sequencia = new int[5];
        
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = Prompt.lerInteiro("Digite um número para a posição " + i + ":");
        }
        
        for (int i = 0; i < sequencia.length; i++) {
            if (sequencia[i] > 0) {
                Prompt.imprimir("Número " + sequencia[i] + " na posição " + i + " é positivo.");
            } else if (sequencia[i] < 0) {
                Prompt.imprimir("Número " + sequencia[i] + " na posição " + i + " é negativo.");
            } else {
                Prompt.imprimir("Número " + sequencia[i] + " na posição " + i + " é zero.");
            }
        }
    }
}

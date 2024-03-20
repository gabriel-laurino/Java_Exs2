public class Exercicio06 {
    public static void executar() {
        double[] notas = new double[5];
        int[] pesos = new int[notas.length];
        double somaPesos = 0, somaNotasPesos = 0;
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ":");
            pesos[i] = Prompt.lerInteiro("Digite o peso da nota " + (i + 1) + ":");
            somaNotasPesos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        
        double mediaPonderada = somaNotasPesos / somaPesos;
        System.out.printf("Média ponderada: %.2f", mediaPonderada);
    }
}

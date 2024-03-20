public class Exercicio03 {
    public static void executar() {
        int[] numeros = new int[5];
        int[] dobro = new int[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerInteiro("Digite um número:");
            dobro[i] = numeros[i] * 2;
        }
        
        for (int valor : dobro) {
            Prompt.imprimir("Dobro: " + valor);
        }
    }
}

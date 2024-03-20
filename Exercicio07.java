public class Exercicio07 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        boolean saoIguais = true;
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }

        Prompt.linhaEmBranco();
        
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B:");
            if (vetorA[i] != vetorB[i]) {
                saoIguais = false;
            }
        }
        
        if (saoIguais) {
            Prompt.imprimir("\nOs vetores são iguais.");
        } else {
            Prompt.imprimir("\nOs vetores não são iguais.");
        }
    }
}

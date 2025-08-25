package view;
import ordenacao.BubbleSort;
import ordenacao.MergeSort;

public class Principal {
	// Método auxiliar para imprimir o vetor de forma organizada.
	// Teste
    public static void imprimirVetor(String nome, int[] vetor) {
        System.out.println("\n--- " + nome + " ---");
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
	public static void main(String[] args) {
        // --- Vetores dos exercícios ---
		int[] meuVetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        int[] meuVetor2 = {44, 43, 42, 41, 40, 39, 38};
        int[] meuVetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
        
        // --- Testando vetor 1 com Bubble Sort ---
        int[] meuVetor1ParaBubble = meuVetor1.clone(); // Cria uma cópia para o Bubble Sort
        imprimirVetor("Vetor Inicial para Bubble Sort", meuVetor1ParaBubble);
        BubbleSort.ordenar(meuVetor1ParaBubble);
        imprimirVetor("Vetor Ordenado com Bubble Sort", meuVetor1ParaBubble);
        
        // --- Testando vetor 1 com Merge Sort ---
        int[] meuVetor1ParaMerge = meuVetor1.clone(); // Cria outra cópia para o Merge Sort
        imprimirVetor("Vetor Inicial para Merge Sort", meuVetor1ParaMerge);
        MergeSort.ordenar(meuVetor1ParaMerge);
        imprimirVetor("Vetor Ordenado com Merge Sort", meuVetor1ParaMerge);
        
        // --- Testando vetor 2 com Bubble Sort ---
        int[] meuVetor2ParaBubble = meuVetor2.clone(); // Cria uma cópia para o Bubble Sort
        imprimirVetor("Vetor Inicial para Bubble Sort", meuVetor2ParaBubble);
        BubbleSort.ordenar(meuVetor2ParaBubble);
        imprimirVetor("Vetor Ordenado com Bubble Sort", meuVetor2ParaBubble);
        
        // --- Testando vetor 2 com Merge Sort ---
        int[] meuVetor2ParaMerge = meuVetor2.clone(); // Cria outra cópia para o Merge Sort
        imprimirVetor("Vetor Inicial para Merge Sort", meuVetor2ParaMerge);
        MergeSort.ordenar(meuVetor2ParaMerge);
        imprimirVetor("Vetor Ordenado com Merge Sort", meuVetor2ParaMerge);
        
        // --- Testando vetor 3 com Bubble Sort ---
        int[] meuVetor3ParaBubble = meuVetor3.clone(); // Cria uma cópia para o Bubble Sort
        imprimirVetor("Vetor Inicial para Bubble Sort", meuVetor3ParaBubble);
        BubbleSort.ordenar(meuVetor3ParaBubble);
        imprimirVetor("Vetor Ordenado com Bubble Sort", meuVetor3ParaBubble);
        
        // --- Testando vetor 3 com Merge Sort ---
        int[] meuVetor3ParaMerge = meuVetor3.clone(); // Cria outra cópia para o Merge Sort
        imprimirVetor("Vetor Inicial para Merge Sort", meuVetor3ParaMerge);
        MergeSort.ordenar(meuVetor3ParaMerge);
        imprimirVetor("Vetor Ordenado com Merge Sort", meuVetor3ParaMerge);
        
    }
}

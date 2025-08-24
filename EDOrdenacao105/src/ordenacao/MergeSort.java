package ordenacao;

public class MergeSort {
	public static void mergeSort(int[] vetor, int inicio, int fim) {
		System.out.println("Vetor da posição "+inicio+" até "+ fim);
		if (inicio < fim) {
			// Opção para um subvetor com tamanho dimensionado
			// int meio = inicio + (fim - inicio) / 2; 
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, inicio, meio); // Subvetor da esquerda
			mergeSort(vetor, meio + 1, fim); // Subvetor da direita
			intercala(vetor, inicio, meio, fim); // Função de intercalação e comparação
		}
	}

	private static void intercala(int[] vetor, int inicio, int meio, int fim) {
		// TODO Auto-generated method stub
		// Tamanho para subvetor dimensionado
		//int tamanho = fim - inicio + 1;
		//int novoVetor[] = new int[tamanho];
		int novoVetor[] = new int[vetor.length]; // Cria vetor auxiliar com tamanho do vetor original
		//for (int i = inicio; i < tamanho; i++) {
			//novoVetor[i] = vetor[inicio + 1];
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		} // Popula o vetor auxiliar com os subvetores
		int esquerda = inicio; // Cria ponteiro da esquerda
		//int direita = (meio - inicio) + 1;
		int direita = meio + 1; // Cria ponteiro da direita
		for (int contador = inicio; contador <= fim; contador++) {
			// Condições para comparação
			//if (esquerda > (meio - inicio)) {
			if (esquerda > meio) { // ponteiro da esquerda menor que meio
				vetor[contador] = novoVetor[direita]; //vetor inicial recebe valor na posição do vetor auxiliar
				direita++; // incrementa
			}
			//else if (eireita > (fim - inicio)) {
			else if (direita > fim) { // ponteiro da direita maior que fim
				vetor[contador] = novoVetor[esquerda];//vetor inicial recebe valor na posição do vetor auxiliar
				esquerda++;// incrementa
			}
			else if (novoVetor[esquerda] < novoVetor[direita]) {//valor na posição do ponteiro da esquerda, do vetor auxiliar, menor que na direita
				vetor[contador] = novoVetor[esquerda];//vetor inicial recebe valor na posição do vetor auxiliar
				esquerda++; // incrementa
			}
			else {
				vetor[contador] = novoVetor[direita];//vetor inicial recebe valor na posição do vetor auxiliar
				direita++;// incrementa
			}
			
		}
	}
	public static void ordenar(int[] vetor) {
		mergeSort(vetor, 0, vetor.length - 1);
	}
}

package Questoes;

import java.util.Scanner;

public class Questao02 {

	public static void diferencaEntreElementos(int[] vetor, int x) {

		// Vari�vel que ir� armazen os elementos pares do vetor que o resultado da diferen�a � igual a x.
		int contador = 0;

		// Os la�os for ir�o percorrer cada valor do vetor e compara-lo com todos os valores a sua frente
		// Dessa forma, ser� feito a diferen�a entre eles encontrando os resultado que sejam iguais a x.
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] - vetor[j] == x || vetor[j] - vetor[i] == x) {
					contador++; // Adiciona 1 para cada vez que a condi��o if seja atendida
				}
			}
		}
		
		// Imprime os resultados.
		System.out.println(contador);

	}

	public static void main(String[] args) {
		// Objeto do tipo Scanner para receber dados do usu�rio.
		Scanner dados = new Scanner(System.in);

		// Inicia um vetor de tamanho 5.
		int[] vetorNumero = new int[5];

		// Recebe valores do usu�rio para adicionar no vetor.
		System.out.println("Informe um valor inteiro para cada posi��o do vetor: ");
		for (int i = 0; i < vetorNumero.length; i++) {
			System.out.print("Posi��o " + i + ":" + " ");
			vetorNumero[i] = dados.nextInt();
		}

		// Recebe um valor para x.
		System.out.print("Informe um valor x: " + " ");
		int x = dados.nextInt();

		// Imprime o resultado da fun��o diferencaEntreElementos();.
		System.out.print("O total de pares do vetor com o resultado da diferen�a igual o valor de x s�o: ");
		diferencaEntreElementos(vetorNumero, x);

	}

}

package Questoes;

import java.util.Scanner;

public class Questao02 {

	public static void diferencaEntreElementos(int[] vetor, int x) {

		// Variável que irá armazen os elementos pares do vetor que o resultado da diferença é igual a x.
		int contador = 0;

		// Os laços for irão percorrer cada valor do vetor e compara-lo com todos os valores a sua frente
		// Dessa forma, será feito a diferença entre eles encontrando os resultado que sejam iguais a x.
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] - vetor[j] == x || vetor[j] - vetor[i] == x) {
					contador++; // Adiciona 1 para cada vez que a condição if seja atendida
				}
			}
		}
		
		// Imprime os resultados.
		System.out.println(contador);

	}

	public static void main(String[] args) {
		// Objeto do tipo Scanner para receber dados do usuário.
		Scanner dados = new Scanner(System.in);

		// Inicia um vetor de tamanho 5.
		int[] vetorNumero = new int[5];

		// Recebe valores do usuário para adicionar no vetor.
		System.out.println("Informe um valor inteiro para cada posição do vetor: ");
		for (int i = 0; i < vetorNumero.length; i++) {
			System.out.print("Posição " + i + ":" + " ");
			vetorNumero[i] = dados.nextInt();
		}

		// Recebe um valor para x.
		System.out.print("Informe um valor x: " + " ");
		int x = dados.nextInt();

		// Imprime o resultado da função diferencaEntreElementos();.
		System.out.print("O total de pares do vetor com o resultado da diferença igual o valor de x são: ");
		diferencaEntreElementos(vetorNumero, x);

	}

}

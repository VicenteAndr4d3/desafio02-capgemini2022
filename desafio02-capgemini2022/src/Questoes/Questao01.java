package Questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao01 {

	public static void medianaDaLista(ArrayList<Integer> valor) {

		// Inicia vari�veis "metade" e "mediana".
		int metade, mediana;
		
		// Ordena os valores da lista.
		Collections.sort(valor);
		
		// Vari�vel que armazena o indice central da lista.
		metade = valor.size() / 2;

		// Vari�vel que armazena o valor do indice centra da lista, com base na vari�vel "metade".
		mediana = valor.get(metade);

		// Imprime o valor da mediana.
		System.out.println(mediana);

	}

	public static void main(String[] args) {

		// Objeto do tipo 'Scanner' para receber dados do usu�rio.
		Scanner dados = new Scanner(System.in);

		// Inicia uma lista.
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();

		// Pede ao usu�rio 5 valores para adicionar na lista
		System.out.println("Digite 5 valores para adicionar na lista: ");
		for (int i = 0; i < 5; i++) {
			listaDeNumeros.add(dados.nextInt());
		}
		
		// Imprime mediana da lista com base na fun��o medianaDaLista();.
		System.out.println("A mediana da lista �: ");
		medianaDaLista(listaDeNumeros);

	}

}

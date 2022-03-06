package Questoes;

import java.util.Scanner;

public class Questao03 {

	public static void encriptarTexto(String texto) {

		// Retira os espa�o do texto.
		String textoSemEspaco = texto.replace(" ", "");

		// Calcula a raiz quadrada do tamanho do texto(sem espa�os) e o arrendonda para a maior casa.
		int raizQuadradaTexto = (int) Math.ceil(Math.sqrt(textoSemEspaco.length()));

		// Inicia uma matriz do tipo 'char'.
		char[][] grid = new char[raizQuadradaTexto][raizQuadradaTexto];

		// Vari�vel que ir� armazena cada valor dos indices da vari�vel "textoSemEspaco";.
		int cont = 0;

		// Loops que adicionam os caracteres do texto linha por linha.
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length && cont < textoSemEspaco.length(); j++) {
				grid[i][j] = textoSemEspaco.charAt(cont);
				cont++;
			}
		}

		// Loops que encriptam o texto com base na regras da quest�o
		// No caso � imprimido a matrix coluna por coluna.
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[j][i]);
			}
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		// Objeto do tipo Scanner para receber dados do usu�rio.
		Scanner dados = new Scanner(System.in);

		// Receber um texto do usu�rio.
		System.out.println("Digite um texto: ");
		String texto = dados.nextLine();

		// Imprime o texto encriptado com base na fun��o encriptarTexto();.
		System.out.print("Texto Encriptado: ");
		encriptarTexto(texto);

	}
}

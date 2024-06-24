package com.daniele.cusojava.aula27;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			
			if(jogada % 2 == 1) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {
				
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = '0';
			}	
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada. Tente novamente: ");
			}
			
			jogoDaVelha.validarJogada(linha, coluna, sinal);
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, Jogador 1 ganhou!");
			} else if (jogoDaVelha.verificarGanhador('0')) {
				ganhou = true;
				System.out.println("Parabéns, Jogador 2 ganhou!");
			} else if (jogoDaVelha.jogada > 9){
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida!");
			}
					
		}		
	}
	
	static int valor(String tipoValor, Scanner scan) {
		
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3): ");
			valor = scan.nextInt();
			if(valor >=1 && valor <= 3) {
				valorValido = true;
			} else {
				System.out.println("Entrada inválida, tente novmente: ");
			}
		}
		valor--;
		return valor;
		
	}
		
}
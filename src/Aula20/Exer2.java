package Aula20;

import java.util.Random;

public class Exer2 {
	
	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[10][10];
		
		Random numeroRadom = new Random();
		
		for (int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRadom.nextInt(10);
			}
		}
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");				
			}
			
			System.out.println();
		}
					
		int maiorL5= 0;
		int menorL5 = 0;
		int linha5 = 0;	
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			if (numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			
			if (numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}
		}
		
		System.out.println("Maior valor da linha 5: " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);
		
		int maiorC7 = 0;
		int menorc7 = 0;
		int col7 = 7;
		for (int i=0; i<numerosAleatorios.length; i++) {
			if(numerosAleatorios[i][col7] > maiorC7) {
				maiorC7 = numerosAleatorios[i][col7];				
			}
			
			if(numerosAleatorios[i][col7] < menorc7) {
				menorc7 = numerosAleatorios[i][col7];
			}
		}
		
		System.out.println("Maior valor da Coluna 7: " + maiorC7);
		System.out.println("Menor valor da Coluna 7: " + menorc7);
		
			
	}

}

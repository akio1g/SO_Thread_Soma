package view;

import java.util.Random;

import controller.threadSoma;

public class Principal {
	public static void randomizar(int matriz[][]) {
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = random.nextInt(100);
				//System.out.println("matriz["+i+"]["+ j + "] = " + matriz[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		randomizar(matriz);
		for(int x = 0; x<3; x++) {
			threadSoma soma = new threadSoma(matriz,x);
			soma.run();
		}
	}
}

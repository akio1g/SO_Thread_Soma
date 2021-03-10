package controller;

public class threadSoma extends Thread{
	private int matriz[][];
	private int x;

	public threadSoma(int[][] matriz, int x) {
		this.matriz = matriz;
		this.x = x;
	}

	@Override
	public void run() {
		int soma = 0;
		for(int i = 0;i<5;i++) {
			soma = soma + matriz[x][i];
		}
		System.out.println("linha#"+x+ " = " + soma);
	}
	
	
}

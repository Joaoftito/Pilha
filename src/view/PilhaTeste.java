package view;

import controller.PilhaController;

public class PilhaTeste {

	public static void main(String[] args) {
		try {
			PilhaController pilha = new PilhaController();
			System.out.println(pilha.teste());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

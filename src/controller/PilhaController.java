package controller;

import model.Pilha;

public class PilhaController {

	public PilhaController() {
		super();
	}

	public String teste() throws Exception {
		Pilha pilha = new Pilha();

		pilha.Push(1);
		pilha.Push(2);
		pilha.Push(3);
		pilha.Push(4);
		pilha.Push(5);
		pilha.Push(6);
		pilha.Push(7);
		pilha.Push(8);
		pilha.Push(9);
		pilha.Push(10);
		
		pilha.Pop();
		pilha.Pop();
		pilha.Pop();
		pilha.Pop();
		pilha.Pop();

		return pilha.toString();
	}

}

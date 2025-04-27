package model;

public class Pilha<T> {
	
	private No<T> fim = null;
	
	public void Push(T elemento) {
		No<T> celula = new No<T>(elemento);
		
		if(this.fim != null) {
			No<T> atual = this.fim;
			celula.setAnterior(atual);
		}
		this.fim = celula;
	}
	
	public No<T> Pop() throws Exception{
		if (this.fim == null) {
			throw new Exception("Não existe item na lista");
		}
		
		No<T> celula = this.fim;
		this.fim = celula.getAnterior();
		return celula;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		No<T> atual = this.fim;

		while (atual != null) {
			builder.append(atual.getElemento());
			atual = atual.getAnterior();
			if (atual != null) {
				builder.append(",");
			}
		}
		builder.append("]");
		return builder.toString();
	}
}
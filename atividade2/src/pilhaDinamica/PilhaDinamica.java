package pilhaDinamica;

public class PilhaDinamica {
	private CelulaPilha top;

	public void push(int elemento) {
		CelulaPilha novaCelula = new CelulaPilha();
		novaCelula.setDado(elemento);
		novaCelula.setAnterior(this.top);
		this.top = novaCelula;
	}

	public boolean isEmpty() {
		if (this.top == null) {

			return true;
		} else
			return false;
	}

	public int pop() {
		if (!isEmpty()) {
			int elemento = this.top.getDado();
			this.top = this.top.getAnterior();
			return elemento;
		} else {
			System.out.println("Pilha Vazia!!!");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			int elemento = this.top.getDado();
			return elemento;
		} else {
			System.out.println("Pilha Vazia!!!");
			return -1;
		}
	}

	public int sizePilha() {
		CelulaPilha p;
		int cont = 0;
		p = this.top;
		while (p != null) {
			p = p.getAnterior();
			cont++;
		}
		return cont;
	}

	public void imprimir() {
		CelulaPilha p;
		p = this.top;
		if (isEmpty()) {
			System.out.println("Pilha Vazia!!!");
		} else {
			while (p != null) {
				System.out.println(p.getDado());
				p = p.getAnterior();
			}
		}
	}

	public CelulaPilha top() {
		if (isEmpty()) {
//			System.out.println("Pilha Vazia!!!");
			return null;
		} else {
//			System.out.println("Nome no topo da Pilha..: " + top.getDado());
			return this.top;
		}
	}
}

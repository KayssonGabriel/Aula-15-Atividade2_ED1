package calc;

import java.util.Random;

import pilhaDinamica.CelulaPilha;
import pilhaDinamica.PilhaDinamica;

public class Empilhadeira {
	PilhaDinamica p1;
	PilhaDinamica p2;
	PilhaDinamica p3;

	Random random = new Random();

	public void Empilhar() {
		this.p1 = new PilhaDinamica();
		this.p2 = new PilhaDinamica();
		this.p3 = new PilhaDinamica();

		for (int i = 0; i < 100; i++) {
			int numero = random.nextInt(9) + 1;

			if (numero == 1 || numero == 2 || numero == 3) {
				p1.push(numero);
			} else if (numero == 4 || numero == 5 || numero == 6) {
				p2.push(numero);
			} else {
				p3.push(numero);
			}

		}

	}

	public void reorganizarPilhas() {
		for (int i = 0; i < 100; i++) {
			int numero = random.nextInt(3) + 1;

			if (!(this.p1.isEmpty() || this.p2.isEmpty() || this.p3.isEmpty())) {
				if (numero == 1) {
					System.out.println("Empilhando os números " + p2.peek() + " e " + p3.peek() + " na pilha 1");
					p1.push(this.p2.pop());
					p1.push(this.p3.pop());
					imprimirColunas(p1, p2, p3);

				} else if (numero == 2) {
					System.out.println("Empilhando os números " + p1.peek() + " e " + p3.peek() + " na pilha 2");
					p2.push(this.p1.pop());
					p2.push(this.p3.pop());
					imprimirColunas(p1, p2, p3);

				} else {
					System.out.println("Empilhando os números " + p1.peek() + " e " + p2.peek() + " na pilha 3");
					p3.push(this.p1.pop());
					p3.push(this.p2.pop());
					imprimirColunas(p1, p2, p3);
				}
			}
		}

		if (p1.isEmpty()) {
			System.out.println("O programa foi encerrado porque a pilha 1 está vazia");
		} else if (p2.isEmpty()) {
			System.out.println("O programa foi encerrado porque a pilha 2 está vazia");
		} else if (p3.isEmpty()) {
			System.out.println("O programa foi encerrado porque a pilha 3 está vazia");
		} else {
			System.out.println("O programa atingiu o total de números sorteados");
		}
	}

	public void imprimirColunas(PilhaDinamica p1, PilhaDinamica p2, PilhaDinamica p3) {
		int maiorPilha = Math.max(p1.sizePilha(), Math.max(p2.sizePilha(), p3.sizePilha()));

		CelulaPilha topoP1 = p1.top();
		CelulaPilha topoP2 = p2.top();
		CelulaPilha topoP3 = p3.top();

		System.out.println("Pilha 1:\t\tPilha 2:\t\tPilha 3:");

		for (int i = 0; i <= maiorPilha; i++) {
			if (topoP1 != null) {
				System.out.print(topoP1.getDado() + "\t\t\t");
				topoP1 = topoP1.getAnterior();
			} else {
				System.out.print("\t\t\t");
			}

			if (topoP2 != null) {
				System.out.print(topoP2.getDado() + "\t\t\t");
				topoP2 = topoP2.getAnterior();
			} else {
				System.out.print("\t\t\t");
			}

			if (topoP3 != null) {
				System.out.print(topoP3.getDado());
				topoP3 = topoP3.getAnterior();
			}

			System.out.println();
		}
	}

	public PilhaDinamica getP1() {
		return p1;
	}

	public void setP1(PilhaDinamica p1) {
		this.p1 = p1;
	}

	public PilhaDinamica getP2() {
		return p2;
	}

	public void setP2(PilhaDinamica p2) {
		this.p2 = p2;
	}

	public PilhaDinamica getP3() {
		return p3;
	}

	public void setP3(PilhaDinamica p3) {
		this.p3 = p3;
	}

}

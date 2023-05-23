// Fase 1: Sorteie 100 números aleatórios de 1 a 9. Crie 3 pilhas dinâmicas em Java, sendo que a pilha 1 vai armazenar os números sorteados 
// de 1 a 3, a pilha 2 vai armazenar os números sorteados de 4 a 6 e a pilha 3 vai armazenar os números sorteados de 7 a 9.
// Fase 2: Após inserir os 100 números nas pilhas (provavelmente elas terão tamanhos distintos), sorteie outros 100 números aleátórios de 1 a 3.
// Esse número vai indicar qual pilha será utilizada para receber o número que estiver no topo das outras duas pilhas.
// Repita o processo até que uma das pilhas fique vazia ou até que os 100 números sorteados seja atingido. Ao final imprima as 3 pilhas.
// Obs.: Deve ser impresso os números que serão empilhados na pilha sorteada conforme o exemplo abaixo. 

package application;

import calc.Empilhadeira;

public class Program {
	public static void main(String[] args) {
		Empilhadeira empilhar = new Empilhadeira();

		empilhar.Empilhar();
		empilhar.imprimirColunas(empilhar.getP1(), empilhar.getP2(), empilhar.getP3());
		empilhar.reorganizarPilhas();
	}
}

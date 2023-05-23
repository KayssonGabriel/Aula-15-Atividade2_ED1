# Aula 15 de Estrutura de Dados I — reorganização de três pilhas

Simulação em Java de transferências entre três pilhas dinâmicas. O programa sorteia 100 inteiros de 1 a 9 e os distribui por faixa. A pilha 1 recebe de 1 a 3, a pilha 2 recebe de 4 a 6 e a pilha 3 recebe de 7 a 9.

Na segunda etapa, o programa sorteia uma pilha de destino e move para ela o topo de cada uma das outras duas. O programa imprime as três pilhas em colunas antes da primeira transferência e após cada transferência. O limite é de 100 sorteios e as transferências cessam assim que uma pilha fica vazia.

- [`Program.java`](atividade2/src/application/Program.java) inicia a demonstração.
- [`Empilhadeira.java`](atividade2/src/calc/Empilhadeira.java) faz os sorteios, move os elementos e imprime o estado das pilhas.
- [`PilhaDinamica.java`](atividade2/src/pilhaDinamica/PilhaDinamica.java) e [`CelulaPilha.java`](atividade2/src/pilhaDinamica/CelulaPilha.java) implementam as operações das pilhas.

## Como executar

Use o JDK 17 ou posterior. Na raiz do repositório, rode no PowerShell.

```powershell
javac --release 17 -encoding UTF-8 -d build (Get-ChildItem -Path atividade2/src -Recurse -Filter *.java -File).FullName
java -cp build application.Program
```

A demonstração dispensa entrada pelo teclado. A ordem e o número de transferências dependem do sorteio.

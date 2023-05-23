package pilhaDinamica;

public class CelulaPilha {
	private int elemento;
	private CelulaPilha anterior;

	public CelulaPilha() {

	}

	public CelulaPilha(int elemento, CelulaPilha anterior) {
		super();
		this.elemento = elemento;
		this.anterior = anterior;
	}

	public int getDado() {
		return this.elemento;
	}

	public void setDado(int elemento) {
		this.elemento = elemento;
	}

	public CelulaPilha getAnterior() {
		return (this.anterior);
	}

	public void setAnterior(CelulaPilha anterior) {
		this.anterior = anterior;
	}

}

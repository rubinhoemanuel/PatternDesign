package dds.patterndesign.builder;

public class Motor {

	private int numero;
	private String potencia;
	
	public Motor(int numero, String potencia) {
		this.numero = numero;
		this.potencia = potencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

}

package dds.patterndesign.builder;

public class AutoBuilder implements IBuilder {
	
	private String marca; //Arrancamos la construccion a traves de este atributo
	private String modelo;
	private Motor motor;
	private int cantidadPuertas;
	
	public AutoBuilder withMarca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public AutoBuilder withModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}
	
	public AutoBuilder withMotor(Motor motor) {
		this.motor = motor;
		return this;
	}
	
	public AutoBuilder withCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
		return this;
	}

	public Auto build() {
		Auto auto = new Auto();
		auto.setMarca(this.marca);
		auto.setModelo(this.modelo);
		auto.setMotor(this.motor);
		auto.setCantidadPuertas(this.cantidadPuertas);
		return auto;
	}

}

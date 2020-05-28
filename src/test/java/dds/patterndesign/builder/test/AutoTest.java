package dds.patterndesign.builder.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dds.patterndesign.builder.Auto;
import dds.patterndesign.builder.AutoBuilder;
import dds.patterndesign.builder.Motor;

public class AutoTest {
	
	private Auto auto;
	private AutoBuilder autoBuilder;
	private Motor motor;
	
	@Before
	public void setUp() {
		autoBuilder = new AutoBuilder();
		this.motor = new Motor(145456,"1300");
		this.auto = autoBuilder
				.withMarca("Dodge")
				.withModelo("Charger")
				.withMotor(this.motor)
				.withCantidadPuertas(2)
				.build();
	}
	
	@Test
	public void verificarMarcaAuto() {
		Assert.assertEquals("Marca Auto", "Dodge",this.auto.getMarca());
	}
	
	@Test
	public void verificarModeloAuto() {
		Assert.assertEquals("Modelo Auto", "Charger",this.auto.getModelo());
	}

	@Test
	public void verificarNumeroMotorAuto() {
		Assert.assertEquals("Numero Motor Auto", 145456,this.auto.getMotor().getNumero());
	}
	
	@Test
	public void verificarPotenciaModeloAuto() {
		Assert.assertEquals("Potencia Motor Auto", "1300",this.auto.getMotor().getPotencia());
	}
	
	@Test
	public void verificarCantidadPuertasAuto() {
		Assert.assertEquals("Cantidad Puertas Auto", 2,this.auto.getCantidadPuertas());
	}
	
}

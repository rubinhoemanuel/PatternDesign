package dds.patterndesign.strategy;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AccountLockedException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComisionTest {
	
	private Venta venta;
	private ComisionCompleta comisionCompleta;
	private ComisionNormal comisionNormal;
	private ComisionMinima comisionMinima;
	private List<Producto> productosVendidos;
	private Producto camisa;
	private Producto pantalon;
	
	@Before
	public void setUp() {
		
		this.comisionCompleta = new ComisionCompleta();
		this.comisionNormal = new ComisionNormal();
		this.comisionMinima =  new ComisionMinima();
		
		this.camisa = new Producto("AAA", "Camisa Blanca");
		this.pantalon = new Producto("BBB", "Pantalon Negro");
		
		this.productosVendidos = new ArrayList<Producto>();
		this.productosVendidos.add(this.camisa);
		this.productosVendidos.add(pantalon);
		
	}

	@Test
	public void obtenerComisionCompleta() {
		this.venta = new Venta(this.comisionCompleta);
		Assert.assertTrue(1d == this.venta.obtenerComision(productosVendidos));
	}
	
	@Test
	public void obtenerComisionNormal() {
		this.venta = new Venta(this.comisionNormal);
		Assert.assertTrue(0.6d == this.venta.obtenerComision(productosVendidos));
	}
	
	@Test
	public void obtenerComisionMinima() {
		this.venta = new Venta(this.comisionMinima);
		Assert.assertTrue(0.2d == this.venta.obtenerComision(productosVendidos));
	}

}

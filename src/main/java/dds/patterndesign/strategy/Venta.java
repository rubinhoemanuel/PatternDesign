package dds.patterndesign.strategy;

import java.util.List;

public class Venta {

	private ComisionStrategy comision;
	
	public Venta(ComisionStrategy comision) {
		this.comision = comision;
	}
	
	public double obtenerComision(List<Producto> productos) {
		return this.comision.aplicarComision(productos.size());
	}
	
	
		
}

package dds.patterndesign.strategy;

public class ComisionCompleta implements ComisionStrategy {

	@Override
	public double aplicarComision(double cantidad) {
		return cantidad * 0.5d;
	}

}

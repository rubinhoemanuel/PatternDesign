package dds.patterndesign.strategy;

public class ComisionMinima implements ComisionStrategy {

	@Override
	public double aplicarComision(double cantidad) {
		return cantidad * 0.1d;
	}

}

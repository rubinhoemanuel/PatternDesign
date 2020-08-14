package dds.patterndesign.strategy;

public class ComisionNormal implements ComisionStrategy {

	@Override
	public double aplicarComision(double cantidad) {
		return cantidad * 0.3d;
	}

}

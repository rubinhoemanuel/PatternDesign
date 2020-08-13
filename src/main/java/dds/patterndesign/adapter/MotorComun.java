package dds.patterndesign.adapter;

public class MotorComun implements Motor {
	
	@Override
	public String encender() {
		return "encendiendo el MotorComun";
	}

	@Override
	public String acelerar() {
		return "acelerando el MotorComun";
	}

	@Override
	public String apagar() {
		return "apagando el MotorComun";
	}

}

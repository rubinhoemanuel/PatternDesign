package dds.patterndesign.adapter;

public class MotorElectrico {

	private boolean conectado = false;

	public MotorElectrico() {
		this.conectado = false;
	}

	public String conectar() {
		this.conectado = true;
		return "conectando el MotorElectrico";
	}

	public String activar() {
		if (!this.conectado) {
			return "No se puede activar porque no esta conectado el MotorElectrico";
		} else {
			return "Esta conectado, activando el MotorElectrico";
		}
	}

	public String moverMasRapido() {
		if (!this.conectado) {
			return "No se puede mover rapido el MotorElectrico porque no esta conectado";
		} else {
			return "Moviendo mas rapido el MotorElectrico, aumentando voltaje";
		}
	}

	public String detener() {
		if (!this.conectado) {
			return "No se puede detener el MotorElectrico porque no esta conectado";
		} else {
			return "Deteniendo el MotorElectrico";
		}
	}

	public String desconectar() {
		this.conectado = false;
		return "Desconectando el MotorElectrico";
	}

}

package dds.patterndesign.adapter;

public class MotorElectricoAdapter implements Motor {
	
	private MotorElectrico motorElectrico;
	
	public MotorElectricoAdapter(){
        this.motorElectrico = new MotorElectrico();
    }

	@Override
	public String encender() {
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
        return "encendiendo el MotorElectricoAdapter";
	}

	@Override
	public String acelerar() {
        this.motorElectrico.moverMasRapido();
        return "acelerando el MotorElectricoAdapter";
	}

	@Override
	public String apagar() {		
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
        return "apagando el MotorElectricoAdapter";
	}

}

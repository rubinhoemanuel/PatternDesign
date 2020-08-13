package dds.patterndesign.adapter;

import org.junit.Assert;
import org.junit.Test;

public class MotorTest {
	
	private Motor motor;

	@Test
	public void probarMotorComun() {
		Motor motor = new MotorComun();
		Assert.assertEquals("encendiendo el MotorComun", motor.encender());
		Assert.assertEquals("acelerando el MotorComun", motor.acelerar());
		Assert.assertEquals("apagando el MotorComun", motor.apagar());
	}
	
	@Test
	public void probarMotoElectricoAdapter() {
		Motor motor = new MotorElectricoAdapter();
		Assert.assertEquals("encendiendo el MotorElectricoAdapter", motor.encender());
		Assert.assertEquals("acelerando el MotorElectricoAdapter", motor.acelerar());
		Assert.assertEquals("apagando el MotorElectricoAdapter", motor.apagar());
	}
	
}

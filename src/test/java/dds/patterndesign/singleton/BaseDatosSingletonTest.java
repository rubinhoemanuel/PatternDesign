package dds.patterndesign.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BaseDatosSingletonTest {

	private BaseDatosSingleton oracle;
	private BaseDatosSingleton mySql;
	
	@Before
	public void setUp() {
		oracle = BaseDatosSingleton.getInstance();
		mySql = BaseDatosSingleton.getInstance();
	}
	
	@Test
	public void verificarBaseOracle() {
		oracle.setNombre("Base Oracle");
		mySql.setNombre("Base MySQL");
		Assert.assertEquals("Base MySQL", oracle.getNombre());
		Assert.assertEquals("Base MySQL", mySql.getNombre());
	}
	
}

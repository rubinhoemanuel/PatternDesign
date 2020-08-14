package dds.patterndesign.singleton;

public class BaseDatosSingleton {
	
	private static BaseDatosSingleton instance;
	private String nombre;

    private BaseDatosSingleton() {
    	
    }

    static BaseDatosSingleton getInstance() {
    	if (instance == null) {
            synchronized (BaseDatosSingleton.class) {
                if (instance == null) {
                    instance = new BaseDatosSingleton();
                }
            }
        }
        return instance;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}

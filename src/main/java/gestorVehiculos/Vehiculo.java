package gestorVehiculos;

public abstract class Vehiculo {
	private int id;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public abstract float calcularPrecio(int dias);
	
	public String toString(){
		return getClass().getSimpleName() + " Id: " + getId() + " Descripción: " + getDescripcion();
	}
}

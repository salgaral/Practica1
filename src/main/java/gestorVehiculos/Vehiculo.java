package gestorVehiculos;

public abstract class Vehiculo {
	private int id;
	private String descripcion;
	
	public Vehiculo(int i, String string) {
		this.id=i;
		this.descripcion=string;
	}
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public abstract double calcularPrecio(int dias);
	
	public String toString(){
		return getClass().getSimpleName() + " Id: " + getId() + " Descripción: " + getDescripcion();
	}
}

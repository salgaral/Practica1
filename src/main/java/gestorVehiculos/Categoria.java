package gestorVehiculos;

public enum Categoria {
	A("A", 10),
	B("B", 15),
	C("C", 20);
	
	public int precio;
	public String categoria;
	
	Categoria (String cat, int precio){
		this.precio = precio;
		this.categoria = categoria;
	}
}

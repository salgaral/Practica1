package gestorVehiculos;

public enum Categoria {
	A("A", 10),
	B("B", 15),
	C("C", 20);
	
	public double precio;
	public String categoria;
	
	Categoria (String cat, double precio){
		this.precio = precio;
		this.categoria = cat;
	}
}

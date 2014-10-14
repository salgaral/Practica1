package gestorVehiculos;

public class Coche extends Vehiculo{
	private Categoria cat;
	public Coche(int i, String string, Categoria a) {
		super(i, string);
		this.cat = a;
	}

	String enumCategoria() {
		return cat.categoria;
	}

	@Override
	public double calcularPrecio(int dias) {
		double precio;
		int diasDescuento = 3;
		double precioD1 = 0.8 * cat.precio;
		double precioD2 = 0.5 * cat.precio;
		int diasDescuento2 = 7;
		if(dias<=diasDescuento)
			precio = dias * cat.precio;
		else if(dias<=diasDescuento2)
			precio = diasDescuento * cat.precio + (dias-diasDescuento) * precioD1;
		else
			precio = diasDescuento * cat.precio + (diasDescuento2-diasDescuento) * precioD1 + (dias-diasDescuento2) * precioD2;
		
		return precio;
	}
}

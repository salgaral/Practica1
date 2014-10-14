package gestorVehiculos;

public class Bici extends Vehiculo {

	public Bici(int i, String string) {
		super(i, string);
	}

	@Override
	public double calcularPrecio(int dias) {
		int precio;
		int diasDescuento = 2;
		int precioN = 3;
		int precioD = 2;
		if(dias<=diasDescuento)
			precio = dias * precioN;
		else
			precio = diasDescuento * precioN + (dias-diasDescuento) * precioD;
		
		return precio;
	}

}

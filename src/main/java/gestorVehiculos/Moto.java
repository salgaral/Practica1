package gestorVehiculos;

public class Moto extends Vehiculo {

	public Moto(int i, String string) {
		super(i, string);
		
	}

	@Override
	public double calcularPrecio(int dias) {
		int precio;
		int diasDescuento = 7;
		int precioN = 8;
		int precioD = 7;
		if(dias<=diasDescuento)
			precio = dias * precioN;
		else
			precio = dias * precioD;
		
		return precio;
	}

}

package gestorVehiculos;

import java.util.ArrayList;

public class GestorVehiculos {

	private ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
	
	public void darDeAlta(Vehiculo v) {
		listaVehiculo.add(v);		
	}

	public int getSize() {
		return listaVehiculo.size();
	}
	
	public String toString(){
		String listado = "";
		for(Vehiculo v:listaVehiculo){
			listado += v.toString();
		}
		return listado;
	}

	public double getPrecio(int id, int dias) {
		double precio = 0;
		for(Vehiculo v:listaVehiculo){
			if(v.getId() == id)
				precio = v.calcularPrecio(dias);
		}
		return precio;
	}

}

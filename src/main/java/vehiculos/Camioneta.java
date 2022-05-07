package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int cantidad;
	
	public Camioneta(String placa, int puertas, float velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		
		Camioneta.cantidad++;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Camioneta.cantidad = cantidad;
	}
}

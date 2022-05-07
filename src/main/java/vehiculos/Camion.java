package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int cantidad;
	
	public Camion(String placa, int puertas, float velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		
		Camion.cantidad++;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Camion.cantidad = cantidad;
	}
}

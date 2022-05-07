package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidad;

	public Automovil(String placa, int puertas, float velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4, velocidadMaxima, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		
		Automovil.cantidad++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Automovil.cantidad = cantidad;
	}
}

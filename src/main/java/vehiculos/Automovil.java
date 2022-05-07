package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidad;

	public Automovil(String placa, String nombre, int precio, float peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
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

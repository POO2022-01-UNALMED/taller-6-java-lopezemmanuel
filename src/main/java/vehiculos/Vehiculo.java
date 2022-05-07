package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private float velocidadMaxima;
    private String nombre;
    private int precio;
    private float peso;
    private String traccion;
    private Fabricante fabricante;
    
    private static int CantidadVehiculos;

	public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		
		Vehiculo.CantidadVehiculos++;
		
		this.fabricante.ventas++;
		this.fabricante.getPais().ventas++;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidad() + "\n"
			 + "Camionetas: " + Camioneta.getCantidad() + "#\n"
			 + "Camiones: " + Camion.getCantidad();
	}
}

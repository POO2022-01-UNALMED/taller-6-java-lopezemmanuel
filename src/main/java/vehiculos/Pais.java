package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    int ventas;
    private static ArrayList<Pais> paises = new ArrayList<Pais>();

	public Pais(String nombre) {
		this.nombre = nombre;
		this.ventas = 0;
		
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}

	public static Pais paisMasVendedor(){
		Pais ganador = new Pais(null);
		
		for(Pais pais: paises) {
			if(ganador.ventas < pais.ventas) {
				ganador = pais;
			}
		}
		
		return ganador;
	}
}

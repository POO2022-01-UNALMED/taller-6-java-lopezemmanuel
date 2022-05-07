package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    int ventas;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
    
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.ventas = 0;
		
		fabricantes.add(this);
	}
    
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas(){
		Fabricante ganador = new Fabricante(null, null);
		
		for(Fabricante fabricante: fabricantes) {
			if(ganador.ventas < fabricante.ventas) {
				ganador = fabricante;
			}
		}
		
		return ganador;
	}
}

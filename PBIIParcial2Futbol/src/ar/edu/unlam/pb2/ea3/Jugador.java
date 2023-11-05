package ar.edu.unlam.pb2.ea3;

import java.util.Objects;

public class Jugador implements Comparable {

	private Integer numCamiseta;
	private String nombre;
	private Integer precio;

	public Jugador(Integer numCamiseta, String nombre, Integer precio) {
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public Integer getNumCamiseta() {
		return numCamiseta;
	}

	public void setNumCamiseta(Integer numCamiseta) {
		this.numCamiseta = numCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public int compareTo(Object o) {
		Jugador jugadorAcomparar = (Jugador) o;

		return this.nombre.compareTo(jugadorAcomparar.getNombre());
	}

}

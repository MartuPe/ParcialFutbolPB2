package ar.edu.unlam.pb2.ea3;

import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {

	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		jugadores = new TreeSet<>();
	}

	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {
		Integer cantJugadores = jugadores.size();
		Jugador jugadorRepetido = buscarDuplicadoPorNombre(jugador.getNombre());

		

		if (cantJugadores < 23 && jugadorRepetido == null) {
			jugadores.add(jugador);
		}else if (cantJugadores >= 23) {
			throw new CapacidadMaximaException();
		}

		/*
		 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
		 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
		 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
		 */
	}

	private Jugador buscarDuplicadoPorNombre(String nombre2) throws JugadorDuplicadoException {
	
		for (Jugador jugador : jugadores) {
			if(jugador.getNombre().equals(nombre2)) {
				throw new JugadorDuplicadoException();
			}
		}
		return null;
	}


	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException {
		Jugador jugadorExistente = buscarJugadorPorNombre(saliente.getNombre());
		Boolean sePudoCambiar = false;
		if(jugadorExistente != null) {
			jugadores.remove(saliente);
			jugadores.add(entrante);
			sePudoCambiar = true;
		}
		
		/*
		 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
		 * presente en el equipo generar� una excepci�n (JugadoreInexistenteException).
		 */
		return sePudoCambiar;
	}

	private Jugador buscarJugadorPorNombre(String nombre2) throws JugadoreInexistenteException {

		for (Jugador jugador : jugadores) {
			if(jugador.getNombre().equals(nombre2)) {
				return jugador;
			}
		}
		throw new JugadoreInexistenteException();
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {

		return (TreeSet<Jugador>) jugadores;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		TreeSet<Jugador> jugadoresOrdenadosPorPrecio = new TreeSet<>(new JugadoresOrdenadosPorPrecio());
		jugadoresOrdenadosPorPrecio.addAll(jugadores);
		return jugadoresOrdenadosPorPrecio;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		TreeSet<Jugador> jugadoresOrdenadosPorNumCamiseta = new TreeSet<>(new JugadoresOrdenadosPorNumCamiseta());
		jugadoresOrdenadosPorNumCamiseta.addAll(jugadores);
		return jugadoresOrdenadosPorNumCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}

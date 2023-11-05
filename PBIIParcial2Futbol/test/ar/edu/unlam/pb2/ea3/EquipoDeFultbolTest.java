package ar.edu.unlam.pb2.ea3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;


public class EquipoDeFultbolTest {

	@Test 
	public void queSePuedaCrearUnEquipoVacio() {
		EquipoDeFutbol napoli = new EquipoDeFutbol("Napoli");
		
		assertTrue(napoli.getJugadores().isEmpty());
		
	}
	
	@Test 
	public void queSePuedanAgregarJugadorAlEquipo() throws CapacidadMaximaException, JugadorDuplicadoException {
		
		Jugador laPulga = new Jugador(10, "Lionel Messi", 999999999);
		EquipoDeFutbol barcelona = new EquipoDeFutbol("Barcelona");
		barcelona.agregarJugador(laPulga);
		
		assertTrue(barcelona.getJugadores().contains(laPulga));
		
	}
	
	@Test (expected = JugadorDuplicadoException.class)
	public void queAlIntentarAgregarUnJugadorExistenetLanceExcepcion() throws CapacidadMaximaException, JugadorDuplicadoException{
		
		EquipoDeFutbol barcelona = new EquipoDeFutbol("Barcelona");
		Jugador laPulga = new Jugador(10, "Lionel Messi", 999999999);
		
		barcelona.agregarJugador(laPulga);
		
		assertTrue(barcelona.getJugadores().contains(laPulga));
		
		Jugador elMejor = new Jugador(1, "Lionel Messi", 1);
		barcelona.agregarJugador(elMejor);
		
		assertTrue(false);
	}
	
	@Test (expected = CapacidadMaximaException.class)
	public void queAlIntentarAgregarCantidadExcesivaDeJugadoresLanceExcepcion() throws CapacidadMaximaException, JugadorDuplicadoException{
		
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "�ngel Di Mar�a", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo P�rez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higua�n", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodr�guez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agust�n Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Mart�n Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo �lvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Ag�ero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano And�jar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "Jos� Basanta", 10000));

		argentina.agregarJugador(new Jugador(24, "Eber Ludue�a", 0));
		
		assertTrue(false);
	}
	
	@Test
	public void queSePuedaCambiarUnJugador() throws CapacidadMaximaException, JugadorDuplicadoException, JugadoreInexistenteException{
		
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "�ngel Di Mar�a", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo P�rez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higua�n", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodr�guez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agust�n Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Mart�n Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo �lvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Ag�ero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano And�jar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "Jos� Basanta", 10000));
		
		Jugador saliente = new Jugador (10, "Lionel Messi", 10000);
		Jugador entrante = new Jugador (10, "Pablo Perez", 10000);

		assertTrue(argentina.cambiarJugador(saliente, entrante));
		
		assertTrue(argentina.getJugadores().contains(entrante));
		assertFalse(argentina.getJugadores().contains(saliente));
		
	}
	
	@Test (expected = JugadoreInexistenteException.class)
	public void queAlCambiarUnJugadorInexistenteLanceExcepcion() throws CapacidadMaximaException, JugadorDuplicadoException, JugadoreInexistenteException{
	
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "�ngel Di Mar�a", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo P�rez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higua�n", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodr�guez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agust�n Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Mart�n Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo �lvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Ag�ero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano And�jar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "Jos� Basanta", 10000));
		
		Jugador saliente = new Jugador (10, "Diego Maradona", 10000);
		Jugador entrante = new Jugador (10, "Pablo Aimar", 10000);

		argentina.cambiarJugador(saliente, entrante);
	}

	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNombre() throws CapacidadMaximaException, JugadorDuplicadoException, JugadoreInexistenteException{
	
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10000));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10000));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10000));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10000));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10000));
		argentina.agregarJugador(new Jugador(7, "Angel Di Mar�a", 10000));
		argentina.agregarJugador(new Jugador(8, "Enzo P�rez", 10000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higua�n", 10000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 10000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodr�guez", 10000));
		argentina.agregarJugador(new Jugador(12, "Agust�n Orion", 10000));
		argentina.agregarJugador(new Jugador(13, "Augusto Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10000));
		argentina.agregarJugador(new Jugador(15, "Mart�n Demichelis", 10000));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10000));
		argentina.agregarJugador(new Jugador(17, "Federico Fern�ndez", 10000));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10000));
		argentina.agregarJugador(new Jugador(19, "Ricardo �lvarez", 10000));
		argentina.agregarJugador(new Jugador(20, "Sergio Ag�ero", 10000));
		argentina.agregarJugador(new Jugador(21, "Mariano And�jar", 10000));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10000));
		argentina.agregarJugador(new Jugador(23, "Jos� Basanta", 10000));
		
		Iterator<Jugador> it = argentina.getJugadores().iterator();
		
		Jugador primero = it.next();
		
		assertEquals("Agust�n Orion", primero.getNombre());
		
		Jugador ultimo;
		for(int i=0; i<21; i++) {
			it.next();
		}
		ultimo = (Jugador)it.next();
		
		assertEquals("Sergio Romero", ultimo.getNombre());
	}
	
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorPrecioDeCompra() throws CapacidadMaximaException, JugadorDuplicadoException, JugadoreInexistenteException{
		EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10001));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10002));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10003));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10004));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10005));
		argentina.agregarJugador(new Jugador(7, "Angel Di Mar�a", 90000000));
		argentina.agregarJugador(new Jugador(8, "Enzo P�rez", 199000000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higua�n", 150000000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 200000000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodr�guez", 10006));
		argentina.agregarJugador(new Jugador(12, "Agust�n Orion", 10007));
		argentina.agregarJugador(new Jugador(13, "Augusto Fern�ndez", 10008));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10009));
		argentina.agregarJugador(new Jugador(15, "Mart�n Demichelis", 10010));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10011));
		argentina.agregarJugador(new Jugador(17, "Federico Fern�ndez", 10012));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10013));
		argentina.agregarJugador(new Jugador(19, "Ricardo �lvarez", 10014));
		argentina.agregarJugador(new Jugador(20, "Sergio Ag�ero", 140000000));
		argentina.agregarJugador(new Jugador(21, "Mariano And�jar", 10015));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10016));
		argentina.agregarJugador(new Jugador(23, "Jose Basanta", 1));
		
		Iterator<Jugador> it = argentina.devolverPlanteOrdenadoPorPrecioDeCompraDeJugador().iterator();
		
		Jugador primero = it.next();
		
		assertEquals("Jose Basanta", primero.getNombre());
		
		Jugador ultimo;
		for(int i=0; i<21; i++) {
			it.next();
		}
		ultimo = (Jugador)it.next();
		
		assertEquals("Lionel Messi", ultimo.getNombre());
	}
	
	@Test
	public void queElEquipoPresenteLosJugadoresOrdenadosPorNumeroDeCamiseta() throws CapacidadMaximaException, JugadorDuplicadoException, JugadoreInexistenteException{
EquipoDeFutbol argentina = new EquipoDeFutbol("Argentina");
		
		argentina.agregarJugador(new Jugador(1, "Sergio Romero", 10000));
		argentina.agregarJugador(new Jugador(2, "Ezequiel Garay", 10001));
		argentina.agregarJugador(new Jugador(3, "Hugo Campagnaro", 10002));
		argentina.agregarJugador(new Jugador(4, "Pablo Zabaleta", 10003));
		argentina.agregarJugador(new Jugador(5, "Fernando Gago", 10004));
		argentina.agregarJugador(new Jugador(6, "Lucas Biglia", 10005));
		argentina.agregarJugador(new Jugador(7, "Angel Di Mar�a", 90000000));
		argentina.agregarJugador(new Jugador(8, "Enzo P�rez", 199000000));
		argentina.agregarJugador(new Jugador(9, "Gonzalo Higua�n", 150000000));
		argentina.agregarJugador(new Jugador(10, "Lionel Messi", 200000000));
		argentina.agregarJugador(new Jugador(11, "Maximiliano Rodr�guez", 10006));
		argentina.agregarJugador(new Jugador(12, "Agust�n Orion", 10007));
		argentina.agregarJugador(new Jugador(13, "Augusto Fern�ndez", 10008));
		argentina.agregarJugador(new Jugador(14, "Javier Mascherano", 10009));
		argentina.agregarJugador(new Jugador(15, "Mart�n Demichelis", 10010));
		argentina.agregarJugador(new Jugador(16, "Marcos Rojo", 10011));
		argentina.agregarJugador(new Jugador(17, "Federico Fern�ndez", 10012));
		argentina.agregarJugador(new Jugador(18, "Rodrigo Palacio", 10013));
		argentina.agregarJugador(new Jugador(19, "Ricardo �lvarez", 10014));
		argentina.agregarJugador(new Jugador(20, "Sergio Ag�ero", 140000000));
		argentina.agregarJugador(new Jugador(21, "Mariano And�jar", 10015));
		argentina.agregarJugador(new Jugador(22, "Ezequiel Lavezzi", 10016));
		argentina.agregarJugador(new Jugador(23, "Jos� Basanta", 1));
		
		Iterator<Jugador> it = argentina.devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador().iterator();
		
		Jugador primero = it.next();
		
		assertEquals("Sergio Romero", primero.getNombre());
		
		Jugador ultimo;
		for(int i=0; i<21; i++) {
			it.next();
		}
		ultimo = (Jugador)it.next();
		
		assertEquals("Jos� Basanta", ultimo.getNombre());
	}
}

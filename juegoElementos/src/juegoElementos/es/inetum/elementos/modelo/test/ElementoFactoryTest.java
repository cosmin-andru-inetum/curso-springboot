package juegoElementos.es.inetum.elementos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import juegoElementos.es.inetum.elementos.modelo.ElementoFactory;
import juegoElementos.es.inetum.elementos.modelo.Papel;
import juegoElementos.es.inetum.elementos.modelo.Piedra;
import juegoElementos.es.inetum.elementos.modelo.Tijera;

public class ElementoFactoryTest {

	Piedra piedra;
	Papel papel;
	Tijera tijera;
	@Before
	public void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}
	
	@After
	public void tearDown() throws Exception {
		piedra = null;
		papel = null;
		tijera = null;
	}
	
	@Test
	public void testCompararPiedraTijera() {
		assertEquals(1, piedra.comparar(tijera));
	}
	
	@Test
	public void testCompararPapelPiedra() {
		assertEquals(1, papel.comparar(piedra));
	}
	
	@Test
	public void testCompararTijeraPapel() {
		assertEquals(1, tijera.comparar(papel));
	}
	
	@Test
	public void testGetInstancePiedra() {
		assertTrue(ElementoFactory.getInstance(0) instanceof Piedra);
	}
	
	@Test
	public void testGetInstancePapel() {
		assertTrue(ElementoFactory.getInstance(1) instanceof Papel);
	}
	
	@Test
	public void testGetInstanceTijera() {
		assertTrue(ElementoFactory.getInstance(2) instanceof Tijera);
	}
}

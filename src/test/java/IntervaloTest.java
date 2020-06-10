import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class IntervaloTest {
	private Intervalo inter;
	
	@BeforeEach
	void setUp() throws Exception{
		inter= new Intervalo(1,2);
	}
	
	@Test
	void testRango() {
		assertTrue(inter.getMax()>inter.getMin());
	}
	
	@Test
	void testSumatoria() {
		assertEquals(inter.sumatoria(),55);
	}
	
	@Test
	void testProducto() {
		assertEquals(inter.producto(),3628800);
	}
	
	@Test
	void testGetters() {
		assertEquals(inter.getMax(),10);
		assertEquals(inter.getMin(),1);
	}	
	
	@Test
	void testDentro() {
		assertTrue(inter.dentro(5));
		assertFalse(inter.dentro(20));
		assertFalse(inter.dentro(-5));
	}
	
	@Test
	void testInterseccion() {
		assertEquals(inter.interseccion(new Intervalo(12,18)),Optional.empty());
		assertEquals(inter.interseccion(new Intervalo(10,20)).get().getMax(),20);
		assertEquals(inter.interseccion(new Intervalo(10,20)).get().getMin(),1);
	}	
}

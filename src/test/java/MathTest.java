import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void sumaTest() {
		assertEquals(2, Math.suma(1, 1));
	}
	
	@Test
	void restaTest() {
		assertEquals(3, Math.resta(5, 2));
	}
	
	@Test
	void multiplicacionTest() {
		assertEquals(10, Math.multiplicacion(5, 2));
	}
	
	@Test
	void divitest() {
		assertEquals(3, Math.division(6, 2));
	}
	
	@Test
	void expTest() {
		assertEquals(4, Math.exponenciacion(2, 2));
	}

}

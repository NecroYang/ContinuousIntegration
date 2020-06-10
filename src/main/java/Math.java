
public class Math {
	/**
	 * Suma 2 int
	 * @param x
	 * @param y
	 * @return retorna un int
	 */
	public static int suma(int x,int y) {
		return x+y;
	}
	
	/**
	 * Resta 2 int
	 * @param x
	 * @param y
	 * @return retorna un int
	 */
	public static int resta(int x,int y) {
		return x-y;
	}
	
	/**
	 * Multiplica los int
	 * @param x
	 * @param y
	 * @return retorna un int
	 */
	public static int multiplicacion(int x,int y) {
		return x*y;
	}
	
	/**
	 * Realiza una division entre los 2 in
	 * @param x
	 * @param y
	 * @return retorna un int
	 */
	public static int division(int x, int y) {
		return x/y;
	}
	
	/**
	 * Eleva el primer int a la y potencia
	 * @param x
	 * @param y
	 * @return retorna un int
	 */
	public static int exponenciacion(int x, int y) {
		int r=1;
		for(int i=0;i<y;i++) {
			r=r*x;
		}
		return r;
	}
}

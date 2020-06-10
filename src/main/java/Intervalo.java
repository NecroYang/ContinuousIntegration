import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

/**
 * Esta clase representa el concepto matematico que intervalos. Es decir
 * representa todos los valores entre uno y otro. Con esto luego puedes
 * preguntar si un valor están dentro de un intervalo o no.
 */
public class Intervalo {

	private int _min;
	private int _max;

	public Intervalo(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("valor min " + min + " no deberia ser mayor a valor max " + max);
		}
		_min = min;
		_max = max;
	}
	/**
	 * suma todos los numeros dentro del intervalo
	 * @return retorna un int
	 */
	public int sumatoria() {
		return IntStream.range(_min,_max+1).reduce(0, (a,b)->a+b);
	}

	/**
	 * multiplica todos los numeros dentro del intervalo
	 * @return retorna un int
	 */
	public int producto() {
		return IntStream.range(_min,_max+1).reduce(1, (a,b)->a*b);
	}

	/**
	 * @returns true si num esta entre el valor minimo y maximo (incluyendo esos
	 *          valores)
	 */
	public boolean dentro(int num) {
		if(num<=_max && num>=_min) {
			return true;
		}
		return false;
	}

	/**
	 * Calcula la interseccion entre intervalos
	 * 
	 * @param otro el otro intervalo
	 * @returns devuelve un nuevo intervalo que comprende todos los valores entre
	 *          este intervalo y otro. Si no hay interseccion devuelve un Optional
	 *          vacio.
	 */
	public Optional<Intervalo> interseccion(Intervalo otro) {
		int min=otro.getMin(),max=otro.getMax();
		if(dentro(min)||dentro(max)) {
			if(_min<min) {
				min=_min;
			}
			if(_max>max) {
				max=_max;
			}
			return Optional.of(new Intervalo(min,max));
		}
		return Optional.empty();
	}
	
	public int getMin() {
		return _min;
	}
	public int getMax() {
		return _max;
	}
}
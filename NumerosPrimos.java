import java.util.*;
import java.util.stream.*;

class NumerosPrimos {
    public static void main(String[] args) {
        int cantidad = 10;
        int contador = 0;
        Integer[] numerosPrimos = new Integer[cantidad];
        for (int i = 0; contador < cantidad; i++) {
            if (esPrimo(i)) {
                numerosPrimos[contador] = i;
                contador++;
            }
        }
        imprimir(Arrays.asList(numerosPrimos));
    }
    
    static boolean esPrimo(int numero) {
        if (numero <= 1) return false;  // Se descarta que sea menor o igual a 1
        for (int i = 2; i <= Math.sqrt(numero); i++)  // se obtiene raíz cuadrada del número, ya que no es necesario hacer más divisiones por encima
            if (numero % i == 0) return false;  // si existe algún número que pueda ser divisible por el número que queremos evaluar significa que es compuesto, osea no es un primo
        return true;  // si no existe un número divisible menor o igual a la raíz cuadrada del número que queremos evaluar es porque solamente el número es divisible entre 1 y el mismo número (primo)
    }

    static void imprimir(List<Integer> listaPrimos) {
        listaPrimos.stream()
            .filter(item -> item != null)
            .forEach(System.out::println);
    }
    
    
}

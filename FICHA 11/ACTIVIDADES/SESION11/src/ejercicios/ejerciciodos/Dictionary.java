package ejercicios.ejerciciodos;


import java.util.ArrayList;
import java.util.Iterator;

public class Dictionary {

    private final ArrayList<Pair> pairs;

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    // void add (key, value)
    // crea un nuevo objeto Pair con las claves y valores proporcionados y lo agrega al ArrayList pairs
    public void addes(Object key, Object value) {
        Pair pair = new Pair() {
            @Override
            public Object getKey() {
                return key;
            }
            @Override
            public Object getValue() {
                return value;
            }
            @Override
            public String toString() {
                return "Clave: " + getKey() + ", Valor: " + getValue();
            }
        };
        pairs.add(pair);
    }

    // boolean delete (key)
// manda true si se logra eliminar, false si no
    public boolean delete(Object key) {
        Iterator<Pair> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair pair = iterator.next();
            if (pair.getKey().equals(key)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // obtener el valor asociado a una clave key
    // V getValue (key)
    // lanza objectNoExistException si no hay clave
    public Object getValue(Object key) throws ObjectNoExistException {
        for (Pair pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExistException("La clave '" + key + "' no existe en el diccionario");
    }

    // metodo para mostrar todos los pares ordenados del diccionario
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Diccionario:\n");
        for (Pair pair : pairs) {
            result.append(pair).append("\n");
        }
        return result.toString();
    }

    // representa un par ordenado
    public interface Pair <K, V> {
        K getKey();
        V getValue();
        @Override
        String toString();
    }

    // indica que un objeto no existe en el diccionario
    public static class ObjectNoExistException extends Exception {
        public ObjectNoExistException(String message) {
            super(message);
        }
    }
}

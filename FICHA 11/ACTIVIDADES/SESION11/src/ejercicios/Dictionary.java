package ejercicios;

import java.util.ArrayList;

public class Dictionary<K, V> {

    private final ArrayList<Pair<K, V>> pairs;

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    // Agrega un nuevo par clave-valor al ArrayList pairs
    public void add(K key, V value) {
        Pair<K, V> pair = new Pair<>(key, value);
        pairs.add(pair);
    }

    // Elimina un par clave-valor según la clave proporcionada
    public boolean delete(K key) {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    // Obtiene el valor asociado a una clave
    // Lanza ObjectNoExistException si no hay clave
    public V getValue(K key) throws ObjectNoExistException {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExistException("La clave '" + key + "' no existe en el diccionario");
    }

    // Método para mostrar todos los pares ordenados del diccionario
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Diccionario:\n");
        for (Pair<K, V> pair : pairs) {
            result.append(pair).append("\n");
        }
        return result.toString();
    }

    // Representa un par ordenado
    public static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Key: " + key + ", Value: " + value;
        }
    }

    // Indica que un objeto no existe en el diccionario
    public static class ObjectNoExistException extends Exception {
        public ObjectNoExistException(String message) {
            super(message);
        }
    }
}
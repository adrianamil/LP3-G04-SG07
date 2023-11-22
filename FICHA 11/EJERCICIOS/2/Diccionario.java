import java.util.ArrayList;

class Diccionario<K, V> {
    private ArrayList<ParOrdenado<K, V>> listaPares;

    public Diccionario() {
        this.listaPares = new ArrayList<>();
    }

    public void add(K key, V value) {
        ParOrdenado<K, V> nuevoPar = new ParOrdenado<>(key, value);
        listaPares.add(nuevoPar);
    }

    public boolean delete(K key) {
        ParOrdenado<K, V> parAEliminar = buscarParPorClave(key);
        if (parAEliminar != null) {
            listaPares.remove(parAEliminar);
            return true;
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExist {
        ParOrdenado<K, V> parBuscado = buscarParPorClave(key);
        if (parBuscado != null) {
            return parBuscado.getValue();
        } else {
            throw new ObjectNoExist("La clave '" + key + "' no existe en el diccionario.");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (ParOrdenado<K, V> par : listaPares) {
            result.append(par).append("\n");
        }
        return result.toString();
    }

    private ParOrdenado<K, V> buscarParPorClave(K key) {
        for (ParOrdenado<K, V> par : listaPares) {
            if (par.getKey().equals(key)) {
                return par;
            }
        }
        return null;
    }
}

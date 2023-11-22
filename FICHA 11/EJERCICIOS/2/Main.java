public class Main {
    public static void main(String[] args) {
        Diccionario<String, Integer> diccionario = new Diccionario<>();
        diccionario.add("uno", 1);
        diccionario.add("dos", 2);
        diccionario.add("tres", 3);

        System.out.println("Diccionario inicial:");
        System.out.println(diccionario);

        System.out.println("Eliminar 'dos': " + diccionario.delete("dos"));
        System.out.println("Diccionario después de eliminar 'dos':");
        System.out.println(diccionario);

        try {
            System.out.println("Valor de 'uno': " + diccionario.getValue("uno"));
            System.out.println("Valor de 'dos': " + diccionario.getValue("dos")); // Esto lanzará una excepción
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}

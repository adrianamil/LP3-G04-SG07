package UNO;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el nombre del archivo o directorio:");

        // crear objeto Path con base en la entrada del usuario
        Path ruta = Paths.get(sc.nextLine());

        // validar si la ruta existe
        if (Files.exists(ruta)) {

            // mostrar información de archivo (o directorio)
            System.out.printf("%n %s existen", ruta.getFileName());
            System.out.printf("%s un directorio %n", Files.isDirectory(ruta) ? "Es" : "No es");
            System.out.printf("%s una ruta absolutan", ruta.isAbsolute() ? "Es" : "No es");
            System.out.printf("Fecha de ultima modificacion: %s%n", Files.getLastModifiedTime(ruta));
            System.out.printf("Tamanio: %s %n", Files.size(ruta));
            System.out.printf("Ruta: %s %n", ruta);
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());

            // si es un directorio, mostrar su contenido
            if (Files.isDirectory(ruta)) {
                System.out.printf("%nContenido del directorio: %n ");

                // objeto para iterar en el contenido de un directorio
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                // iterar sobre el flujo y mostrar cada elemento
                for (Path p : flujoDirectorio) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.printf("%s no exiten", ruta);
        }
    }
}

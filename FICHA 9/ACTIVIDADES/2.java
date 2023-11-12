ACTIVIDAD 2
public class SESION9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        
        try(PrintWriter salida = new PrintWriter("c:/ficheros/datos.txt")){
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena=sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
           
        } catch (FileNotFoundException ex) {
            System.out.println(e.getMessage());
        }  
    }
} 

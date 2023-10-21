public class AppExcepcion {
    public static void main(String[]args){
        try{
            metodo1();
        }
        catch(Exception e){
            System.out.println("La ecepcion se manejo en main");

        }
        metodo2();
    }
    public static void metodo1() throws Exception{
        try{
            System.out.println("Metodo1");
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("La excepcion se manejo en el metodo1");
            throw e;
        }
        finally{
            System.out.println("Metodo metodo2");
        }
    }
    public static void metodo2(){
        try{
            System.out.println("Metodo metodo2");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Fin del metodo2");
        }
    }
}

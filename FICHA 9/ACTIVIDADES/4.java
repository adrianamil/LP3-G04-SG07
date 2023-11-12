//ACTIVIDAD 4
//PARTE 1

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;


public class TestFilePrueba {
    public static void main(String[] args )throws IOException {
        FileInputStream file;
        byte b[] = new byte[1024];
        try{
            file = new FileInputStream("src/actividad1/TestFile.java");
            file.read(b);
            String s = new String(b);
            ViewFile view = new ViewFile(s);
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setSize(500, 150);
            view.setVisible(true);  
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }  
}

//PARTE 2
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewFile extends JFrame {
    private final JTextArea areaTexto;
   
    public ViewFile(String s) {
        super("Mostrando el contenido de un archivo");
        areaTexto=new JTextArea(s,5, 40);
        add(areaTexto);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
public class WordCount {
    private JFrame frame;
    private JPanel panel;
    private JTextArea resultTextArea;
    public WordCount() {
        frame = new JFrame("WordCount");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JButton countButton = new JButton("Contar Palabras y Caracteres");
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contarPalabrasYCaracteres();
            }
        });
        panel.add(countButton, BorderLayout.NORTH);
        panel.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }
    private void contarPalabrasYCaracteres() {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        int charCountWithoutSpaces = 0;
        try {
            File file = new File("lear.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lineCount++;
                String line = scanner.nextLine();
                charCount += line.length();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 0) {
                        wordCount++;
                        charCountWithoutSpaces += word.length();
                    }
                }
            }
            resultTextArea.setText("Archivo: lear.txt\nLíneas: " + lineCount + "\nPalabras: " + wordCount + "\nCaracteres (con espacios): " + charCount
                    + "\nCaracteres (sin espacios): " + charCountWithoutSpaces);
        } catch (FileNotFoundException e) {
            resultTextArea.setText("Error: El archivo 'lear.txt' no se encontró.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WordCount();
            }
        });
    }
}


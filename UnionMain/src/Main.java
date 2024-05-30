import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        System.out.println("*****PRIMER COMPONENTE*****");
        String texto;
        // ingresar datos en un ShowInputDialog
        texto = JOptionPane.showInputDialog(null, "Introduzca el texto del primer componente");
        System.out.println("El texto obtenido es: " + texto);

        Entrada entrada = new Entrada();
        // agregar al frame
        JTextField textField = new JTextField(texto);
        inputPanel.add(textField);

        int cantidadLetras = entrada.cantidadLetras(texto);

        System.out.println("La cantidad de letras es: " + cantidadLetras);

        ////////////////////////////
        System.out.println("Segundo Componente");
        Segundo segundo = new Segundo();
        // String textoSegundo = JOptionPane.showInputDialog(null, "Introduzca el texto");
        // System.out.println("El texto obtenido es: "+textoSegundo);
        segundo.progressBar(cantidadLetras, texto);
        JProgressBar progressBar =  new JProgressBar();
        progressBar.setValue(cantidadLetras);
        inputPanel.add(progressBar);

        frame.add(inputPanel);
        frame.setVisible(true);

        String salida = segundo.progressBar(cantidadLetras, texto);
        System.out.println("El mensaje final es: " + salida);

        JOptionPane.showMessageDialog(null, salida);

    }
}
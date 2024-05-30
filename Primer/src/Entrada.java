import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Entrada extends JTextField{

    //Patiño Angel
    public int cantidadLetras (String texto){
        setLayout(new BorderLayout());
        JTextField textField;
        textField = new JTextField(texto);
        textField.setEditable(false);

        // Establecer diseño del panel
        setLayout(new BorderLayout());
        add(textField, BorderLayout.CENTER);

        return texto.length();
    }
}
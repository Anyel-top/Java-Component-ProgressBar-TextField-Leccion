import javax.swing.*;
import java.awt.*;

public class Segundo extends JProgressBar{

    public String progressBar (int cantidad, String mensaje ){
        setLayout(new BorderLayout());
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(cantidad);
        progressBar.setStringPainted(true);
        progressBar.setMaximum(100);
        progressBar.setMinimum(0);
        add(progressBar, BorderLayout.CENTER);

        return  mensaje + ", Viene del programa principal";
    }
}

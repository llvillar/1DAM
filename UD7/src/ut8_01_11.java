import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ut8_01_11 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 100);
        ventana.setTitle("Prueba de ActionListener");
        ventana.setLayout(new GridLayout(1,3));

        JButton resultado = new JButton("0");
        JButton menosUno = new JButton("-1");
        JButton masUno = new JButton("+1");

        resultado.addActionListener(new ResultadoActionListener());
        menosUno.addActionListener(new MenosUnoActionListener(resultado));
        masUno.addActionListener(new MasUnoActionListener(resultado));

        ventana.add(menosUno);
        ventana.add(resultado);
        ventana.add(masUno);
        ventana.setVisible(true);
    }
}






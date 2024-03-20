import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class ut8_01_08 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(500, 500);
        ventana.setTitle("Calculadora");

        ventana.setLayout(new BorderLayout());

        JTextField resultado = new JTextField();
        resultado.setText("0");
        ventana.add(resultado, BorderLayout.PAGE_START);



        JPanel teclado = new JPanel( new GridLayout(4, 4));
        teclado.add((new JButton("1")));
        teclado.add(new JButton("2"));
        teclado.add(new JButton("3"));
        teclado.add(new JButton("+"));

        teclado.add(new JButton("4"));
        teclado.add(new JButton("5"));
        teclado.add(new JButton("6"));
        teclado.add(new JButton("-"));

        teclado.add(new JButton("7"));
        teclado.add(new JButton("8"));
        teclado.add(new JButton("9"));
        teclado.add(new JButton("*"));

        teclado.add(new JButton("."));
        teclado.add(new JButton("0"));
        teclado.add(new JButton("="));
        teclado.add(new JButton("/"));

        ventana.add(teclado, BorderLayout.CENTER);

        ventana.add(new JLabel("I.E.S. Oretania", JLabel.CENTER), BorderLayout.PAGE_END);

        ventana.setVisible(true);
    }
}

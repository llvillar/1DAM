import javax.swing.*;
import java.awt.*;

public class ut8_01_08 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(500, 500);
        ventana.setTitle("Calculadora");
        //GridLayout layout1 = new GridLayout(3, 1);

        ventana.setLayout(new GridBagLayout());
        JTextField resultado = new JTextField();
        resultado.setText("0");
        resultado.setMaximumSize(new Dimension(500,20));
        ventana.add(resultado);

        new GridLayout(4, 4);

        JPanel teclado = new JPanel();
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

        ventana.add(teclado);

        ventana.add(new JLabel("I.E.S. Oretania"), BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}

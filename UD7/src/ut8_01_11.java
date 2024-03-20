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

class ResultadoActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        source.setText("0");
    }
}

class MenosUnoActionListener implements ActionListener {

    private JButton resultado;
    public MenosUnoActionListener(JButton resultado) {
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String total = resultado.getText();
        int i = Integer.parseInt(total);
        total = String.valueOf(i - 1);
        resultado.setText(total);
    }
}

class MasUnoActionListener implements ActionListener {

    private JButton resultado;
    public MasUnoActionListener(JButton resultado) {
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String total = resultado.getText();
        int i = Integer.parseInt(total);
        total = String.valueOf(i + 1);
        resultado.setText(total);
    }
}
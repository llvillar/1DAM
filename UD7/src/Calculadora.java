import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    JLabel display;
    double operandoAnterior = 0;
    CalculadoraOperacion operacion = CalculadoraOperacion.NINGUNA;
    boolean borrarResultado = false;


    public Calculadora() throws HeadlessException {
        super("Calculadora");

        char[] botones = {  '1', '2', '3', '+',
                '4', '5', '6', '-',
                '7', '8', '9', '*',
                '.', '0', '=', '/' };

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setTitle("Calculadora");

        display = new JLabel("0", JLabel.RIGHT);
        display.setFont(display.getFont().deriveFont(32.0f));
        this.add(display, BorderLayout.PAGE_START);

        JPanel teclasPanel = new JPanel(new GridLayout(4, 4));

        NumeroActionListener nal = new NumeroActionListener(this);
        OperacionActionListener oal = new OperacionActionListener(this);

        for (char c : botones) {
            JButton btn = new JButton(Character.toString(c));
            if ((c >= '0' && c <= '9') || c == '.') {
                btn.addActionListener(nal);
            } else {
                btn.addActionListener(oal);
            }
            teclasPanel.add(btn);
        }

        this.add(teclasPanel, BorderLayout.CENTER);

        this.add(new JLabel("I.E.S. Oretania", JLabel.CENTER), BorderLayout.PAGE_END);

        this.setVisible(true);
    }

}



class OperacionActionListener implements ActionListener {
    Calculadora calc;
    public OperacionActionListener(Calculadora calculadora) {
        this.calc = calculadora;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        double operando1 = Double.parseDouble(calc.display.getText());
        double resultado = 0;

        if (calc.operacion != CalculadoraOperacion.NINGUNA) {
            try {
                switch (calc.operacion) {
                    case SUMA:
                        resultado = calc.operandoAnterior + operando1;
                        break;
                    case RESTA:
                        resultado = calc.operandoAnterior - operando1;
                        break;
                    case PRODUCTO:
                        resultado = calc.operandoAnterior * operando1;
                        break;
                    case DIVISION:
                        resultado = calc.operandoAnterior / operando1;
                }
                calc.display.setText(Double.toString(resultado));
            } catch (Exception ignore) {
                calc.display.setText("ERROR");
            }
            calc.borrarResultado = true;
            calc.operacion = CalculadoraOperacion.NINGUNA;
        }

        switch (btn.getText()) {
            case "+":
                calc.operacion = CalculadoraOperacion.SUMA;
                break;
            case "-":
                calc.operacion = CalculadoraOperacion.RESTA;
                break;
            case "*":
                calc.operacion = CalculadoraOperacion.PRODUCTO;
                break;
            case "/":
                calc.operacion = CalculadoraOperacion.DIVISION;
                break;
        }
        calc.operandoAnterior = Double.parseDouble(calc.display.getText());
        calc.borrarResultado = true;
    }
}

class NumeroActionListener implements ActionListener {
    Calculadora calc;

    public NumeroActionListener(Calculadora calc) {
        this.calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (calc.display.getText().equals("0") || calc.borrarResultado) {
            if (btn.getText().equals(".")) {
                calc.display.setText("0.");
            } else {
                calc.display.setText(btn.getText());
            }
        } else {
            if (!btn.getText().equals(".") || !calc.display.getText().contains("."))
                calc.display.setText(calc.display.getText() + btn.getText());
        }

        calc.borrarResultado = false;
    }
}
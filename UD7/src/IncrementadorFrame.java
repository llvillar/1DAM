import javax.swing.*;
import java.awt.*;

public class IncrementadorFrame extends JFrame{

    public IncrementadorFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setTitle("Incrementando y decrementando");
        this.setLayout(new GridLayout(1,3));

        JButton resultado = new JButton("0");
        JButton menosUno = new JButton("-1");
        JButton masUno = new JButton("+1");

        resultado.addActionListener(new ResultadoActionListener());
        menosUno.addActionListener(new MenosUnoActionListener(resultado));
        masUno.addActionListener(new MasUnoActionListener(resultado));

        this.add(menosUno);
        this.add(resultado);
        this.add(masUno);
        this.setVisible(true);

    }
}

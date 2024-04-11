import javax.swing.*;

public class Ut8_02_23 {
    public static void main(String[] args) {
        System.setProperty("apple.laf.useScreenMenuBar", "true");

        JFrame ventana = new JFrame("UT11_B02_23");

        JMenuBar menuBar = new JMenuBar();
        JMenu menuLunes = new JMenu("Lunes");
        JMenu menuMartes = new JMenu("Martes");
        JMenu menuMiercoles = new JMenu("Miércoles");
        JMenu menuJueves = new JMenu("Jueves");
        JMenu menuViernes = new JMenu("Viernes");

        menuBar.add(menuLunes);
        menuBar.add(menuMartes);
        menuBar.add(menuMiercoles);
        menuBar.add(menuJueves);
        menuBar.add(menuViernes);

        ventana.setJMenuBar(menuBar);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

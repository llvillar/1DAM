import javax.swing.*;

public class Ut8_02_27 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_27 - 1ºDAW");

        JMenuBar menuBar = new JMenuBar();
        JMenu menuLunes = new JMenu("Lunes");
        menuLunes.add(new JMenuItem("BADAT"));
        menuLunes.add(new JMenuItem("BADAT"));
        menuLunes.add(new JMenuItem("SIINF"));
        menuLunes.addSeparator();
        menuLunes.add(new JMenuItem("SIINF"));
        menuLunes.add(new JMenuItem("PROGR"));
        menuLunes.add(new JMenuItem("PROGR"));

        JMenu menuMartes = new JMenu("Martes");
        menuMartes.add(new JMenuItem("SIINF"));
        menuMartes.add(new JMenuItem("SIINF"));
        menuMartes.add(new JMenuItem("LMSGI"));
        menuMartes.addSeparator();
        menuMartes.add(new JMenuItem("LMSGI"));
        menuMartes.add(new JMenuItem("FOL"));
        menuMartes.add(new JMenuItem("FOL"));

        JMenu menuMiercoles = new JMenu("Miércoles");
        menuMiercoles.add(new JMenuItem("LMSGI"));
        menuMiercoles.add(new JMenuItem("LMSGI"));
        JMenu menuEndes = new JMenu("ENDES");
        menuEndes.add(new JMenuItem("Alto"));
        menuEndes.add(new JMenuItem("Bajo"));
        menuMiercoles.add(menuEndes);
        menuMiercoles.addSeparator();
        menuEndes = new JMenu("ENDES");
        menuEndes.add(new JMenuItem("Alto"));
        menuEndes.add(new JMenuItem("Bajo"));
        menuMiercoles.add(menuEndes);
        menuMiercoles.add(new JMenuItem("PROGR"));
        menuMiercoles.add(new JMenuItem("PROGR"));

        JMenu menuJueves = new JMenu("Jueves");
        menuJueves.add(new JMenuItem("FOL"));
        menuJueves.add(new JMenuItem("BADAT"));
        menuJueves.add(new JMenuItem("BADAT"));
        menuJueves.addSeparator();
        menuEndes = new JMenu("ENDES");
        menuEndes.add(new JMenuItem("Alto"));
        menuEndes.add(new JMenuItem("Bajo"));
        menuJueves.add(menuEndes);
        menuJueves.add(new JMenuItem("PROGR"));
        menuJueves.add(new JMenuItem("PROGR"));

        JMenu menuViernes = new JMenu("Viernes");
        menuViernes.add(new JMenuItem("SIINF"));
        menuViernes.add(new JMenuItem("SIINF"));
        menuViernes.add(new JMenuItem("BADAT"));
        menuViernes.addSeparator();
        menuViernes.add(new JMenuItem("BADAT"));
        menuViernes.add(new JMenuItem("PROGR"));
        menuViernes.add(new JMenuItem("PROGR"));

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

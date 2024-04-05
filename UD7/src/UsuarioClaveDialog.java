import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioClaveDialog extends JDialog {

    public UsuarioClaveDialog(Frame ower, boolean modal){
        super(ower, modal);

        JDialog dialog = this;

        this.setLayout(new GridLayout(3,1));
        this.setSize(300,300);
        this.setResizable(false);

        JPanel pnlSuperior = new JPanel();
        JPanel pnlCentral = new JPanel();
        JPanel pnlInferior = new JPanel();


        JTextField txtUsuario = new JTextField(20);
        JPasswordField txtClave = new JPasswordField(20);
        JButton btnIngresar = new JButton("Ingresar");
        this.rootPane.setDefaultButton(btnIngresar);
        btnIngresar.setEnabled(false);
        JButton btnCancelar = new JButton("Cancelar");

        pnlSuperior.add(new JLabel("Usuario:"));
        pnlSuperior.add(txtUsuario);
        pnlCentral.add(new JLabel("Contraseña:"));
        pnlCentral.add(txtClave);
        pnlInferior.add(btnIngresar);
        pnlInferior.add(btnCancelar);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(String.valueOf(txtClave.getPassword()).equals("oretania")
                && txtUsuario.getText().equalsIgnoreCase("oretania")){
                    JOptionPane.showMessageDialog(dialog, "¡Bienvenido!", "Acceso permitido", JOptionPane.INFORMATION_MESSAGE);
                    dialog.dispose();
                } else {
                    JOptionPane.showMessageDialog(dialog, "Usuario/contraseña incorrectos", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        this.add(pnlSuperior);
        this.add(pnlCentral);
        this.add(pnlInferior);

        this.setVisible(true);
    }
}

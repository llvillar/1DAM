import javax.swing.*;
import java.awt.*;

public class EmojiComboBoxRenderer extends JLabel implements ListCellRenderer<String> {

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        ImageIcon icon = new ImageIcon("emoji" + index + ".png");
        if (icon.getImage() != null) {
            setIcon(new ImageIcon(icon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
            setText(value);
        } else {
            setText(value);
        }

        return this;
    }
}

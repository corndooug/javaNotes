import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class resibo {
    public static void main(String[] args) {
    JTextArea area = new JTextArea(1,2);
    DecimalFormat format = new DecimalFormat("0.00");

    area.setText("Available Items in gadgetMeal"+
        "\n [1] JBL T101 in-ear headphones"+
        "\n [2] Logitech M200 silent mouse"+
        "\n [3] Anker 10-port USB hub"+
        "\n [4] Ugreen Type-C 5V charger");
        JOptionPane.showInputDialog(null, area);
    }
}



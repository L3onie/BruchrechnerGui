package bruchrechner;
import javax.swing.*;

public class bruchrechner {
    private JButton divBtn;
    private JButton multiBtn;
    private JButton subBtn;
    private JButton addBtn;
    private JPanel panel1;
    private JTextField numerator1;
    private JTextField denominator1;
    private JTextField numerator2;
    private JTextField denominator2;
    private JTextField resultNumerator;
    private JTextField resultDenominator;
    private JLabel equalsLabel;
    private JLabel operatorLabel;
    private JButton equalsBtn;
    private JLabel GuiName;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bruchrechner");
        frame.setContentPane(new bruchrechner().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 250);
        frame.setResizable(false);
    }
}

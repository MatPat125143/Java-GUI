import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Konwerter extends JFrame{
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JPanel JPanel3;
    private JPanel JPanel4;
    private JButton resetButton;
    private JButton wyjścieButton;
    private JTextField textField1;
    private JPanel JPanel21;
    private JPanel JPanel22;
    private JLabel JLabel1;
    private JLabel JLabel2;
    private JButton cButton;
    private JButton fButton;
    private JButton wróćButton;
    double temp, wynik;

    public static void main(String[] args) {
        Konwerter konwerter = new Konwerter();
        konwerter.setVisible(true);
    }

    public Konwerter() {
        super("Zadanie 2");
        ImageIcon img = new ImageIcon("src/UR.png");
        this.setIconImage(img.getImage());
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, heigth = 300;
        this.setSize(width,heigth);

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = Double.parseDouble(textField1.getText());
                wynik = ((temp * 9)/5) + 32;
                JLabel2.setText("Temperatura w Fahrenheitach to: "+wynik);
            }
        });


        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp = Double.parseDouble(textField1.getText());
                    wynik = ((temp - 32) * 5)/9;
                    JLabel2.setText("Temperatura w Celciuszach to: "+wynik);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel2.setText("");
                textField1.setText("");
            }
        });


        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        wróćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

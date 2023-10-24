import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame{
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel JLabel1;
    private JLabel JLabel2;
    private JPanel JPanel3;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JButton iloczynButton;
    private JButton ilorazButton;
    private JPanel JPanel4;
    private JButton resetButton;
    private JButton wyjścieButton;
    private JPanel JPanel5;
    private JLabel JLabel3;
    private JButton wróćButton;

    double valueA, valueB, valueC;

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
    }

    public Kalkulator() {
        super("Zadanie 1");
        ImageIcon img = new ImageIcon("src/UR.png");
        this.setIconImage(img.getImage());
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, heigth = 300;
        this.setSize(width,heigth);

        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                valueC = valueA + valueB;
                JLabel3.setText("wynik: "+valueA+" + "+valueB+" = "+valueC);
            }
        });

        różnicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                valueC = valueA - valueB;
                JLabel3.setText("wynik: "+valueA+" - "+valueB+" = "+valueC);
            }
        });

        iloczynButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                valueC = valueA * valueB;
                JLabel3.setText("wynik: "+valueA+" * "+valueB+" = "+valueC);
            }
        });

        ilorazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                if(valueB != 0) {
                    valueC = valueA / valueB;
                    JLabel3.setText("wynik: " + valueA + " / " + valueB + " = " + valueC);
                }
                else {
                    JLabel3.setText("Nie dzieli się przez zero!");
                }
            }
        });

        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel3.setText("");
                textField1.setText("");
                textField2.setText("");
            }
        });


        wróćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}

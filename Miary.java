import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Miary extends JFrame{
    private JButton mmButton;
    private JButton cmButton;
    private JButton dmButton;
    private JButton mButton;
    private JButton kmButton;
    private JPanel JPanelMain;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private javax.swing.JPanel JPanel3;
    private JButton wróćButton;
    private JButton wyjścieButton;
    private JTextField textField1;
    private JComboBox comboBox1;
    private javax.swing.JLabel JLabel;
    private JPanel JPanel11;
    private JPanel JPanel12;
    private JLabel JLabelWynik;
    private JPanel JPanelWynik;

    public static void main(String[] args) {
        Miary miary = new Miary();
        miary.setVisible(true);
    }

    public Miary() {
        super("Zadanie 3");
        ImageIcon img = new ImageIcon("src/UR.png");
        this.setIconImage(img.getImage());
        this.setContentPane(JPanelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 450, heigth = 400;
        this.setSize(width, heigth);

        JPanel1.setSize(400, 100);
        JPanel11.setSize(400,30);
        JPanel12.setSize(400,70);
        JPanelWynik.setSize(400,150);
        JPanel2.setSize(400, 100);
        JPanel3.setSize(400, 50);


        mmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(textField1.getText());
                    String selectedUnit = comboBox1.getSelectedItem().toString();
                    double result;

                    if (selectedUnit.equals("mm")) {
                        result = inputValue;
                        JLabelWynik.setText("Wynik: " + result + " mm");
                    } else if (selectedUnit.equals("cm")) {
                        result = inputValue * 10;
                        JLabelWynik.setText("Wynik: " + result + " mm");
                    } else if (selectedUnit.equals("dm")) {
                        result = inputValue * 100;
                        JLabelWynik.setText("Wynik: " + result + " mm");
                    } else if (selectedUnit.equals("m")) {
                        result = inputValue * 1000;
                        JLabelWynik.setText("Wynik: " + result + " mm");
                    } else if (selectedUnit.equals("km")) {
                        result = inputValue * 1000000;
                        JLabelWynik.setText("Wynik: " + result + " mm");
                    } return;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nieprawidłowa wartość!");
                }
            }
        });

        cmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(textField1.getText());
                    String selectedUnit = comboBox1.getSelectedItem().toString();
                    double result;

                    if (selectedUnit.equals("mm")) {
                        result = inputValue / 10;
                        JLabelWynik.setText("Wynik: " + result + " cm");
                    } else if (selectedUnit.equals("cm")) {
                        result = inputValue;
                        JLabelWynik.setText("Wynik: " + result + " cm");
                    } else if (selectedUnit.equals("dm")) {
                        result = inputValue * 10;
                        JLabelWynik.setText("Wynik: " + result + " cm");
                    } else if (selectedUnit.equals("m")) {
                        result = inputValue * 100;
                        JLabelWynik.setText("Wynik: " + result + " cm");
                    } else if (selectedUnit.equals("km")) {
                        result = inputValue * 100000;
                        JLabelWynik.setText("Wynik: " + result + " cm");
                    } return;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nieprawidłowa wartość!");
                }
            }
        });

        dmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(textField1.getText());
                    String selectedUnit = comboBox1.getSelectedItem().toString();
                    double result;

                    if (selectedUnit.equals("mm")) {
                        result = inputValue / 100;
                        JLabelWynik.setText("Wynik: " + result + " dm");
                    } else if (selectedUnit.equals("cm")) {
                        result = inputValue / 10;
                        JLabelWynik.setText("Wynik: " + result + " dm");
                    } else if (selectedUnit.equals("dm")) {
                        result = inputValue;
                        JLabelWynik.setText("Wynik: " + result + " dm");
                    } else if (selectedUnit.equals("m")) {
                        result = inputValue * 10;
                        JLabelWynik.setText("Wynik: " + result + " dm");
                    } else if (selectedUnit.equals("km")) {
                        result = inputValue * 10000;
                        JLabelWynik.setText("Wynik: " + result + " dm");
                    } return;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nieprawidłowa wartość!");
                }
            }
        });

        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(textField1.getText());
                    String selectedUnit = comboBox1.getSelectedItem().toString();
                    double result;

                    if (selectedUnit.equals("mm")) {
                        result = inputValue / 1000;
                        JLabelWynik.setText("Wynik: " + result + " m");
                    } else if (selectedUnit.equals("cm")) {
                        result = inputValue / 100;
                        JLabelWynik.setText("Wynik: " + result + " m");
                    } else if (selectedUnit.equals("dm")) {
                        result = inputValue / 10;
                        JLabelWynik.setText("Wynik: " + result + " m");
                    } else if (selectedUnit.equals("m")) {
                        result = inputValue;
                        JLabelWynik.setText("Wynik: " + result + " m");
                    } else if (selectedUnit.equals("km")) {
                        result = inputValue * 1000;
                        JLabelWynik.setText("Wynik: " + result + " m");
                    } return;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nieprawidłowa wartość!");
                }
            }
        });

        kmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputValue = Double.parseDouble(textField1.getText());
                    String selectedUnit = comboBox1.getSelectedItem().toString();
                    double result;

                    if (selectedUnit.equals("mm")) {
                        result = inputValue / 1000000;
                        JLabelWynik.setText("Wynik: " + result + " km");
                    } else if (selectedUnit.equals("cm")) {
                        result = inputValue / 100000;
                        JLabelWynik.setText("Wynik: " + result + " km");
                    } else if (selectedUnit.equals("dm")) {
                        result = inputValue / 10000;
                        JLabelWynik.setText("Wynik: " + result + " km");
                    } else if (selectedUnit.equals("m")) {
                        result = inputValue / 1000;
                        JLabelWynik.setText("Wynik: " + result + " km");
                    } else if (selectedUnit.equals("km")) {
                        result = inputValue;
                        JLabelWynik.setText("Wynik: " + result + " km");
                    } return;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Nieprawidłowa wartość!");
                }
            }
        });

        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}

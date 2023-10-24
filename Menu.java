import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private javax.swing.JLabel JLabel;
    private JPanel JPanel2;
    private JPanel JPanel3;
    private JPanel JPanel1;

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.setVisible(true);
    }

    public Menu() {
        super("Menu zadań");
        ImageIcon img = new ImageIcon("src/UR.png");
        this.setIconImage(img.getImage());
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 180;
        this.setSize(width,height);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}


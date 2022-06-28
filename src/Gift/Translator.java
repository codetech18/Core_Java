package Gift;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Translator extends JFrame {

    JFrame frame;
    JPanel panel;
    JLabel label,label2,label3;
    JButton btn1,btn2;
    public Translator(){
        frame = new JFrame("Translator");
        panel = new JPanel();

        Locale eng = new Locale("en","EN");
        Locale spn = new Locale("es","ES");
        Locale itl = new Locale("it","IT");

        PropertyResourceBundle rb1 = (PropertyResourceBundle) ResourceBundle.getBundle("Messages", eng);
        PropertyResourceBundle rb2 = (PropertyResourceBundle) ResourceBundle.getBundle("Messages", spn);
        PropertyResourceBundle rb3 = (PropertyResourceBundle) ResourceBundle.getBundle("Messages", itl);

        label = new JLabel(rb1.getString("first"));
        label2 = new JLabel(rb1.getString("second"));
        label3 = new JLabel(rb1.getString("third"));

        btn1 = new JButton("Translate to Italian");
        btn2 = new JButton("Translate to Spanish");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(rb3.getString("first"));
                label2.setText(rb3.getString("second"));
                label3.setText(rb3.getString("third"));
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(rb2.getString("first"));
                label2.setText(rb2.getString("second"));
                label3.setText(rb2.getString("third"));
            }
        });

        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(btn1);
        panel.add(btn2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
    }

    public static void main(String[] args) {
        Translator obj = new Translator();
    }
}

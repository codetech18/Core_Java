package InnerClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClass {
    JFrame frame;
    JButton start;

    AnonymousInnerClass(){
        frame = new JFrame("Startup Screen");
        start = new JButton("Start");

        //setting the properties of the frame
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);

        frame.add(start); // adding the btn to the frame

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

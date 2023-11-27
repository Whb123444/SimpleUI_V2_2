package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleUI{
    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration
    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);	// Create a new JFrame
        frame.setSize(500,300);

        JPanel panel3 = new JPanel();
        GridLayout gl = new GridLayout(1,2);
        GridLayout gl2 = new GridLayout(2,1);
        panel3.setLayout(gl2);
        frame.setLayout(gl);
        ButtonPanel bp = new ButtonPanel();
        Sliders slider = new Sliders(0,256,16,8,true);
        panel3.add(bp.get_jpanel());
        panel3.add(slider);

//        Drawing draw = new Drawing();


        frame.add(panel3);
        frame.add(bp.get_jpanel2());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

}

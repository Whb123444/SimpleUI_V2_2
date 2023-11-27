package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ButtonPanel extends JPanel {
    private static String shape = "";
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();

    private JButton drawRectBtn = new JButton("绘制矩形");
    private JButton drawOvalBtn = new JButton("绘制椭圆");
    private JButton draw3 = new JButton("绘制3");
    private GridLayout gl = new GridLayout(2,2);

    public ButtonPanel(){
        Drawing draw = new Drawing();
//        GridLayout gl = new GridLayout(2,2);
        setLayout(gl);
//        JButton but1=new JButton("Press me");
//        JButton but2=new JButton("Press me 2");
//        JButton but3=new JButton("Press me 3");
        ActionListener but1AL = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 pressed");
                shape = "rect";
                draw.repaint();
            }
        };
        ActionListener but2AL = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 pressed");
                shape = "oval";
                draw.repaint();
            }
        };
        ActionListener but3AL = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 pressed");
            }
        };

        draw.setPreferredSize(new Dimension(250,300));
        drawRectBtn.addActionListener(but1AL);
        drawOvalBtn.addActionListener(but2AL);
        draw3.addActionListener(but3AL);
        panel.add(drawRectBtn);
        panel.add(drawOvalBtn);
        panel.add(draw3);




        //设置画布的大小

        //把画布添加到frame中

        panel2.add(draw);
        panel2.setVisible(true);


    }
    public static String get_shape(){
        return shape;
    }
    public JPanel get_jpanel(){
        return panel;
    }

    public JPanel get_jpanel2(){
        return panel2;
    }

}

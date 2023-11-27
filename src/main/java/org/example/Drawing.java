package org.example;

import java.awt.*;
import java.util.Random;

public class Drawing extends Canvas {
    public Drawing() {

    }
    private final String RECT_SHAPE="rect";
    private final String OVAL_SHAPE="oval";
    private static String shape;

    public void paint(Graphics g) {

        shape = ButtonPanel.get_shape();
        Random r = new Random();
        if (shape.equals(RECT_SHAPE)) {
            //绘制矩形
            g.setColor(Color.BLACK);
            g.drawRect(20,20,10,10);
        }
        if (shape.equals(OVAL_SHAPE)) {
            //绘制椭圆
            g.setColor(Color.RED);
            g.drawOval(r.nextInt(200), r.nextInt(100), 60, 40);
        }
    }

}



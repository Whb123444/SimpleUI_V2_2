package org.example;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Sliders extends JSlider{
    private int[] sliderValue = new int [3];

    public Sliders(int left, int right, int majorTickSpacing, int minorTickSpacing, boolean isVisible){
        String RGB = "RGB";
        GridLayout gl = new GridLayout(3,1);
        setLayout(gl);
        JSlider jslider[] = new JSlider[3];
        for(int i = 0; i <= 2; i++){
            jslider[i] = new JSlider(left, right);
            jslider[i].setMajorTickSpacing(majorTickSpacing);
            jslider[i].setMinorTickSpacing(minorTickSpacing);
            jslider[i].setPaintLabels(false);
            jslider[i].setPaintTicks(isVisible);
            jslider[i].setVisible(isVisible);
            add(jslider[i]);


        }
        for(int i = 0; i <= 2; i++){
            int I = i;
            jslider[i].addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    sliderValue[I] = jslider[I].getValue();
                    System.out.println("The Value of "+RGB.charAt(I)+" is: "+sliderValue[I]);
                }});
        }





    };
    public int[] get_slider_value(){
        return sliderValue;
    }

}

package main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Semi-cicle object
 * <P>
 * Creates half of a circle with the outer part facing east, is used when drawing the topology of a network
 *
 * @author Alex Cherny
 */
public class shapeSemiCircleEast extends JPanel {

    public shapeSemiCircleEast(){
        setPreferredSize(new Dimension(36, 36));
        setLocation(0,0);
    }

    public void paintComponent(Graphics l){
        super.paintComponent(l);

        l.setColor(Color.BLACK);
        l.drawOval(-18, 15, 35, 20);
    }
}

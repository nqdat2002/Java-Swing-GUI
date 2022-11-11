/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_gui_graphicoval;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class PanelTest extends JPanel implements ActionListener{
    
    JButton jb1 = new JButton("Left");
    JButton jb2 = new JButton("Right");
    JButton jb3 = new JButton("BLUE");
    Color c=Color.RED;
    int d=0;
    PanelTest(){
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(200, 200, 50, 100);
        setForeground(c);
        g.fillOval(130+d, 130, 50, 60);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1) {
            d=d-5;
            repaint();
        }
        if(e.getSource()==jb2){
            d=d+5;
            repaint();
        }
        if(e.getSource()==jb3){
            c=Color.BLUE;
            repaint();
        }
    }
    
}

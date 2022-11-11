/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_gui_graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ASUS
 */
public class canvasTest extends JPanel implements ItemListener, ActionListener{
    JLabel jlb1 = new JLabel("Bạn đã chọn: ");
    ButtonGroup btg = new ButtonGroup();
    JRadioButton jrb1 = new JRadioButton("Red");
    JRadioButton jrb2 = new JRadioButton("Green");
    JRadioButton jrb3 = new JRadioButton("Blue");
    JCheckBox jcb1 = new JCheckBox("Apple");
    JCheckBox jcb2 = new JCheckBox("Orange");
    JButton jb1 = new JButton("Left");
    JButton jb2 = new JButton("Right");
    
    int d=0;
    
    canvasTest(){
        btg.add(jrb1);btg.add(jrb2);btg.add(jrb3);
        this.add(jrb1);this.add(jrb2);this.add(jrb3);
        jrb1.addItemListener(this);jrb2.addItemListener(this);jrb3.addItemListener(this);
        
        this.add(jcb1);this.add(jcb2);
        jcb1.addItemListener(this);jcb2.addItemListener(this);
        this.add(jlb1); 
        this.add(jb1);
        jb1.addActionListener(this);
        this.add(jb2);
        jb2.addActionListener(this);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello", 40, 40);
        setBackground(Color.WHITE);
        g.fillRect(130, 30, 100, 80);
        g.drawOval(30, 130, 50, 60);
        
        setForeground(Color.RED);
        g.fillOval(130+d, 130, 50, 60);
        g.drawArc(30, 200, 40, 50, 90, 60);
        g.fillArc(30, 130, 40, 50, 180, 40);
 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getItem()==jrb1) jlb1.setText(" Bạn đã chọn: " + "RED");
       if(e.getItem()==jrb2) jlb1.setText(" Bạn đã chọn: " + "BLUE");
       if(e.getItem()==jrb3) jlb1.setText(" Bạn đã chọn: " + "GREEN");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)
        {
            d=d-5;
            repaint();
        }
        if(e.getSource()==jb2)
        {
            d=d+5;
            repaint();
        }
    }

    
}

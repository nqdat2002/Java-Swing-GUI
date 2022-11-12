/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame_Demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class JFramWithGraphicExam3 extends JFrame implements ActionListener {

    JButton jb1 = new JButton("Left");
    JButton jb2 = new JButton("Right");
    private int d = 0;
    
    JFramWithGraphicExam3() {
        this.add(jb1);
        this.add(jb2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.drawOval(200, 200, 50, 100);
        setForeground(Color.BLACK);
        g.fillOval(130 + d, 130, 50, 60);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == jb1){
            d -= 5;
            repaint();
        }
        if(e.getSource() == jb2){
            d += 5;
            repaint();
        }
    }
   
}

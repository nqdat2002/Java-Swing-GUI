/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_gui_graphicoval;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Frame extends JFrame{
    PanelTest pt = new PanelTest();
    Frame(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pt);
        
    }
}

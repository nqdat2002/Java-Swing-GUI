/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame_Demo;

import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Frame extends JFrame{
    JFramWithGraphicExam3 test = new JFramWithGraphicExam3();
    
    Frame(){
        this.setVisible(true);
        this.setSize(300, 300);
        this.add(test);
    }
}

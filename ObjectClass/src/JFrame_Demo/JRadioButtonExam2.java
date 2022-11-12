/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame_Demo;
/**
 *
 * @author admin
 */

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonExam2 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
 
    public JRadioButtonExam2() {
        prepareGUI();
    }
 
    public static void main(String[] args) {
        new JRadioButtonExam2().showRadioButtonDemo();
    }
 
    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JRadioButton trong Java Swing");
        mainFrame.setSize(400, 250);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
 
    private void showRadioButtonDemo() {
        headerLabel.setText("Control in action: RadioButton");
        final JRadioButton radApple = new JRadioButton("Green", true);
        final JRadioButton radMango = new JRadioButton("Red");
        final JRadioButton radPeer = new JRadioButton("Yellow");
        radApple.setMnemonic(KeyEvent.VK_C);
        radMango.setMnemonic(KeyEvent.VK_M);
        radPeer.setMnemonic(KeyEvent.VK_P);
        radApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Green RadioButton: "
                        + (e.getStateChange() == 1 ? "Ban da chon Green Button" : "Ban chua chon!"));
            }
        });
        radMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Red RadioButton: "
                        + (e.getStateChange() == 1 ? "Ban da chon Red Button" : "Ban chua chon!"));
            }
        });
        radPeer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Yellow RadioButton: "
                        + (e.getStateChange() == 1 ? "Ban da chon Yellow Button" : "Ban chua chon!"));
            }
        }); // Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(radApple);
        group.add(radMango);
        group.add(radPeer);
        controlPanel.add(radApple);
        controlPanel.add(radMango);
        controlPanel.add(radPeer);
        mainFrame.setVisible(true);
    }
}

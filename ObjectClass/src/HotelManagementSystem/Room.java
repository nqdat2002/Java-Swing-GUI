package HotelManagementSystem;


import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;


public class Room extends JFrame implements ActionListener {

	
	JTable t1;
	JButton b1,b2;
	
	Room(){
		
		setBounds(270,100,1000,650);
				
		
		
		
		
		JLabel l1 = new JLabel("Room Number");
		l1.setBounds(14,10,100,30);
		add(l1);		
		
		JLabel l2 = new JLabel("Availability");
		l2.setBounds(130,10,100,30);
		add(l2);		
		
		JLabel l3 = new JLabel("Status");
		l3.setBounds(246,10,100,30);
		add(l3);		
		
		JLabel l4 = new JLabel("Price");
		l4.setBounds(370,10,100,30);
		add(l4);		
		
		JLabel l5 = new JLabel("Bed Type");
		l5.setBounds(465,10,100,30);
		add(l5);		
		
		
		
		
		t1 = new JTable();
		t1.setBounds(0,40,550,500);
		add(t1);
		
		b1 = new JButton("Load Data");
		b1.addActionListener(this);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setBounds(130,560,120,30);
		add(b1);
		
		b2 = new JButton("Back");
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(300,560,120,30);
		add(b2);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/bedroom.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel icon = new JLabel(i3);
		icon.setBounds(0,0,1000,650);
		add(icon);
		
		
		//getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			
			try {
				
				conn c = new conn();				
				String str = "select * from room";				
				ResultSet rs = c.s.executeQuery(str); 
				
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				
				
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
			
		}else if(ae.getSource()==b2) {
			new Reception().setVisible(true);
			this.setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		
		new Room();
		
	}

}

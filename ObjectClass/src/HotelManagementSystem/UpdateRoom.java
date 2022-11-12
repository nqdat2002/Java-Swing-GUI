package HotelManagementSystem;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class UpdateRoom extends JFrame implements ActionListener {

	
	Choice c1;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	
	UpdateRoom(){
		
		JLabel l1 = new JLabel("Update Room Status");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.BLUE);
		l1.setBounds(20,30,200,30);
		add(l1);
		
		JLabel l2 = new JLabel("Guest ID");		
		l2.setBounds(30,80,100,30);
		add(l2);
		
		c1 = new Choice();
		try {
			conn c = new conn();
			ResultSet rs = c.s.executeQuery("select * from customer"); 
			while(rs.next()) {
				c1.add(rs.getString("number"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		c1.setBounds(200,80,200,35);
		add(c1);
		
		JLabel l3 = new JLabel("Room Number");		
		l3.setBounds(30,120,100,30);
		add(l3);
		
		t1 = new JTextField();
		t1.setBounds(200,120,200,30);
		add(t1);
		
		JLabel l4 = new JLabel("Availability");		
		l4.setBounds(30,160,100,30);
		add(l4);
		
		t2 = new JTextField();
		t2.setBounds(200,160,200,30);
		add(t2);
		
		
		JLabel l5 = new JLabel("Check Status");		
		l5.setBounds(30,200,100,30);
		add(l5);
		
		t3 = new JTextField();
		t3.setBounds(200,200,200,30);
		add(t3);
		
		
		b1 = new JButton("Check");
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		b1.setBounds(100,260,150,30);
		b1.addActionListener(this);
		add(b1);
		
		
		b2 = new JButton("Update");
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setBounds(100,300,150,30);
		b2.addActionListener(this);
		add(b2);
		
		
		b3 = new JButton("Cancel");
		b3.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setBounds(100,340,150,30);
		b3.addActionListener(this);
		add(b3);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/cleanroom.jpg"));
		Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel li = new JLabel(i3);
		li.setBounds(0,0,700,500);
		add(li);
		
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(400,200,700,500);
		setVisible(true);
		
		
	}
	
	
	public void actionPerformed (ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			String s1 = c1.getSelectedItem();
			String s2 = null;
			
			try {
				
				conn c = new conn();
				ResultSet rs = c.s.executeQuery("select * from customer where number = '"+s1+"'");				
				while(rs.next()) {
					t1.setText(rs.getString("room"));
					s2 = rs.getString("room");					
				}
				
				ResultSet rs2 = c.s.executeQuery("select * from room where room_number = '"+s2+"'");
				while(rs2.next()) {
					t2.setText(rs2.getString("availability"));
					t3.setText(rs2.getString("status"));
				}
				
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}else if(ae.getSource()==b2) {
			
			
			try {
				
				conn c = new conn();
				String room = t1.getText();
				String available = t2.getText();
				String status = t3.getText();
				
				String str = "update room set availability = '"+available+"',status = '"+status+"' where room_number = '"+room+"'";
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "Room Updated Successfully");
				new Reception().setVisible(true);
				this.setVisible(false);
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}else if(ae.getSource()==b3) {
			
			new Reception().setVisible(true);
			this.setVisible(false);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new UpdateRoom();

	}

}

package HotelManagementSystem;


import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;


public class Reception extends JFrame implements ActionListener{
	
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	
	Reception(){
		setBounds(340,120,800,675);		
		
		
		b1 = new JButton("New Customer Form");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBounds(10,30,200,30);
		add(b1);
		
		
		b2 = new JButton("Room");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBounds(10,80,200,30);
		add(b2);
		
		b3 = new JButton("Department");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		b3.setBounds(10,130,200,30);		
		add(b3);
		
		
		
		b4 = new JButton("All Employees Info");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(10,180,200,30);
		b4.addActionListener(this);
		add(b4);
		
		
		
		b5 = new JButton("Customer info");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.addActionListener(this);
		b5.setBounds(10,230,200,30);
		add(b5);
		
		
		
		b6 = new JButton("Manager Info");
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		b6.addActionListener(this);
		b6.setBounds(10,280,200,30);
		add(b6);
		
		
		
		b7 = new JButton("Check Out");
		b7.setBackground(Color.black);
		b7.setForeground(Color.white);
		b7.addActionListener(this);
		b7.setBounds(10,330,200,30);
		add(b7);
		
		
		
		b8 = new JButton("Update Check Status");
		b8.setBackground(Color.black);
		b8.setForeground(Color.white);
		b8.addActionListener(this);
		b8.setBounds(10,380,200,30);
		add(b8);
		
		
		
		
		b9 = new JButton("Update Room Status");
		b9.setBackground(Color.black);
		b9.setForeground(Color.white);
		b9.addActionListener(this);
		b9.setBounds(10,430,200,30);
		add(b9);
		
		
		
		b10 = new JButton("Pick up Service");
		b10.setBackground(Color.black);
		b10.setForeground(Color.white);
		b10.addActionListener(this);
		b10.setBounds(10,480,200,30);
		add(b10);
		
		
		
		b11 = new JButton("Search Room");
		b11.setBackground(Color.black);
		b11.addActionListener(this);
		b11.setForeground(Color.white);
		b11.setBounds(10,530,200,30);
		add(b11);
		
		
		
		b12 = new JButton("Logout");
		b12.setBackground(Color.black);
		b12.setForeground(Color.white);
		b12.addActionListener(this);
		b12.setBounds(10,580,200,30);
		add(b12);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/reception1.jpg"));
//		Image i2 = i1.getImage().getScaledInstance(800, 675, Image.SCALE_DEFAULT);
//		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0,0,1254,836);
		add(l1);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1) {
			
			new AddCustomer().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b2) {
			
			new Room().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b3) {
			
			
			
		}else if(ae.getSource() == b4) {
			
			new EmployeeInfo().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b5) {
			
			new CustomerInfo().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b6) {
			
			new ManagerInfo().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b7) {
			
			new CheckOut().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b8) {
			
			new UpdateCheck().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b9) {
			
			new UpdateRoom().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b10) {
			
			new PickUp().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b11) {
			
			new SearchRoom().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b12) {
			this.setVisible(false);
		}
		
	}
	
	

	public static void main(String[] args) {
		
		new Reception();

	}

}

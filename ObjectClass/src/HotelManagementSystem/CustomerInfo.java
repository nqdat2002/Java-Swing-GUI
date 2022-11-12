package HotelManagementSystem;


import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;


public class CustomerInfo extends JFrame implements ActionListener {

	
	JTable t1;
	JButton b1,b2;
	
	CustomerInfo(){
		
		setBounds(270,100,1000,650);
		
		
		JLabel l1 = new JLabel("Id Type");
		l1.setBounds(30,10,70,30);
		add(l1);
		
		JLabel l2 = new JLabel("Id Number");
		l2.setBounds(150,10,70,30);
		add(l2);
		
		
		JLabel l3 = new JLabel("Name");
		l3.setBounds(290,10,70,30);
		add(l3);
		
		
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(410,10,70,30);
		add(l4);
		
		
		JLabel l5 = new JLabel("Country");
		l5.setBounds(530,10,70,30);
		add(l5);
		
		
		JLabel l6 = new JLabel("Room Number");
		l6.setBounds(650,10,100,30);
		add(l6);
		
		
		JLabel l7 = new JLabel("Check in Status");
		l7.setBounds(770,10,100,30);
		add(l7);
		
		
		JLabel l8 = new JLabel("Deposit");
		l8.setBounds(900,10,70,30);
		add(l8);
		
		
		t1 = new JTable();
		t1.setBounds(0,40,1000,500);
		add(t1);
		
		b1 = new JButton("Load Data");
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(350,560,120,30);
		add(b1);
		
		b2 = new JButton("Back");
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(530,560,120,30);
		add(b2);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			
			try {
				
				conn c = new conn();				
				String str = "select * from customer";				
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
		
		new CustomerInfo();
		
	}

}

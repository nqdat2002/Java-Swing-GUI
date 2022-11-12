package HotelManagementSystem;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.sql.*;


public class PickUp extends JFrame implements ActionListener{

	
	Choice c1;
	JButton b1,b2;
	JTable t1;	
	
	PickUp(){
		
		
		JLabel l1 = new JLabel("PickUp Service");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(290,25,200,30);
		add(l1);
		
		
		
		JLabel l2 = new JLabel("Type of Vehicle");		
		l2.setBounds(50,95,100,30);
		add(l2);
		
		c1 = new Choice();
		try {
			
			conn c = new conn();
			ResultSet rs = c.s.executeQuery("select * from driver");
			while(rs.next()) {
				c1.add(rs.getString("brand"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		c1.setBounds(150,100,200,20);
		add(c1);
		
		JLabel l3 = new JLabel("Name");		
		l3.setBounds(30,170,100,30);
		add(l3);
		
		JLabel l4 = new JLabel("Age");		
		l4.setBounds(140,170,100,30);
		add(l4);
		
		JLabel l5 = new JLabel("Gender");		
		l5.setBounds(230,170,100,30);
		add(l5);
		
		JLabel l6 = new JLabel("Brand");		
		l6.setBounds(330,170,100,30);
		add(l6);
		
		JLabel l7 = new JLabel("Model");		
		l7.setBounds(430,170,100,30);
		add(l7);
		
		JLabel l8 = new JLabel("Availability");
		l8.setBounds(510,170,100,30);
		add(l8);
		
		JLabel l9= new JLabel("Location");
		l9.setBounds(610,170,100,30);
		add(l9);
		
		
		
		t1 = new JTable();
		t1.setBounds(0,200,700,200);
		add(t1);
		
		
		b1 = new JButton("Submit");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(200,420,120,30);
		b1.addActionListener(this);
		add(b1);
		
		
		b2 = new JButton("Back");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(350,420,120,30);
		b2.addActionListener(this);
		add(b2);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(400,200,700,500);
		setVisible(true);		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			try {			
			
				conn c = new conn();
				String str = "select * from driver where brand = '"+c1.getSelectedItem()+"'";
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

		new PickUp();

	}

}

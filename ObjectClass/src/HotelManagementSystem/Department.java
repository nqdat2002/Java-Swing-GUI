package HotelManagementSystem;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.sql.*;


public class Department extends JFrame implements ActionListener{

	
	
	JButton b1,b2;
	JTable t1;	
	
	Department(){
		
		
		JLabel l1 = new JLabel("Department");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(290,25,200,30);
		add(l1);
		
		
		JLabel l3 = new JLabel("Department");		
		l3.setBounds(120,80,100,30);
		add(l3);
		
		JLabel l4 = new JLabel("Budget");		
		l4.setBounds(500,80,100,30);
		add(l4);		
		
		
		
		t1 = new JTable();
		t1.setBounds(0,110,700,200);
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
				String str = "select * from department";
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

		new Department();

	}

}

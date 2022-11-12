package HotelManagementSystem;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.sql.*;


public class SearchRoom extends JFrame implements ActionListener{

	
	JComboBox c1;
	JCheckBox c2;
	JButton b1,b2;
	JTable t1;	
	
	SearchRoom(){
		
		
		JLabel l1 = new JLabel("Search Rooms");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(290,25,200,30);
		add(l1);
		
		
		
		JLabel l2 = new JLabel("Room Bed Type");		
		l2.setBounds(50,100,100,30);
		add(l2);
		
		c1 = new JComboBox(new String[] {"Single","Double"});
		c1.setBounds(180,100,150,25);
		c1.setBackground(Color.white);
		add(c1);
		
		c2 = new JCheckBox("Only Display Available");
		c2.setBackground(Color.white);
		c2.setBounds(400,100,200,25);
		add(c2);
		
		
		JLabel l3 = new JLabel("Room Number");		
		l3.setBounds(30,170,100,30);
		add(l3);
		
		JLabel l4 = new JLabel("Availability");		
		l4.setBounds(170,170,100,30);
		add(l4);
		
		JLabel l5 = new JLabel("Status");		
		l5.setBounds(330,170,100,30);
		add(l5);
		
		JLabel l6 = new JLabel("Price");		
		l6.setBounds(460,170,100,30);
		add(l6);
		
		JLabel l7 = new JLabel("Bed Type");
		l7.setBounds(590,170,100,30);
		add(l7);
		
		
		
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
				
				String str = "select * from room where bed_type = '"+c1.getSelectedItem()+"'";
				String str2 = "select * from room where bed_type = '"+c1.getSelectedItem()+"' AND 	availability = 'Available'";
				
				conn c = new conn();
				
				
				if(c2.isSelected()) {
					ResultSet rs = c.s.executeQuery(str2);
					t1.setModel(DbUtils.resultSetToTableModel(rs));
				}else {
					
					ResultSet rs = c.s.executeQuery(str);
					t1.setModel(DbUtils.resultSetToTableModel(rs));				
					
				}
				
				
			}catch(Exception e) {
				System.out.println(e);				
			}
			
			
		}else if(ae.getSource()==b2) {
			
			new Reception().setVisible(true);
			this.setVisible(false);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {

		new SearchRoom();

	}

}

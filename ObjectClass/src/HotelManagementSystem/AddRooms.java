package HotelManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener{
	
	
	JTextField t1,t2;
	JComboBox c1,c2,c3;
	JButton b1,b2;
	
	AddRooms(){
		
		setBounds(400,200,750,500);
		
		
		JLabel l1 = new JLabel("Add Rooms");
		l1.setFont(new Font("Tohoma",Font.BOLD,21));
		l1.setBackground(Color.red);
		l1.setOpaque(true);
		l1.setBounds(480,15,120,30);
		add(l1);
		
		JLabel room = new JLabel("Room Number");
		room.setFont(new Font("Tohoma",Font.BOLD,14));
		room.setBounds(420,80,120,30);
		add(room);
		
		t1 = new JTextField();
		t1.setBounds(560,80,110,30);
		add(t1);
		
		
		JLabel available = new JLabel("Availability");
		available.setFont(new Font("Tohoma",Font.BOLD,14));
		available.setBounds(420,120,120,30);
		add(available);
		
		
		c1 = new JComboBox(new String[] {"Available","Occupied" });
		c1.setBackground(Color.WHITE);
		c1.setBounds(560,120,110,30);
		add(c1);
		
		
		
		
		JLabel status = new JLabel("Cleaning Status");
		status.setFont(new Font("Tohoma",Font.BOLD,14));
		status.setBounds(420,160,120,30);
		add(status);
		
		
		
		c2 = new JComboBox(new String[] {"Clean","Dirty" });
		c2.setBackground(Color.WHITE);
		c2.setBounds(560,160,110,30);
		add(c2);
		
		
		
		JLabel price = new JLabel("Price");
		price.setFont(new Font("Tohoma",Font.BOLD,14));
		price.setBounds(420,200,120,30);
		add(price);
		
		t2 = new JTextField();
		t2.setBounds(560,200,110,30);
		add(t2);
		
		
		JLabel bedtype = new JLabel("Bed Type");
		bedtype.setFont(new Font("Tohoma",Font.BOLD,14));
		bedtype.setBounds(420,240,120,30);
		add(bedtype);
		
		
		c3 = new JComboBox(new String[] {"Single","Double" });
		c3.setBackground(Color.WHITE);
		c3.setBounds(560,240,110,30);
		add(c3);
		
		
		
		b1  = new JButton("Add Rooms");
		b1.setBounds(423,300,100,30);
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		
		
		b2  = new JButton("Cancel");
		b2.setBounds(565,300,100,30);
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/room.jpg"));
		JLabel l2 = new JLabel(i1);
		l2.setBounds(0,0,750,500);
		add(l2);
		
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		
		
		if(ae.getSource()==b1) {
			
			String room = t1.getText();
			String available = (String)c1.getSelectedItem();
			String status =  (String)c2.getSelectedItem();
			String price = t2.getText();
			String type =  (String)c3.getSelectedItem();
			
			conn c = new conn();
			
			try {
				
				String str = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
				c.s.executeUpdate(str);
				
				JOptionPane.showMessageDialog(null,"New Room Added");
				this.setVisible(false);
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
		
	}
	

	public static void main(String[] args) {
		
		new AddRooms();
		
	}

}

package HotelManagementSystem;


import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;


public class CheckOut extends JFrame implements ActionListener{

	
	Choice c1;
	JTextField t1;
	JButton b1,b2,b3;	
	
	
	CheckOut(){
		
		
		JLabel l1 = new JLabel("Check Out");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(30,20,150,30);
		add(l1);
		
		
		JLabel l2 = new JLabel("Customer Id");
		l2.setBounds(30,70,100,30);
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
		c1.setBounds(200,70,120,30);
		add(c1);
		
		JLabel l3 = new JLabel("Room Number");
		l3.setBounds(30,120,100,30);
		add(l3);
		
		
		t1 = new JTextField();
		t1.setBounds(200,120,120,30);
		add(t1);
		
		
		
		b1 = new JButton("CheckOut");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBounds(30,200,120,30);
		add(b1);
		
		
		b2 = new JButton("Cancel");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBounds(200,200,120,30);
		add(b2);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/tick.png"));
		Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		b3 = new JButton(i3);
		b3.addActionListener(this);
		b3.setBounds(340,60,30,30);
		add(b3);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/checkout2.jpeg"));
		Image i5 = i4.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel lii = new JLabel(i6);
		lii.setBounds(380,30,400,200);
		add(lii);
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(400,200,800,300);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			String id = c1.getSelectedItem();
			String room = t1.getText();
			String str = "delete from customer where number = '"+id+"'";
			String str2 = "update room set availability = 'Available' where room_number = '"+room+"'";
			
			try {
				
				conn c = new conn();
				c.s.executeUpdate(str);
				c.s.executeUpdate(str2);
				JOptionPane.showMessageDialog(null, "Checkout successful");
				new Reception().setVisible(true);
				this.setVisible(false);
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}else if (ae.getSource()==b2) {
			
			new Reception().setVisible(true);;
			this.setVisible(false);
			
		}else if(ae.getSource()==b3) {
			
			String id = c1.getSelectedItem();
			try {
				
				conn c = new conn();
				ResultSet rs = c.s.executeQuery("select * from customer where number  = '"+id+"'");
				while(rs.next()) {
					t1.setText(rs.getString("room"));
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {

		new CheckOut();

	}

}

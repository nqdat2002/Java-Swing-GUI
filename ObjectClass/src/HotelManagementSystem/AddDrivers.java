package HotelManagementSystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class AddDrivers extends JFrame implements ActionListener{
	
	
	JTextField  t1,t2,t3,t4,t5;
	JRadioButton r1,r2;
	JComboBox c1;
	JButton b1,b2;
	
	
	AddDrivers(){
		setBounds(400,200,750,500);
		
		JLabel l1 = new JLabel("Add Drivers");		
		l1.setFont(new Font("Tohoma",Font.BOLD,21));
		//l1.setBackground(Color.red);
//		l1.setOpaque(true);
		l1.setBounds(110,15,120,30);
		add(l1);
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Tohoma",Font.PLAIN,14) );		
		name.setBounds(50,80,120,30);
		add(name);
		
		t1 = new JTextField();
		t1.setBounds(200,80,130,30);
		add(t1);
		
		
		JLabel age = new JLabel("Age");
		age.setFont(new Font("Tohoma",Font.PLAIN,14) );
		age.setBounds(50,120,120,30);
		add(age);
		
		t2 = new JTextField();
		t2.setBounds(200,120,130,30);
		add(t2);
		
		
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Tohoma",Font.PLAIN,14) );
		gender.setBounds(50,160,120,30);
		add(gender);
		
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tohoma",Font.PLAIN,13));
		r1.setBounds(200,160,60,30);
		r1.setBackground(Color.white);
		add(r1);
		
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tohoma",Font.PLAIN,13));
		r2.setBounds(260,160,70,30);
		r2.setBackground(Color.white);
		add(r2);
		
		
		
		JLabel car = new JLabel("Car Company");
		car.setFont(new Font("Tohoma",Font.PLAIN,14) );
		car.setBounds(50,200,120,30);
		add(car);
		
		t3 = new JTextField();
		t3.setBounds(200,200,130,30);
		add(t3);
		
		
		JLabel model = new JLabel("Car Model");
		model.setFont(new Font("Tohoma",Font.PLAIN,14) );
		model.setBounds(50,240,120,30);
		add(model);
		
		t4 = new JTextField();
		t4.setBounds(200,240,130,30);
		add(t4);
		
		
		JLabel availability = new JLabel("Availability");
		availability.setFont(new Font("Tohoma",Font.PLAIN,14) );
		availability.setBounds(50,280,120,30);
		add(availability);
		
		
		
		c1 = new JComboBox(new String[] {"Available","Busy"});
		c1.setBounds(200,280,130,30);
		c1.setBackground(Color.white);
		add(c1);
		
		
		JLabel location = new JLabel("Location");
		location.setFont(new Font("Tohoma",Font.PLAIN,14) );
		location.setBounds(50,320,120,30);
		add(location);
		
		
		t5 = new JTextField();
		t5.setBounds(200,320,130,30);
		add(t5);
		
		
		b1  = new JButton("Add Drivers");
		b1.setBounds(50,380,130,30);
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		
		
		b2  = new JButton("Cancel");
		b2.setBounds(200,380,130,30);
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/driver.jpg"));
		Image i2 = i1.getImage().getScaledInstance(500, 500 , Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l2 = new JLabel(i3);
		l2.setBounds(0,0,1000,500);
		add(l2);
		
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			
			
			String name = t1.getText();
			String age = t2.getText();
			String gender = null;
			String company = t3.getText();
			String brand = t4.getText();
			String available = (String)c1.getSelectedItem();
			
			if(r1.isSelected()) {
				gender="Male";
			}else if(r2.isSelected()){
				gender="Female";
			}
			
			String location = t5.getText();
			
			conn c = new conn();
			
			String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
			
			try {
				
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "Driver added successfully");	 
				this.setVisible(false);
				
				
			}catch(Exception e) {
				System.out.println(e);
				
			}
			
			
			
			
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		
		new AddDrivers();

	}

}

package HotelManagementSystem;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dashboard extends JFrame implements ActionListener{
	
	
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;	
	
	Dashboard(){
		setBounds(0,0,1920,1080);
		
		mb = new JMenuBar();
		add(mb);
		mb.setForeground(Color.cyan);
		
		m1 = new JMenu("HOTEL MANAGEMENT");
		mb.add(m1);
		m1.setForeground(Color.red);
		
		m2 = new JMenu("ADMIN");
		mb.add(m2);
		m2.setForeground(Color.blue);
		
		i1 = new JMenuItem("RECEPTION");
		m1.add(i1);
		i1.addActionListener(this);
			
		i2 = new JMenuItem("ADD EMPLOYEES");
		m2.add(i2);
		i2.addActionListener(this);
		
		i3 = new JMenuItem("ADD ROOMS");
		m2.add(i3);
		i3.addActionListener(this);
		
		i4 = new JMenuItem("ADD DRIVERS");
		m2.add(i4);
		i4.addActionListener(this);
		
		mb.setBounds(0,0,1920,40);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/reception.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1560, 1080, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(-200,0,1920,1080);
		add(l1);
		
		JLabel l2 = new JLabel("WELCOME");
		l2.setBounds(815,100,320,75);
		l2.setFont(new Font("Tahoma",Font.BOLD,60));
		l2.setBackground(Color.red);
		l2.setOpaque(true);
		l2.setForeground(Color.black);
		l1.add(l2);
		
		setLayout(null);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getActionCommand().equals("RECEPTION")) {
			new Reception().setVisible(true);
		}else if(ae.getActionCommand().equals("ADD EMPLOYEES")) {
			new AddEmployee().setVisible(true);
		}else if(ae.getActionCommand().equals("ADD ROOMS")) {
			new AddRooms().setVisible(true);			
		}else if(ae.getActionCommand().equals("ADD DRIVERS")) {
			new AddDrivers().setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		
		new Dashboard().setVisible(true);
		
	}
}

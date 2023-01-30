package com.view;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.controller.*;

public class Calciview  extends  JFrame 
{
		public JLabel l1,l2,l3,l4;
		public JTextField tf1,tf2,tf3;
		public JButton b1,b2,b3,b4,b5,b6;
		public Calciview()
		{
		 l1=new JLabel("First no:");
		 tf1=new JTextField();
		 l2=new JLabel("Second no:");
		 tf2=new JTextField();
		
		 b1=new JButton("+");
		 b2=new JButton("-");
		 b3=new JButton("*");
		 b4=new JButton("/");
		 l3=new JLabel("Result:");
		 tf3=new JTextField();
		 b5=new JButton("Reset");
		 b6=new JButton("Cancel");
		 l4=new JLabel();
		l1.setBounds(10,10,100,40);
		tf1.setBounds(120,10,100,40);
		l2.setBounds(10,60,100,40);
		tf2.setBounds(120,60,100,40);
		b1.setBounds(10,110,50,40);
		b2.setBounds(70,110,50,40);
		b3.setBounds(130,110,50,40);
		b4.setBounds(190,110,50,40);
		l3.setBounds(10,160,100,40);
		tf3.setBounds(120,160,100,40);
		b5.setBounds(30,210,100,40);
		b6.setBounds(160,210,100,40);
		b1.addActionListener(new CalciController(this));
		b2.addActionListener(new CalciController(this));
		b3.addActionListener(new CalciController(this));
		b4.addActionListener(new CalciController(this));
		b5.addActionListener(new CalciController(this));
		b6.addActionListener(new CalciController(this));
		add(l1);add(tf1);
		add(l2);add(tf2);
		add(b1);add(b2);
		add(b3);add(b4);
		add(l3);add(tf3);
		add(b5);add(b6);
		add(l4);
		
		setSize(300,300);
		setVisible(true);
		setLayout(null);
		}		
		
		
		
		
		
		
		
		
	
	 

}

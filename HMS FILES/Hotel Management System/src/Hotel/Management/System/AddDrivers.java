package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class AddDrivers extends JFrame {
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    AddDrivers()
    {
        JLabel j2=new JLabel("Add Drivers");
        j2.setBounds(150,10,150,30);
        j2.setFont(new Font("Tahoma",Font.BOLD,18));
        add(j2);
        JLabel j1=new JLabel("Name");
        j1.setFont(new Font("Tahoma",Font.PLAIN,16));
        j1.setBounds(60,70,100,30);
        add(j1);
        t1=new JTextField();
        t1.setBounds(200,70,150,30);
        add(t1);
        JLabel j3=new JLabel("Age");
        j3.setFont(new Font("Tahoma",Font.PLAIN,16));
        j3.setBounds(60,110,100,30);
        add(j3);
        t2=new JTextField();
        t2.setBounds(200,110,150,30);
        add(t2);
        JLabel j4=new JLabel("Gender");
        j4.setFont(new Font("Tahoma",Font.PLAIN,16));
        j4.setBounds(60,150,100,30);
        add(j4);
        c1=new JComboBox(new String[] {"Male","Female"});
        c1.setBounds(200,150,150,30);
        add(c1);
        JLabel j5=new JLabel("Car Company");
        j5.setFont(new Font("Tahoma",Font.PLAIN,16));
        j5.setBounds(60,190,100,30);
        add(j5);
        t3=new JTextField();
        t3.setBounds(200,190,150,30);
        add(t3);

        JLabel j6=new JLabel("Car Model");
        j6.setFont(new Font("Tahoma",Font.PLAIN,16));
        j6.setBounds(60,230,100,30);
        add(j6);
        t4=new JTextField();
        t4.setBounds(200,230,150,30);
        add(t4);
        JLabel j7=new JLabel("Availbilty");
        j7.setFont(new Font("Tahoma",Font.PLAIN,16));
        j7.setBounds(60,270,100,30);
        add(j7);
        c2=new JComboBox(new String[] {"Male","Female"});
        c2.setBounds(200,270,150,30);
        add(c2);
        JLabel j8=new JLabel("Location");
        j8.setFont(new Font("Tahoma",Font.PLAIN,16));
        j8.setBounds(60,310,100,30);
        add(j8);
        t5=new JTextField();
        t5.setBounds(200,310,150,30);
        add(t5);
        setLayout(null);
        setBounds(400,200,800,450);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new AddDrivers().setVisible(true);
    }
}

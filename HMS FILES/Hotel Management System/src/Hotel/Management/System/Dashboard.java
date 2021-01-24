package Hotel.Management.System;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener {

   JMenuBar mb;
   JMenu m1,m2;
   JMenuItem i1,i2,i3,i4;

    public Dashboard() {
        //super("HOTEL MANAGEMENT SYSTEM");
        mb=new JMenuBar();
        add(mb);
        m1=new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.WHITE);
        mb.add(m1);
        m2=new JMenu("ADMIN");
        m2.setForeground(Color.BLUE);
        mb.add(m2);
        i1=new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);
        i2=new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);
        i3=new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);
        i4=new JMenuItem("ADD DRIVERS");
        i4.addActionListener(this);
        m2.add(i4);
        mb.setBounds(0,0,1600,30);
        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/second.jpg"));
        Image i7=i6.getImage().getScaledInstance(1600,970,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i7);
        JLabel l1=new JLabel(i9);
        l1.setBounds(0,0,1600,970);
        add(l1);
        JLabel l2=new JLabel("WE WELCOME YOU AT");
        l2.setBounds(600,60,1000,50);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma",Font.PLAIN,46));
        l1.add(l2);

        setLayout(null);
        setBounds(0,0,1600,1000);
        setVisible(true);



    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADD EMPLOYEE"))
        {
            new AddEmployee().setVisible(true);

        }
        else if(ae.getActionCommand().equals("ADD ROOMS"))
        {
            new AddRooms().setVisible(true);
        }

    }
    public static void main(String[] args)
    {
        new Dashboard().setVisible(true);
    }
}
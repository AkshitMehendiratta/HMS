package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRooms extends JFrame implements ActionListener {
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    AddRooms()
    {
        JLabel l1=new JLabel("Add Rooms");
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setBounds(200,20,100,20);
        add(l1);

        JLabel l2=new JLabel("Room Number");
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setBounds(60,80,150,30);
        add(l2);
        t1=new JTextField();
        t1.setBounds(200,80,150,30);
        add(t1);
        JLabel l3=new JLabel("Availabilty");
        l3.setFont(new Font("Tahoma",Font.PLAIN,16));
        l3.setBounds(60,130,150,30);
        add(l3);
        c1=new JComboBox(new String[] {"Available","Occupied"});
        c1.setBounds(200,130,150,30);
        add(c1);

        JLabel l4=new JLabel("Cleaning Status");
        l4.setFont(new Font("Tahoma",Font.PLAIN,16));
        l4.setBounds(60,180,150,30);
        add(l4);
        c2=new JComboBox(new String[] {"Cleaned","Dirty"});
        c2.setBounds(200,180,150,30);
        add(c2);

        JLabel l5=new JLabel("Price");
        l5.setFont(new Font("Tahoma",Font.PLAIN,16));
        l5.setBounds(60,230,150,30);
        add(l5);
        t2=new JTextField();
        t2.setBounds(200,230,150,30);
        add(t2);



        JLabel l6=new JLabel("Bed Type");
        l6.setFont(new Font("Tahoma",Font.PLAIN,16));
        l6.setBounds(60,280,150,30);
        add(l6);
        c3=new JComboBox(new String[] {"Single Bed","Double Bed"});
        c3.setBounds(200,280,150,30);
        add(c3);

        b1=new JButton("Add Room");
        b1.setBounds(60,350,130,30);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Cancel");
        b2.setBounds(220,350,130,30);
        b2.addActionListener(this);
        add(b2);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/fourthimage.jpg"));
        JLabel j1=new JLabel(i1);
        j1.setBounds(400,30,500,350);
        add(j1);
        setBounds(300,230,1000,500);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            String room=t1.getText();
            String available=(String)c1.getSelectedItem();
            String status=(String)c2.getSelectedItem();
            String price=t2.getText();
            String type=(String)c3.getSelectedItem();
            Conn c=new Conn();
            try{
                String str="Insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"New Room added");
                this.setVisible(false);



            }catch(Exception e)
            {

            }

        }else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new AddRooms().setVisible(true);
    }
}

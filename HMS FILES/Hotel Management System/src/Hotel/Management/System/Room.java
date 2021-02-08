package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;

public class Room extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;

    Room()
    {
        JLabel l1=new JLabel("Room Number");
        l1.setBounds(0,10,100,20);
        add(l1);
        JLabel l2=new JLabel("Availability");
        l2.setBounds(105,10,100,20);
        add(l2);
        JLabel l3=new JLabel("Status");
        l3.setBounds(205,10,80,20);
        add(l3);
        JLabel l4=new JLabel("Price");
        l4.setBounds(300,10,80,20);
        add(l4);
        JLabel l5=new JLabel("Bed Type");
        l5.setBounds(410,10,80,20);
        add(l5);
        t1=new JTable();
        t1.setBounds(0,40,500,400);
        add(t1);
        b1=new JButton("Load Data");
        b1.setBounds(100,460,120,30);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Back");
        b2.setBounds(250,460,120,30);
        b2.addActionListener(this);
        add(b2);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/eleventhimage.jpg"));
        Image i7=i1.getImage().getScaledInstance(570,600,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i7);
        JLabel j10=new JLabel(i9);
        j10.setBounds(500,0,570,600);
        add(j10);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(300,150,1050,600);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                Conn c=new Conn();
                String str="select * from room";
                ResultSet rs=c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));



            }catch(Exception e){

            }



        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new Room().setVisible(true);
    }
}

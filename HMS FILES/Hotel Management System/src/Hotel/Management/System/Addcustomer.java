package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Addcustomer extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    JComboBox c1;
    Choice c2;
    JRadioButton r1,r2;

    Addcustomer()
    {
        JLabel l1=new JLabel("ADD CUSTOMER FORM");
        l1.setBounds(100,20,300,30);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);

        JLabel l2=new JLabel("ID");
        l2.setBounds(35,80,100,20);
        add(l2);
        c1=new JComboBox(new String[]{"Passport","Voter-Id","Driving License","Aadhar Card"});
        c1.setBounds(200,80,150,20);
        add(c1);
        JLabel l3=new JLabel("Number");
        l3.setBounds(35,120,100,20);
        add(l3);
        t2=new JTextField();
        t2.setBounds(200,120,150,20);
        add(t2);
        JLabel l4=new JLabel("Name");
        l4.setBounds(35,160,100,20);
        add(l4);
        t1=new JTextField();
        t1.setBounds(200,160,150,20);
        add(t1);
        JLabel l5=new JLabel("Gender");
        l5.setBounds(35,200,100,20);
        add(l5);
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.PLAIN,12));
        r1.setBounds(200,200,60,30);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.PLAIN,12));
        r2.setBounds(270,200,75,30);
        add(r2);

        JLabel l6=new JLabel("Country");
        l6.setBounds(35,240,100,20);
        add(l6);
        t5=new JTextField();
        t5.setBounds(200,240,150,20);
        add(t5);
        JLabel l7=new JLabel("Allocated Room Number");
        l7.setBounds(35,280,170,20);
        add(l7);
        c2=new Choice();
        try{
            Conn c=new Conn();
            String str="select * from room";
            ResultSet rs =c.s.executeQuery(str);
            while(rs.next())
            {
                c2.add(rs.getString("room_number"));
            }

        }catch (Exception e){

        }
        c2.setBounds(200,280,150,25);
        add(c2);
        JLabel l8=new JLabel("Checked In");
        l8.setBounds(35,320,100,20);
        add(l8);
        t3=new JTextField();
        t3.setBounds(200,320,150,20);
        add(t3);
        JLabel l9=new JLabel("Deposit");
        l9.setBounds(35,360,100,20);
        add(l9);
        t4=new JTextField();
        t4.setBounds(200,360,150,20);
        add(t4);

        b1=new JButton("Add Customer");
        b1.setBounds(50,410,120,25);
        add(b1);
        b1.addActionListener(this);
        b2=new JButton("Back");
        b2.setBounds(200,410,120,25);
        add(b2);
        b2.addActionListener(this);
        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/customer.jpg"));
        Image i7=i6.getImage().getScaledInstance(360,400,Image.SCALE_DEFAULT);
        ImageIcon i10=new ImageIcon(i7);

        JLabel i9=new JLabel(i10);
        i9.setBounds(450,50,360,400);
        add(i9);
        setLayout(null);
        setBounds(300,200,900,500);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1) {
            String id = (String) c1.getSelectedItem();
            String number = t2.getText();
            String name = t1.getText();
            String gender = null;
            if (r1.isSelected()) {
                gender = "Male";
            } else if (r2.isSelected()) {
                gender = "Female";
            }
            String country = t5.getText();
            String room = c2.getSelectedItem();
            String status = t3.getText();
            String deposit = t4.getText();
            String str = "Insert into customer values('" + id + "','" + number + "','" + name + "','" + gender + "','" + country + "','" + room + "','" + status + "','" + deposit + "')";
            String str2="update room set availablity='Occupied' where room_number='" + room + "'";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(str);
                c.s.executeUpdate(str2);


                JOptionPane.showMessageDialog(null, "New Customer Added");
                new Reception().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

            }
        }
        else if(ae.getSource()==b2)
        {
            new Reception().setVisible(true);
            this.setVisible(false);
        }



    }
    public static void main(String[] args)
    {
        new Addcustomer().setVisible(true);
    }

}

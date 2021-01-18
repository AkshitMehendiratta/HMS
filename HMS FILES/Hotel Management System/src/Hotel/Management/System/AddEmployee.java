package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {
    JTextField t1,t2,t3,t4,t5,t6;
    AddEmployee()
    {
        JLabel name=new JLabel("NAME");
        name.setFont(new Font("Tahoma",Font.PLAIN,17));
        name.setBounds(60,30,120,30);
        add(name);
        t1=new JTextField();
        t1.setBounds(200,30,150,30);
        add(t1);

        JLabel age=new JLabel("AGE");
        age.setFont(new Font("Tahoma",Font.PLAIN,17));
        age.setBounds(60,70,120,30);
        add(age);
        t2=new JTextField();
        t2.setBounds(200,70,150,30);
        add(t2);

        JLabel gender=new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.PLAIN,17));
        gender.setBounds(60,110,120,30);
        add(gender);

        JLabel job=new JLabel("JOB");
        job.setFont(new Font("Tahoma",Font.PLAIN,17));
        job.setBounds(60,150,120,30);
        add(job);

        JLabel salary=new JLabel("SALARY");
        salary.setFont(new Font("Tahoma",Font.PLAIN,17));
        salary.setBounds(60,190,120,30);
        add(salary);
        t3=new JTextField();
        t3.setBounds(200,190,150,30);
        add(t3);

        JLabel phone=new JLabel("PHONE");
        phone.setFont(new Font("Tahoma",Font.PLAIN,17));
        phone.setBounds(60,230,120,30);
        add(phone);
        t4=new JTextField();
        t4.setBounds(200,230,150,30);
        add(t4);


        JLabel aadhar=new JLabel("AADHAR");
        aadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
        aadhar.setBounds(60,270,120,30);
        add(aadhar);
        t5=new JTextField();
        t5.setBounds(200,270,150,30);
        add(t5);


        JLabel email =new JLabel("EMAIL");
        email.setFont(new Font("Tahoma",Font.PLAIN,17));
        email.setBounds(60,310,120,30);
        add(email);
        t6=new JTextField();
        t6.setBounds(200,310,150,30);
        add(t6);


        setLayout(null);
        setBounds(400,200,600,450);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new AddEmployee().setVisible(true);
    }
}

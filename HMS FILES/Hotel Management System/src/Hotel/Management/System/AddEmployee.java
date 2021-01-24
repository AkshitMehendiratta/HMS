package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.ResultSet;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox b1;
    JButton b2;

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
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.PLAIN,12));
        r1.setBounds(200,110,70,30);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.PLAIN,12));
        r2.setBounds(260,110,70,30);
        add(r2);


        JLabel job=new JLabel("JOB");
        job.setFont(new Font("Tahoma",Font.PLAIN,17));
        job.setBounds(60,150,120,30);
        add(job);
        String str[]={"Front Desk Clerks","Porters","House Keeping","Kitchen Staff","Room Service","Waiter/Waiteress","Manager","Accoutnant","Receptionist"};
        b1=new JComboBox(str);
        b1.setBounds(200,150,150,30);
        add(b1);

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
        b2=new JButton("Submit");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.BLACK);
        b2.setBounds(200,380,150,30);
        b2.addActionListener(this);
        add(b2);
        ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/addemployee.jpg"));
        Image i7=i6.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i7);
        JLabel l1=new JLabel(i9);
        l1.setBounds(380,50,450,450);
        add(l1);

        JLabel l2=new JLabel("ADD EMPLOYEE DETAILS");
        l2.setForeground(Color.BLUE);;
        l2.setBounds(435,30,400,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(l2);
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(400,250,850,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
      String name=t1.getText();
      String age=t2.getText();
        String salary=t3.getText();
        String phone=t4.getText();
        String aadhar=t5.getText();
        String email=t6.getText();
        String gender=null;
        if(r1.isSelected())
        {
            gender="Male";
        }
        else if(r2.isSelected())
        {
            gender="Female";
        }
        String job=(String)b1.getSelectedItem();
        Conn c=new Conn();
        String str="Insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
         try{
              c.s.executeUpdate(str);
              JOptionPane.showMessageDialog(null,"New Employee added");
              this.setVisible(false);


         }catch(Exception e){

         }

    }
    public static void main(String[] args)
    {
        new AddEmployee().setVisible(true);
    }
}

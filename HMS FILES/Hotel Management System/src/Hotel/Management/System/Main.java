package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main()
    {
        setSize(1366,565);

        setLocation(200,210);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/first.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1366,565);
        add(l1);
        JLabel l2=new JLabel("Hotel Management System");
        l2.setBounds(20,450,1000,90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("poppins",Font.PLAIN,70));
        l1.add(l2);
        JButton b1=new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1100,470,150,50);
        l1.add(b1);
        setLayout(null);
        setVisible(true);
        while(true)
        {
            l2.setVisible(false);
            try{
                Thread.sleep(500);

            }catch(Exception e)
            {


            }
            l2.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e){}

        }


    }

    public static void main(String[] args)
    {
        new Main();

    }
}

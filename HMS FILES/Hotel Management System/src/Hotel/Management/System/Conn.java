package Hotel.Management.System;

import java.sql.*;
public class Conn {

    Connection c;

    Statement s;
    public Conn()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///projecthms?autoReconnect=true&useSSL=false","root","myfamily");
            s=c.createStatement();

        }catch(Exception e)
        {

            e.printStackTrace();
        }

    }
}


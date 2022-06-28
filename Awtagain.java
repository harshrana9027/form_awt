/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.*;

public class Awtagain 
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        Button b1=new Button("submit");
        Button b2=new Button("reset");
        TextField t1=new TextField();
        TextField t2=new TextField();
        Label l1=new Label("first name : ");
        Label l2=new Label("last name  : ");
        
        Button b3=new Button("submit");
        Button b4=new Button("reset");
        TextField t3=new TextField();
        TextField t4=new TextField();
        Label l3=new Label("first name : ");
        Label l4=new Label("last name  : ");
        
        
        l1.setBounds(30,100,100,50); 
        l3.setBounds(400,100,100,50);
        l2.setBounds(30,180,100,50); 
        l4.setBounds(400,180,100,50);
        
        t1.setBounds(160,100,140,50);
        t2.setBounds(160,180,140,50);
        t3.setBounds(580,100,140,50);
        t4.setBounds(580,180,140,50);
        
        b1.setBounds(40,300,120,50);
        b2.setBounds(200,300,120,50);
        b3.setBounds(500,300,120,50);
        b4.setBounds(680,300,120,50);
        
        f.addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent windowEvent){
           System.exit(0);
            }        
        }); 
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                t1.setText(" ");
                t2.setText(" ");
            }
            
        });
        
       
         b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                t3.setText(" ");
                t4.setText(" ");
            }
            
        });
        
        
       
        f.add(b1);f.add(b2);f.add(t1);f.add(t2);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(t3);f.add(t4);f.add(b3);f.add(b4);
        
        f.setSize(900,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}

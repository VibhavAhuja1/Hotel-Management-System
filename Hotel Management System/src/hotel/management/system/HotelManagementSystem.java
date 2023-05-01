package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HotelManagementSystem extends JFrame implements ActionListener{
  
    HotelManagementSystem()
    {
        setBounds(300,300,1366,565);
       
        ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/pic/first.jpg") );
        JLabel l= new JLabel(i);
        l.setBounds(0,0,1366,565);
        add(l);
        
        JLabel l2= new JLabel("Hotel Management System");
        l2.setBounds(20,450,1000,70);
        l2.setForeground(Color.PINK);
        l2.setFont(new Font("serif",Font.PLAIN,70));
        l.add(l2);
        
        JButton b=new JButton("NEXT");
        b.setForeground(Color.red);
        b.setBounds(1150,450,150,40);
        l.add(b);
        
        b.addActionListener((ActionListener) this);
        
        setLayout(null);
        setVisible(true);
        
        while(true)
        {
            l2.setVisible(false);
            try
            {
                Thread.sleep(600);
            }catch(Exception e)
            {
                
            }
            l2.setVisible(true);
            try{
                Thread.sleep(600);
            }catch (Exception e){}
            
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        new Login().setVisible(true);
        this.setVisible(false);
    }
   

        public static void main(String[] args) {
        // TODO code application logic here
         new   HotelManagementSystem();

    }
    
}

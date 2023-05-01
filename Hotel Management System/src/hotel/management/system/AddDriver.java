package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    JButton b1,b2;
    AddDriver()
    {
        JLabel title = new JLabel("Add Driver");
        title.setBounds(150, 10, 150, 30);
        title.setFont(new Font("Tahoma",Font.BOLD,18));
        add(title);
        
        
        JLabel name=new JLabel("Name");
        name.setBounds(60,70,100,30);
        name.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(name);
        t1= new JTextField();
        t1.setBounds(200, 70, 150, 30);
        add(t1);
        
        
        JLabel age=new JLabel("Age");
        age.setBounds(60,110,100,30);
        age.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(age);
        t2= new JTextField();
        t2.setBounds(200, 110, 150, 30);
        add(t2);
        
        JLabel gender=new JLabel("Gender");
        gender.setBounds(60,150,100,30);
        gender.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(gender);
        c1= new JComboBox(new String[] {"Male","Female"});
        c1.setBounds(200,150,150,30);
        c1.setBackground(Color.white);
        add(c1);
        
        JLabel car=new JLabel("Car Company");
        car.setBounds(60,190,100,30);
        car.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(car);
        t3= new JTextField();
        t3.setBounds(200, 190, 150, 30);
        add(t3);
        
        
        JLabel model=new JLabel("Car Model");
        model.setBounds(60,230,100,30);
        model.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(model);
        t4= new JTextField();
        t4.setBounds(200, 230, 150, 30);
        add(t4);
        
        
        JLabel ava=new JLabel("Available");
        ava.setBounds(60,270,100,30);
        ava.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(ava);
        c2= new JComboBox(new String[] {"Available","Busy"});
        c2.setBounds(200,270,150,30);
        c2.setBackground(Color.white);
        add(c2);
        
        JLabel loc=new JLabel("Location");
        loc.setBounds(60,310,100,30);
        loc.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(loc);
        t5= new JTextField();
        t5.setBounds(200, 310, 150, 30);
        add(t5);
        
        b1=new JButton("Add Driver");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setBounds(60,370,130,30);
        add(b1);
        
        
        b2=new JButton("Cancel");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setBounds(220,370,130,30);
        add(b2);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/pic/sixth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,50,500,300);
        add(l1);

        
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(500,200,980,470);
        setVisible(true);
        
    }
    public  void actionPerformed(ActionEvent ae )
    {
        if(ae.getSource()==b1){
            String name =t1.getText();
            String age = t2.getText();
            String gender = (String) c1.getSelectedItem();
            String car=t3.getText();
            String model=t4.getText();
            String ava = (String) c2.getSelectedItem();
            String loc=t5.getText();
            
            conn c = new conn();
            String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+car+"','"+model+"','"+ava+"','"+loc+"')";
            try{
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Driver Successfully Added");
            }catch(Exception e){
                
            }
             
        }else if(ae.getSource()==b2){
        setVisible(false);
    }
    }
    
    

public static void main(String[] args)
{
new AddDriver().setVisible(true);

}
}
package chatnowapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener{
    public JPanel p1;
    public ImageIcon i1,i2,i3,i4,i5;
    
    //image icon for conversion from scaled image to image icon
    public ImageIcon backScale,sendScale,callScale;
    Server(){
        setLayout(null);
        
        p1 = new JPanel();
        p1.setBackground(new Color(0, 157, 209));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);
        
        //back button or image STARTS---------------------------------------------------------------------------------------
        i1= new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image scalei1 = i1.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
        backScale = new ImageIcon(scalei1);
        
        JLabel back = new JLabel(backScale);  
        back.setBounds(5,20,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        });
        
        //back button or image ENDS------------------------------------------------------------------------------------------
        setTitle("Barta");
        setSize(450,700);
        setLocation(1000,50);
        getContentPane().setBackground(Color.WHITE);
//        getContentPane().setBackground(new  Color(151,231,245));
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    }
    
    
    public static void main(String[] args){
        new Server();
    }
}

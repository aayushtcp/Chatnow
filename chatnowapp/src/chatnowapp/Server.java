package chatnowapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener{
    public JPanel p1;
    public ImageIcon i1,i2,i3,i4,i5;
    
    //image icon for conversion from scaled image to image icon
    public ImageIcon backScale,sendScale,callScale,videoScale,dotScale,profileScale;
    Server(){
        setLayout(null);
        
        p1 = new JPanel();
        p1.setBackground(new Color(0, 157, 209));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);
        
        //back button or image STARTS---------------------------------------------------------------------------------------
        
        i1= new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image scalei1 = i1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        backScale = new ImageIcon(scalei1);
        
        JLabel back = new JLabel(backScale);  
        back.setBounds(5,20,25,25);
        p1.add(back);
        back.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        });
      
        //back button or image ENDS-------------------------------------------------------------------------------------------
        
        
        //profile image STARTS---------------------------------------------------------------------------------------
        
        i2= new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image scalei2 = i2.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        profileScale = new ImageIcon(scalei2);
        
        JLabel profile = new JLabel(profileScale);  
        profile.setBounds(40,10,50,50);
        p1.add(profile);
        
        //profile image ENDS---------------------------------------------------------------------------------------
        
        //call image STARTS---------------------------------------------------------------------------------------
        
        i3= new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image scalei3 = i3.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        callScale = new ImageIcon(scalei3);
        
        JLabel call = new JLabel(callScale);  
        call.setBounds(300,20,25,25);
        p1.add(call);
        
        //call image ENDS--------------------------------------------------------------------------------------------

        //video image STARTS---------------------------------------------------------------------------------------
        i4= new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image scalei4 = i4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        videoScale = new ImageIcon(scalei4);
        
        JLabel video = new JLabel(videoScale);  
        video.setBounds(350,20,25,25);
        p1.add(video);
        //video image ENDS---------------------------------------------------------------------------------------
        
        //dot image STARTS---------------------------------------------------------------------------------------
        
        i5= new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image scalei5 = i5.getImage().getScaledInstance(10, 20,Image.SCALE_DEFAULT);
        dotScale = new ImageIcon(scalei5);
        
        JLabel dot = new JLabel(dotScale);  
        dot.setBounds(400,20,25,25);
        p1.add(dot);
        
        //dot image ENDS---------------------------------------------------------------------------------------
        
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
        Server s = new Server();
    }
}

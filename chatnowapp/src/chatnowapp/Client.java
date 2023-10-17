package chatnowapp;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
public class Client extends JFrame implements ActionListener{
    public JTextField message;
    public JButton send_button;
    public JLabel name,status,l3,l4,l5;
    public JPanel p1,p2,right;
    public ImageIcon i1,i2,i3,i4,i5;
    Box vertical = Box.createVerticalBox();
    
    //image icon for conversion from scaled image to image icon
    public ImageIcon backScale,sendScale,callScale,videoScale,dotScale,profileScale;
    Client(){
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
        
        i2= new ImageIcon(ClassLoader.getSystemResource("icons/2.png"));
        Image scalei2 = i2.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        profileScale = new ImageIcon(scalei2);
        
        JLabel profile = new JLabel(profileScale);  
        profile.setBounds(40,10,50,50);
        p1.add(profile);
        
        //profile image ENDS---------------------------------------------------------------------------------------
        name= new JLabel("Saugat");
        name.setBounds(100,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN SERIF", Font.BOLD,18));
        p1.add(name);
        
        status= new JLabel("Active now");
        status.setBounds(100,34,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN SERIF", Font.BOLD,12));
        p1.add(status);
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
        
        //next panel
        p2 = new JPanel();
        p2.setBounds(5,75,440,570);
        add(p2);
        
        //now textfield to write message
        message = new JTextField();
        message.setBounds(5,655,310,40);
        message.setFont(new Font("SAN SERIF", Font.PLAIN, 16));
        add(message);
        
        //now send button starts------------------------------------------------------------------------------
        send_button = new JButton("Send"); 
        send_button.setBounds(320,655,123,40);
        send_button.setBackground(new Color(126,211,72));
        send_button.setForeground(new Color(255,255,255));
        send_button.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
        add(send_button);
        send_button.addActionListener(this);
        
//         send_button.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent ae){
//                System.exit(0);
//            }
//        });
                
        //now send button starts------------------------------------------------------------------------------
        
        
        setSize(450,700);
        setLocation(500,50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
//        getContentPane().setBackground(new  Color(151,231,245));
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String out = message.getText();
        
//        JLabel output = new JLabel(out);
//        JPanel outt = new JPanel();
        JPanel outt = formatLabel(out);
        
//        outt.add(output);
        p2.setLayout(new BorderLayout());
        right = new JPanel(new BorderLayout()); 
        right.add(outt, BorderLayout.LINE_END);
        vertical.add(right);
        vertical.add(Box.createVerticalStrut(15));
        
        p2.add(vertical, BorderLayout.PAGE_START);
        
        
        message.setText("");
        repaint();
        invalidate();
        validate();
    }
    
    public static JPanel formatLabel(String out){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JLabel output = new JLabel("<html><p style=\"width:150px\">" + out + "</p></html>");
        
        output.setFont(new Font("Tahoma",Font.PLAIN,16));
        output.setBackground(new Color(151, 231, 245));
        output.setOpaque(true);

        Border border = BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1, true);
        output.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(10, 10, 10, 10)));


        panel.add(output);
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        panel.add(time);
        
        return panel;
    }
    
    
    public static void main(String[] args){
        Client c = new Client();
    }
}
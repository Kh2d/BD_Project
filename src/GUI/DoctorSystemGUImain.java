package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DoctorSystemGUImain extends JFrame
{
    
    private JPanel p1 , p2;
    private JButton[] b;  
    private JButton  NewDonationButton , SearchButton;
    private JLabel l1, l2 , img1;
    
    public DoctorSystemGUImain()
    {
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        p1 = new JPanel(null);
        p1.setBounds(800, 0, 200, 600);
        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBorder(BorderFactory.createEtchedBorder());
        p2 = new JPanel(null);
        p2.setBounds(0, 0, 800, 100);
        p2.setBackground(Color.white);
        p2.setBorder(BorderFactory.createEtchedBorder());
        
        l1 = new JLabel();
        l1.setFont(new Font("", 0, 20));
        Icon s = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\icon\\small2.png");
        l1.setIcon(s);
        l1.setBounds(18, 50, 160, 87);
        p1.add(l1);
        
        l2 = new JLabel("Doctor System");
        l2.setFont(new Font("", 1, 26));
        Icon s1 = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\New folder\\doctor_icon.jpg");
        l2.setBounds(305, 40, 190, 30);
        p2.add(l2);
        
        img1 = new JLabel(s1);
        img1.setBounds(200 , 7 , 85 , 83);
        p2.add(img1);
        
        b = new JButton[4];
        b[0] = new JButton("Home");
        b[0].setBounds(18, 200, 160, 40);
        
        b[1]= new JButton("Profile");
        b[1].setBounds(18, 245, 160, 40);
        
        b[2]= new JButton("History");
        b[2].setBounds(18, 290, 160, 40);
        
        b[3]= new JButton("Log Out");
        b[3].setBounds(18, 550, 160, 40);
        
        for(int i=0;i<b.length;i++)
        {
            p1.add(b[i]);
        }
        
        NewDonationButton = new JButton("New Donation");
        NewDonationButton.setBounds(210, 300, 160, 60);
        NewDonationButton.setToolTipText("To Make a new Donation");
        SearchButton = new JButton("Search");
        SearchButton.setToolTipText("To delete the Participant or brows the history of any participant");
        SearchButton.setBounds(430, 300, 160, 60);
        add(p1);
        add(p2);
        add(NewDonationButton);
        add(SearchButton);
    }
    
    public static void main(String[] args) {
        DoctorSystemGUImain a = new DoctorSystemGUImain();
        a.setVisible(true);
        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
        a.setSize(1000, 628);
        a.setResizable(false);
    }
}

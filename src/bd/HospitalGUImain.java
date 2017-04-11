
package bd;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class HospitalGUImain extends JFrame
{
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JLabel l1;
    
    private JDateChooser d1;
    private JButton b1 , b2;
    public HospitalGUImain()
    {
        setSize(700, 500);
        setLayout(null);
        p1 = new JPanel();
        p1.setBounds(520, 0 , 180 , 500);
        p1.setBorder(BorderFactory.createEtchedBorder());
        p1.setBackground(Color.yellow);
        l1 = new JLabel();
        Icon icon1 = new ImageIcon("C:\\Users\\user\\Desktop\\scs.jpg");
        l1.setIcon(icon1);
        l1.setBounds(531, 100, 158, 135);
        p2 = new JPanel();
        p2.setBounds(0, 0, 520, 500);
        p2.setBackground(Color.pink);
        add(p2);
        d1 = new JDateChooser();
        d1.setBounds(531, 300, 30, 30);
        b1 = new JButton("OK");
        b1.setBorder(BorderFactory.createEmptyBorder());
         b1.setBounds(550, 450, 30, 30);
          b2 = new JButton("return");
        b2.setBorder(BorderFactory.createEmptyBorder());
         b2.setBounds(550, 490, 30, 30);
         b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
            }
        });
         
         
         
         b1.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                p3 = new JPanel();
                p3.setBounds(0, 0, 520, 500);
                p3.setBackground(Color.lightGray);
                p3.add(p2);
            }
        } );
         p1.add(b1);
        p1.add(d1);
        add(p1);
        p1.add(l1);
    }
    
    public static void main(String[] args) 
    {
        HospitalGUImain a = new HospitalGUImain();
        a.setTitle("محمد فياض");
        a.setVisible(true);
        //a.setSize(700, 500);
        a.setResizable(false);
    }
}


package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DonationReport extends JFrame
{
    private JPanel p1 , DonationReportHeader , DonationReport;
    private JLabel l1, DonationReportTitle , DonationReportImage;
    private JButton[] b ,bu;
    private JLabel[] l;
    private JTextField[] t;
    private JSeparator[] se;
    
    public DonationReport()
    {
        //
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        p1 = new JPanel(null);
        p1.setBounds(800, 0, 200, 600);
        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBorder(BorderFactory.createEtchedBorder());
        l1 = new JLabel();
        l1.setFont(new Font("", 0, 20));
        Icon s = new ImageIcon(getClass().getResource("small2.png"));
        l1.setIcon(s);
        l1.setBounds(18, 50, 160, 87);
        p1.add(l1);
        ///
        
        DonationReportHeader = new JPanel(null);
        DonationReportHeader.setBounds(0, 0, 800, 100);
        DonationReportHeader.setBackground(Color.white);
        DonationReportHeader.setBorder(BorderFactory.createEtchedBorder());
        DonationReportTitle = new JLabel("Donation Report");
        DonationReportTitle.setFont(new Font("", 1, 26));
        DonationReportTitle.setBounds(305, 40, 210, 30);
        DonationReportHeader.add(DonationReportTitle);
        Icon s1 = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\icon\\2.png");
        DonationReportImage = new JLabel(s1);
        DonationReportImage.setBounds(200 , 5 , 90 , 90);
        DonationReportHeader.add(DonationReportImage);
        
        ////
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
        add(p1);
        add(DonationReportHeader);
        //////////////////////////////////////////////////////////////////
        
        ///
        DonationReport = new JPanel(null);
        DonationReport.setBounds(0,100, 800, 600);
        DonationReport.setBackground(Color.gray);
        add(DonationReport);
        ///
        bu = new JButton[2];
        l =new JLabel[14];
        t= new JTextField[17];
        se = new JSeparator[2];
        
        l[0]=new JLabel("Appointment Serial :");
        l[0].setForeground(Color.BLACK);
        l[0].setFont(new Font("", 0, 14));
        l[0].setBounds(15 , 20 , 140 , 23);
        t[0] = new JTextField();
        t[0].setBounds(147 , 20 ,140 ,23 );
        ///
        l[1]= new JLabel("Donor Name :");
        l[1].setForeground(Color.BLACK);
        l[1].setFont(new Font("", 0, 14));
        l[1].setBounds(15 , 90 , 90 , 23);

        t[1] = new JTextField();
        t[1].setBounds(107 , 90 ,90 ,23 );
        t[2] = new JTextField();
        t[2].setBounds(200 , 90 ,90 ,23 ); //Donor Name//
        t[3] = new JTextField();
        t[3].setBounds(293 , 90 ,90 ,23 );
        ///
        l[2]= new JLabel("Receiver Name :");
        l[2].setForeground(Color.BLACK);
        l[2].setFont(new Font("", 0, 14));
        l[2].setBounds(396 , 90 , 110 , 23);
        
        t[4] = new JTextField();
        t[4].setBounds(506 , 90 ,90 ,23 );
        t[5] = new JTextField();
        t[5].setBounds(599 , 90 ,90 ,23 );//receiver name
        t[6] = new JTextField();
        t[6].setBounds(692 , 90 ,90 ,23 );
        ///
        l[3]= new JLabel("Donor ID :");
        l[3].setFont(new Font("", 0, 14));
        l[3].setBounds(15 , 133 , 90 , 23);//Donor ID
        t[7] = new JTextField();
        t[7].setBounds(107 , 133 ,275 ,23 );
        ///
        l[4]= new JLabel("Receiver ID :");
        l[4].setForeground(Color.BLACK);
        l[4].setFont(new Font("", 0, 14));
        l[4].setBounds(396 , 133 , 110 , 23);//Receiver ID
        
        t[8] = new JTextField();
        t[8].setBounds(506 , 133 ,275 ,23 );
        ///
        l[5]= new JLabel("Blood Type :");
        l[5].setForeground(Color.BLACK);
        l[5].setFont(new Font("", 0, 14));
        l[5].setBounds(15 , 176 , 90 , 23);//Donor BT
        
        t[9] = new JTextField();
        t[9].setBounds(227 , 176 ,35 ,23 );
        ///
        l[6]= new JLabel("Blood Type :");
        l[6].setForeground(Color.BLACK);
        l[6].setFont(new Font("", 0, 14));
        l[6].setBounds(396 , 176 , 110 , 23);//Receiver BT
        
        t[10] = new JTextField();
        t[10].setBounds(626 , 176 ,35 ,23 );
        ///
        l[7]= new JLabel("Age :");
        l[7].setForeground(Color.BLACK);
        l[7].setFont(new Font("", 0, 14));
        l[7].setBounds(15 , 219 , 90 , 23);//Donor Age
        
        t[11] = new JTextField();
        t[11].setBounds(227 , 219 ,35 ,23 );
        ///
        l[8]= new JLabel("Age :");
        l[8].setForeground(Color.BLACK);
        l[8].setFont(new Font("", 0, 14));
        l[8].setBounds(396 , 219 , 110 , 23);//Receiver Age
        
        t[12] = new JTextField();
        t[12].setBounds(626 , 219 ,35 ,23 );
        ///
        se[0] = new JSeparator();
        se[0].setBounds(15, 62, 781, 10);
        se[1] = new JSeparator();       //Separators
        se[1].setBounds(15, 268, 781, 10);
        se[2] = new JSeparator();
        se[2].setBounds(15, 335, 781, 10);
        ///
        l[9]=new JLabel("Appointment Date :");
        l[9].setForeground(Color.BLACK);
        l[9].setFont(new Font("", 0, 14));
        l[9].setBounds(15 , 290 , 140 , 23);
        
        t[13] = new JTextField();
        t[13].setBounds(155 , 290 ,50 ,23 );
        t[14] = new JTextField();
        t[14].setBounds(207 , 290 ,35 ,23 ); //Appointment Date//
        t[15] = new JTextField();
        t[15].setBounds(243 , 290 ,35 ,23 );
        ///
        l[10]= new JLabel("hospital Name :");
        l[10].setForeground(Color.BLACK);
        l[10].setFont(new Font("", 0, 14));
        l[10].setBounds(396 , 290 , 110 , 23);//hspital name//
        
        t[16] = new JTextField();
        t[16].setBounds(506 , 290 ,275 ,23 );
        ///
        l[11]= new JLabel("- For doctor -");
        l[11].setForeground(Color.BLACK);
        l[11].setFont(new Font("", 1, 20));
        l[11].setBounds(335 , 336 , 130 , 30);
        
        l[12]= new JLabel("- Check up the donor and recipient before proceeding to do the donation process to make sure hat they are compatible matches.");//t
        l[12].setForeground(Color.BLACK);
        l[12].setFont(new Font("", 5, 14));
        l[12].setBounds(15 , 365 , 770 , 23); //Strings Doctors
        
        l[13]= new JLabel("compatible matches.");
        l[13].setForeground(Color.BLACK);
        l[13].setFont(new Font("", 5, 14));
        l[13].setBounds(25 , 385 , 770 , 23);
        ///
       
        
        ///
        bu[0] = new JButton("DownLoad Report");
        bu[0].setBounds(15 , 465 , 75 ,25);
//        bu[0].addActionListener( new ActionListener() 
//        {
//                    @Override
//                    public void actionPerformed(ActionEvent ae) 
//                    {
//                       
//                    }
//                });
        
        ///
        
        bu[1] = new JButton("Next");
        bu[1].setBounds(725 , 465 , 70 ,25);
        bu[1].setEnabled(false);
        bu[1].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                        DonationReport.setVisible(false);
                         DonationReportHeader.setVisible(false);
                         DoctorSys.setVisible(true);
                         p2.setVisible(true);
                    }
                });
        ///
        
       
       for (JButton b2 : bu) 
       {
            DonationReport.add(b2); // Cancel , NExt , Clear Button
       }
       
       for(JSeparator se1 : se)
       {
           DonationReport.add(se1); // Separator
       }
       
       for(JLabel JL : l)
       {
           DonationReport.add(JL); // Labels
       }
       for(JTextField JTF : t)
       {
           DonationReport.add(JTF); // TextFeiled
       }
        
   
        
    }
    
//     public static void main(String[] args) {
//        DonationReport a = new DonationReport();
//        a.setVisible(true);
//        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        a.setSize(1000, 628);
//        a.setResizable(false);
//    }
}

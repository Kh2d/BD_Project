
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DonationReport extends JFrame
{
    private JPanel p1 , DonationReportHeader , DonationReport;
    private JLabel l1 , DonationReportTitle , DonationReportImage;
    private JButton[] b ,buDonationR;
    private JLabel[] lDonationR;
    private JTextField[] tDonationR;
    private JSeparator[] seDonationR;
    
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
        
        buDonationR = new JButton[2];
        lDonationR =new JLabel[12];
        tDonationR= new JTextField[18];
        seDonationR = new JSeparator[2];
        
        
        ///
        lDonationR[1]= new JLabel("Donor Name :");
        lDonationR[1].setForeground(Color.BLACK);
        lDonationR[1].setFont(new Font("", 0, 14));
        lDonationR[1].setBounds(15 , 50 , 90 , 23);

        tDonationR[1] = new JTextField();
        tDonationR[1].setBounds(107 , 50 ,90 ,23 );
        tDonationR[2] = new JTextField();
        tDonationR[2].setBounds(200 , 50 ,90 ,23 ); //Donor Name//
        tDonationR[3] = new JTextField();
        tDonationR[3].setBounds(293 , 50 ,90 ,23 );
        ///
        lDonationR[2]= new JLabel("Receiver Name :");
        lDonationR[2].setForeground(Color.BLACK);
        lDonationR[2].setFont(new Font("", 0, 14));
        lDonationR[2].setBounds(396 , 50 , 110 , 23);
        
        tDonationR[4] = new JTextField();
        tDonationR[4].setBounds(506 , 50 ,90 ,23 );
        tDonationR[5] = new JTextField();
        tDonationR[5].setBounds(599 , 50 ,90 ,23 );//receiver name
        tDonationR[6] = new JTextField();
        tDonationR[6].setBounds(692 , 50 ,90 ,23 );
        ///
        lDonationR[3]= new JLabel("Donor ID :");
        lDonationR[3].setForeground(Color.BLACK);
        lDonationR[3].setFont(new Font("", 0, 14));
        lDonationR[3].setBounds(15 , 93 , 90 , 23);//Donor ID
        tDonationR[7] = new JTextField();
        tDonationR[7].setBounds(107 , 93 ,275 ,23 );
        ///
        lDonationR[4]= new JLabel("Receiver ID :");
        lDonationR[4].setForeground(Color.BLACK);
        lDonationR[4].setFont(new Font("", 0, 14));
        lDonationR[4].setBounds(396 , 93 , 110 , 23);//Receiver ID
        
        tDonationR[8] = new JTextField();
        tDonationR[8].setBounds(506 , 93 ,275 ,23 );
        ///
        lDonationR[5]= new JLabel("Blood Type :");
        lDonationR[5].setForeground(Color.BLACK);
        lDonationR[5].setFont(new Font("", 0, 14));
        lDonationR[5].setBounds(15 , 136 , 90 , 23);//Donor BT
        
        tDonationR[9] = new JTextField();
        tDonationR[9].setBounds(227 , 136 ,35 ,23 );
        ///
        lDonationR[6]= new JLabel("Blood Type :");
        lDonationR[6].setForeground(Color.BLACK);
        lDonationR[6].setFont(new Font("", 0, 14));
        lDonationR[6].setBounds(396 , 136 , 110 , 23);//Receiver BT
        
        tDonationR[10] = new JTextField();
        tDonationR[10].setBounds(626 , 136 ,35 ,23 );
        ///
        lDonationR[7]= new JLabel("Age :");
        lDonationR[7].setForeground(Color.BLACK);
        lDonationR[7].setFont(new Font("", 0, 14));
        lDonationR[7].setBounds(15 , 179 , 90 , 23);//Donor Age
        
        tDonationR[11] = new JTextField();
        tDonationR[11].setBounds(227 , 179 ,35 ,23 );
        ///
        lDonationR[8]= new JLabel("Age :");
        lDonationR[8].setForeground(Color.BLACK);
        lDonationR[8].setFont(new Font("", 0, 14));
        lDonationR[8].setBounds(396 , 179 , 110 , 23);//Receiver Age
        
        tDonationR[12] = new JTextField();
        tDonationR[12].setBounds(626 , 179 ,35 ,23 );
        ///
        seDonationR[0] = new JSeparator();
        seDonationR[0].setBounds(15, 228, 781, 10);
        seDonationR[1] = new JSeparator();       //Separators
        seDonationR[1].setBounds(15, 295, 781, 10);
        ///
        lDonationR[9]=new JLabel("Appointment Date :");
        lDonationR[9].setForeground(Color.BLACK);
        lDonationR[9].setFont(new Font("", 0, 14));
        lDonationR[9].setBounds(15 , 250 , 140 , 23);
        
        tDonationR[13] = new JTextField();
        tDonationR[13].setBounds(190 , 250 ,50 ,23 );
        tDonationR[14] = new JTextField();
        tDonationR[14].setBounds(243 , 250 ,35 ,23 ); //Appointment Date//
        tDonationR[15] = new JTextField();
        tDonationR[15].setBounds(281 , 250 ,35 ,23 );
        ///
        lDonationR[10]= new JLabel("hospital Name :");
        lDonationR[10].setForeground(Color.BLACK);
        lDonationR[10].setFont(new Font("", 0, 14));
        lDonationR[10].setBounds(396 , 250 , 110 , 23);//hspital name//
        
        tDonationR[16] = new JTextField();
        tDonationR[16].setBounds(506 , 250 ,275 ,23 );
        ///
//        l[11]= new JLabel("- For doctor -");
//        l[11].setForeground(Color.BLACK);
//        l[11].setFont(new Font("", 1, 20));
//        l[11].setBounds(335 , 336 , 130 , 30);
        ///
        lDonationR[0]=new JLabel("Donation Serial :");
        lDonationR[0].setForeground(Color.BLACK);
        lDonationR[0].setFont(new Font("", 1, 14));
        lDonationR[0].setBounds(15 , 325 , 140 , 23);
        tDonationR[0] = new JTextField();
        tDonationR[0].setBounds(147 , 325 ,140 ,23 );
        ///
        lDonationR[11]= new JLabel("Donation State :");
        lDonationR[11].setForeground(Color.BLACK);
        lDonationR[11].setFont(new Font("", 1, 14));
        lDonationR[11].setBounds(396 , 325 , 130 , 23);
        tDonationR[17] = new JTextField();
        tDonationR[17].setBounds(529 , 325 ,140 ,23 );
        
        ///^
//        l[12]= new JLabel("- Check up the donor and recipient before proceeding to do the donation process to make sure hat they are compatible matches.");//t
//        l[12].setForeground(Color.BLACK);
//        l[12].setFont(new Font("", 5, 14));
//        l[12].setBounds(15 , 365 , 770 , 23); //Strings Doctors
//        
//        l[13]= new JLabel("compatible matches.");
//        l[13].setForeground(Color.BLACK);
//        l[13].setFont(new Font("", 5, 14));
//        l[13].setBounds(25 , 385 , 770 , 23);
        ///
       
        
        ///
        buDonationR[0] = new JButton("Save");
        buDonationR[0].setBounds(15 , 465 , 75 ,25);
//        bu[0].addActionListener( new ActionListener() 
//        {
//                    @Override
//                    public void actionPerformed(ActionEvent ae) 
//                    {
//                       
//                    }
//                });
        
        ///
        
        buDonationR[1] = new JButton("Done");
        buDonationR[1].setBounds(725 , 465 , 70 ,25);
//        bu[1].addActionListener(new ActionListener() {
//
//                    @Override
//                    public void actionPerformed(ActionEvent ae) 
//                    {
//                         DonationReport.setVisible(false);
//                         DonationReportHeader.setVisible(false);
//                      //   DoctorSys.setVisible(true);
//                        // p2.setVisible(true);
//                    }
//                });
        ///
        
       
       for (JButton b2 : buDonationR) 
       {
            DonationReport.add(b2); // Cancel , NExt , Clear Button
       }
       
       for(JSeparator se1 : seDonationR)
       {
           DonationReport.add(se1); // Separator
       }
       
       for(JLabel JL : lDonationR)
       {
           DonationReport.add(JL); // Labels
       }
       for(JTextField JTF : tDonationR)
       {
           DonationReport.add(JTF); // TextFeiled
       }
        
        
    }
    
     public static void main(String[] args) {
        DonationReport a = new DonationReport();
        a.setVisible(true);
        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
        a.setSize(1000, 628);
        a.setResizable(false);
    }
}

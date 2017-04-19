package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class NurseSystemGUImain extends JFrame
{
    
    private JPanel MainPanel , NursePanel , NurseSys , newDonationNurse , newDonationHeader , approveDonation , test1 , DonationReportHeader , DonationReport ,ProfileHeader , ProfilePanel;
    private JButton[] b ,bu ,buDonationR,ProfileButton ;  
    private JLabel[] l ,lDonationR , ProfileLabel;
    private JTextField[] t , tDonationR , ProfileTextField;
    private JCheckBox x ;
    private JRadioButton[] RedioGender;
    private JSeparator[] se , seDonationR;
    private JButton  NewDonationButton , SearchButton;
    private JLabel l1, l2 , img1 , approveImage , approveDonationTitle , DonationReportTitle , DonationReportImage ; //NewDonationTitle , NewDonationImage;
    
    public NurseSystemGUImain()
    {
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        ///
        MainPanel = new JPanel(null);
        MainPanel.setBounds(800, 0, 200, 600);
        MainPanel.setBackground(new java.awt.Color(204, 204, 204));
        MainPanel.setBorder(BorderFactory.createEtchedBorder());
       
        
        l1 = new JLabel();
        l1.setFont(new Font("", 0, 20));
        Icon s = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\icon\\small2.png");
        l1.setIcon(s);
        l1.setBounds(18, 50, 160, 87);
        MainPanel.add(l1);
        
        b = new JButton[4];
        ///
        b[0] = new JButton("Home");
        b[0].setBounds(18, 200, 160, 40);
        b[0].addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
              if(newDonationHeader.isVisible() && newDonationNurse.isVisible())
               {
                   newDonationNurse.setVisible(false);
                         newDonationHeader.setVisible(false);
                         NursePanel.setVisible(true);
                         NurseSys.setVisible(true);
               }
              else if(approveDonation.isVisible() && test1.isVisible())
               {
                         approveDonation.setVisible(false);
                         test1.setVisible(false);
                         NursePanel.setVisible(true);
                         NurseSys.setVisible(true);
               }
              else if(ProfileHeader.isVisible() && ProfilePanel.isVisible())
               {
                         ProfileHeader.setVisible(false);
                         ProfilePanel.setVisible(false);
                         NursePanel.setVisible(true);
                         NurseSys.setVisible(true);
               }
               else
               {
                   
               }
            }
        });
        ///
        b[1]= new JButton("Profile");
        b[1].setBounds(18, 245, 160, 40);
        b[1].addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                /////////////////////////////////////////////////////////
                 if(newDonationHeader.isVisible() && newDonationNurse.isVisible())
               {
                        newDonationNurse.setVisible(false);
                         newDonationHeader.setVisible(false);
               }
              else if(approveDonation.isVisible() && test1.isVisible())
               {
                         approveDonation.setVisible(false);
                         test1.setVisible(false);
                        
               }
              else if(NursePanel.isVisible() && NurseSys.isVisible())
               {
                        NursePanel.setVisible(false);
                NurseSys.setVisible(false);
               }
               else
               {
                   
               }
                
                
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ProfileHeader = new JPanel(null);
                ProfileHeader.setBounds(0, 0, 800, 100);
                ProfileHeader.setBackground(Color.white);
                ProfileHeader.setBorder(BorderFactory.createEtchedBorder());
                JLabel ProfileTitle = new JLabel("Profile");
                ProfileTitle.setFont(new Font("", 1, 26));
                ProfileTitle.setBounds(305, 40, 190, 30);
                ProfileHeader.add(ProfileTitle);

                ImageIcon pic = new ImageIcon("ProfileIcon.png");
                Image pic1 = pic.getImage().getScaledInstance(pic.getIconWidth(), pic.getIconHeight(),Image.SCALE_SMOOTH);
                ImageIcon ProfileImage1 = new ImageIcon(pic1);
                JLabel ProfileImage = new JLabel(ProfileImage1);
                ProfileImage.setBounds(200 , 5 , 90 , 90);
                ProfileHeader.add(ProfileImage);
                add(ProfileHeader);
                //////////////////////////////////////////////////////////////////
                 ///
                ProfilePanel = new JPanel(null);
                ProfilePanel.setBounds(0,100, 800, 600);
                ProfilePanel.setBackground(Color.gray);
                add(ProfilePanel);
                ///

                ProfileButton = new JButton[5];    //-1
                ProfileLabel =new JLabel[10];      //+1
                ProfileTextField = new JTextField[14]; //+1
                RedioGender = new JRadioButton[2];
                //ProfileSeparator = new JSeparator[3]; //-1


                ///

                ProfileLabel[0]= new JLabel("Name :");
                ProfileLabel[0].setForeground(Color.BLACK);
                ProfileLabel[0].setFont(new Font("", 0, 16));
                ProfileLabel[0].setBounds(15 , 50 , 90 , 23);

                ProfileTextField[0] = new JTextField();
                ProfileTextField[0].setBounds(107 , 50 ,90 ,23 );
                ProfileTextField[0].setEditable(false);
                ProfileTextField[1] = new JTextField();
                ProfileTextField[1].setBounds(200 , 50 ,90 ,23 ); //Name//
                ProfileTextField[1].setEditable(false);
                ProfileTextField[2] = new JTextField();
                ProfileTextField[2].setBounds(293 , 50 ,90 ,23 );
                ProfileTextField[2].setEditable(false);

                ///

                ProfileLabel[1]= new JLabel("ID :");
                ProfileLabel[1].setForeground(Color.BLACK);
                ProfileLabel[1].setFont(new Font("", 0, 16));
                ProfileLabel[1].setBounds(15 , 93 , 90 , 23);//Donor ID
                ProfileTextField[3] = new JTextField();
                ProfileTextField[3].setBounds(107 , 93 ,275 ,23 );
                ProfileTextField[3].setEditable(false);
                ProfileTextField[3].setEditable(false);

                ///

                ProfileLabel[2]= new JLabel("Blood Type :");
                ProfileLabel[2].setForeground(Color.BLACK);
                ProfileLabel[2].setFont(new Font("", 0, 16));
                ProfileLabel[2].setBounds(15 , 136 , 90 , 23);

                ProfileTextField[4] = new JTextField();
                ProfileTextField[4].setBounds(227 , 136 ,35 ,23 );
                ProfileTextField[4].setEditable(false);

                ///
                ProfileLabel[3]= new JLabel("Age :");
                ProfileLabel[3].setForeground(Color.BLACK);
                ProfileLabel[3].setFont(new Font("", 0, 16));
                ProfileLabel[3].setBounds(15 , 179 , 90 , 23);//Donor Age

                 ProfileTextField[5] = new JTextField();
                 ProfileTextField[5].setBounds(227 , 179 ,35 ,23 );  
                 ProfileTextField[5].setEditable(false);

                 ///

                ProfileLabel[4]=new JLabel("GENDER:");
                ProfileLabel[4].setForeground(Color.BLACK);
                ProfileLabel[4].setFont(new Font("", 0, 16));
                ProfileLabel[4].setBounds(15 , 222 , 140 , 23);

                ButtonGroup bG = new ButtonGroup();
                RedioGender[0] = new JRadioButton("Male" , true);
                RedioGender[0].setBounds(190 , 222 ,55 ,23 );
                RedioGender[1] = new JRadioButton("Female" );
                RedioGender[1].setBounds(245 , 222 ,70 ,23 );
                for(JRadioButton x :RedioGender ) { bG.add(x); x.setEnabled(false);}
                ProfilePanel.add( RedioGender[0]);
                 ProfilePanel.add( RedioGender[1]);
        //        ProfileTextField[6] = new JTextField();
        //        ProfileTextField[6].setBounds(190 , 222 ,50 ,23 );

                ////

                ProfileLabel[5]=new JLabel("Phone:");
                ProfileLabel[5].setForeground(Color.BLACK);
                ProfileLabel[5].setFont(new Font("", 0, 16));
                ProfileLabel[5].setBounds(15 , 265 , 140 , 23);

                ProfileTextField[6] = new JTextField();
                ProfileTextField[6].setBounds(107 , 265 ,275 ,23 );


                ///

                ProfileLabel[6]=new JLabel("Area :");
                ProfileLabel[6].setForeground(Color.BLACK);
                ProfileLabel[6].setFont(new Font("", 0, 16));
                ProfileLabel[6].setBounds(15 , 308 , 140 , 23);

                ProfileTextField[7] = new JTextField();
                ProfileTextField[7].setBounds(107 , 308 ,275 ,23 );

                ///

                ProfileLabel[7]=new JLabel("Birth Date :");
                ProfileLabel[7].setForeground(Color.BLACK);
                ProfileLabel[7].setFont(new Font("", 0, 16));
                ProfileLabel[7].setBounds(15 , 351 , 140 , 23);

                ProfileTextField[8] = new JTextField();
                ProfileTextField[8].setBounds(190 , 351 ,50 ,23 );
                ProfileTextField[9] = new JTextField();
                ProfileTextField[9].setBounds(243 , 351 ,35 ,23 ); //Appointment Date//
                ProfileTextField[10] = new JTextField();
                ProfileTextField[10].setBounds(281 , 351 ,35 ,23 );

                ////
                ProfileLabel[9]=new JLabel("Date Join :");
                ProfileLabel[9].setForeground(Color.BLACK);
                ProfileLabel[9].setFont(new Font("", 0, 16));
                ProfileLabel[9].setBounds(15 , 394 , 140 , 23);

                ProfileTextField[11] = new JTextField();
                ProfileTextField[11].setBounds(190 , 394 ,50 ,23 );
                ProfileTextField[11].setEditable(false);
                ProfileTextField[12] = new JTextField();
                ProfileTextField[12].setBounds(243 , 394 ,35 ,23 ); //Appointment Date//
                ProfileTextField[12].setEditable(false);
                ProfileTextField[13] = new JTextField();
                ProfileTextField[13].setBounds(281 , 394 ,35 ,23 );
                ProfileTextField[13].setEditable(false);

                ///
                ImageIcon PersonPic = new ImageIcon("");
                Image PersonPic1 = PersonPic.getImage().getScaledInstance(PersonPic.getIconWidth(), PersonPic.getIconHeight(),Image.SCALE_SMOOTH);
                ImageIcon PersonProfileImage = new ImageIcon(PersonPic1);
                ProfileLabel[8]=new JLabel(PersonProfileImage);
                ProfileLabel[8].setBounds(600 , 25 , 170 , 200);
                ProfileLabel[8].setBorder(BorderFactory.createLineBorder(Color.BLACK));

                ProfileButton[0] = new JButton("Add");
                ProfileButton[0].setBounds(600, 235, 65, 30);
                ProfileButton[1] = new JButton("Remove");
                ProfileButton[1].setBounds(685, 235, 80, 30);
              

                ///
                ProfileButton[2] = new JButton("Change Password");
                ProfileButton[2].setBounds(325, 465, 150, 25);
                

                ProfileButton[3] = new JButton("Update");
                ProfileButton[3].setBounds(690, 465, 100, 25);
               

                ProfileButton[4] = new JButton("Back");
                ProfileButton[4].setBounds(15, 465, 100, 25);
                ProfileButton[4].addActionListener( new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                         ProfileHeader.setVisible(false);
                         ProfilePanel.setVisible(false);
                         NurseSys.setVisible(true);
                         NursePanel.setVisible(true);
                    }
                });

                for (JButton b2 : ProfileButton) 
                    {
                         ProfilePanel.add(b2); // Back , Update , Change Password
                    }

                    for(JLabel JL : ProfileLabel)
                    {
                        ProfilePanel.add(JL); // Labels
                    }
                    for(JTextField JTF : ProfileTextField)
                    {
                        ProfilePanel.add(JTF); // TextFeiled
                    }

                    }
        });
        ///
        b[2]= new JButton("History");
        b[2].setBounds(18, 290, 160, 40);
        ///
        b[3]= new JButton("Log Out");
        b[3].setBounds(18, 550, 160, 40);
        ///
        for(int i=0;i<b.length;i++)
        {
            MainPanel.add(b[i]);
        }
        add(MainPanel);
        ///
        NursePanel = new JPanel(null);
        NursePanel.setBounds(0, 0, 800, 100);
        NursePanel.setBackground(Color.white);
        NursePanel.setBorder(BorderFactory.createEtchedBorder());
        l2 = new JLabel("Nurse System");
        l2.setFont(new Font("", 1, 26));
        Icon s1 = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\New folder\\nurse_icon (1).jpg");
        l2.setBounds(305, 40, 190, 30);
        NursePanel.add(l2);
        
        img1 = new JLabel(s1);
        img1.setBounds(200 , 7 , 85 , 83);
        NursePanel.add(img1);
        add(NursePanel);

        /////////////////////////////////////////////////////////
        NurseSys = new JPanel(null);
        NurseSys.setBounds(0,100, 800, 600); // Nurse Home Panel
        NurseSys.setBackground(Color.gray);
        add(NurseSys);
        ///
        NewDonationButton = new JButton("New Donation");
        NewDonationButton.setBounds(210, 200, 160, 60);
        NewDonationButton.setToolTipText("To Make a new Donation");           
        NewDonationButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                ///
                NurseSys.setVisible(false);
                NursePanel.setVisible(false);       //Hide main page
                ///
                newDonationHeader= new JPanel(null);
                newDonationHeader = new JPanel(null);
                newDonationHeader.setBounds(0, 0, 800, 100);
                newDonationHeader.setBackground(Color.white);
                newDonationHeader.setBorder(BorderFactory.createEtchedBorder());
                JLabel NewDonationTitle = new JLabel("New Donation");                       // New Donation Header
                NewDonationTitle.setFont(new Font("", 1, 26));
                NewDonationTitle.setBounds(305, 40, 190, 30);
                newDonationHeader.add(NewDonationTitle);

                Icon NewDonationPanelImage = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\icon\\bd+.png");
                JLabel NewDonationImage = new JLabel(NewDonationPanelImage);
                NewDonationImage.setBounds(200 , 5 , 90 , 90);
                newDonationHeader.add(NewDonationImage);
                add(newDonationHeader);
                ///
                
                //
                newDonationNurse = new JPanel(null);
                newDonationNurse.setBounds(0,100, 800, 600);
                 newDonationNurse.setBackground(Color.gray);            // New donation panel for Nurse
                add(newDonationNurse);
                //
                

               bu = new JButton[4];
               l =new JLabel[14];
               t= new JTextField[17];
               se = new JSeparator[3];


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
                bu[3] = new JButton("Approve");
                bu[3].setBounds(347, 400, 100, 30);
                bu[3].addActionListener( new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                        newDonationHeader.setVisible(false);
                        newDonationNurse.setVisible(false); // deVisible
                        //
                        approveDonation = new JPanel(null);
                        approveDonation.setBounds(0, 0, 800, 100);
                        approveDonation.setBackground(Color.white);
                        approveDonation.setBorder(BorderFactory.createEtchedBorder());
                        approveDonationTitle = new JLabel("Approve Donation");
                        approveDonationTitle.setFont(new Font("", 1, 26));
                        approveDonationTitle.setBounds(305, 40, 230, 30);
                        approveDonation.add(approveDonationTitle);

                        Icon s11 = new ImageIcon("C:\\Users\\user\\Desktop\\Projects\\OOP Project\\Image\\icon\\2.png");
                        approveImage = new JLabel(s11);
                        approveImage.setBounds(200 , 5 , 90 , 90);
                        approveDonation.add(approveImage);
                        add(approveDonation);
                        //
                        test1 = new JPanel(null); //new panel that show
                        test1.setBounds(0,100, 800, 500);
                        //test1.setBorder(BorderFactory.createEtchedBorder());
                       // test1.setBackground(Color.white);
                        //test1.add(x);
                        //
                        
                        JPanel DrLogin = new JPanel(null); // fpr login
                        DrLogin.setBounds(267 , 91 , 265 , 318);
                        DrLogin.setBackground(Color.GRAY);
                        DrLogin.setBorder(BorderFactory.createEtchedBorder());
                        test1.add(DrLogin);
                       ///
                        JLabel Header = new JLabel("Doctor Confirmation");
                        Header.setFont(new Font("Vrinda" , 1 , 18));
                        Header.setBounds(57 , 10 , 151 , 27);
                        Header.setForeground(Color.BLACK);
                        DrLogin.add(Header);
                       ///
                        JSeparator so = new JSeparator();
                        so.setBounds(20 , 40 , 225 , 10 );
                        DrLogin.add(so);
                       ///
                       JLabel Username = new JLabel("UserName :");
                       Username.setForeground(Color.BLACK);
                       Username.setBounds(32 , 55 , 74 , 17); // User Name Things hhhh 
                       DrLogin.add(Username); 

                       JTextField UserNameField = new JTextField();
                       UserNameField.setBounds(32 , 75 , 200 , 30 );
                       DrLogin.add(UserNameField);
                       ///
                        JLabel Password = new JLabel("Password :");
                       Password.setForeground(Color.BLACK);
                       Password.setBounds(32 , 115 , 74 , 17); // Password Things hhhh 
                       DrLogin.add(Password); 

                       JPasswordField PasswordField = new JPasswordField();
                       PasswordField.setBounds(32 , 135 , 200 , 30 );
                       DrLogin.add(PasswordField);
                       ///
                       JButton Conform = new JButton("Confirm");
                       Conform.setBounds(92 , 180, 80 ,25);  
                       DrLogin.add(Conform);
                       ///
                        DrLogin.add(x);
                       ///
                       JButton bb = new JButton("Done");
                       bb.setBounds(92 , 255, 80 ,25);                      // Cancel , NExt , Clear Button
                       bb.addActionListener( new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent ae1) 
                            {
                               test1.setVisible(false);
                               approveDonation.setVisible(false);
                               newDonationHeader.setVisible(true);
                               newDonationNurse.setVisible(true);
                            }
                        });
                        DrLogin.add(bb);
                       ///

                       add(test1);

                    }
                });


                //final 
                ///
                bu[0] = new JButton("Cancel");
                bu[0].setBounds(15 , 465 , 75 ,25);
                bu[0].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                        newDonationHeader.setVisible(false);
                        newDonationNurse.setVisible(false);
                        NurseSys.setVisible(true);
                        NursePanel.setVisible(true);
                    }
                });
                ///
                bu[1] = new JButton("Clear");
                bu[1].setBounds(95 , 465, 70 ,25);                      // Cancel , NExt , Clear Button
                bu[1].addActionListener( new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                       for(JTextField JTF : t)
                        { 
                                JTF.setText(null);
                        }                  
                        x.setSelected(false);               
                    }
                });

                bu[2] = new JButton("Next");
                bu[2].setBounds(725 , 465 , 70 ,25);
                bu[2].setEnabled(false);
                bu[2].addActionListener( new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                        newDonationNurse.setVisible(false);
                        newDonationHeader.setVisible(false);
                         
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
                        add(DonationReportHeader); 
                        ////////////
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
                //        buDonationR[0].addActionListener( new ActionListener() 
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
                        buDonationR[1].addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent ae) 
                                    {
                                         DonationReportHeader.setVisible(false);
                                         DonationReport.setVisible(false);
                                         NurseSys.setVisible(true);
                                         NursePanel.setVisible(true);
                                    }
                                });
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
                });
                ///


               //add(x); //Check Box
               for (JButton b2 : bu) 
               {
                    newDonationNurse.add(b2); // Cancel , NExt , Clear Button
               }

               for(JSeparator se1 : se)
               {
                  newDonationNurse.add(se1); // Separator
               }

               for(JLabel JL : l)
               {
                   newDonationNurse.add(JL); // Labels
               }
               for(JTextField JTF : t)
               {
                   newDonationNurse.add(JTF); // TextFeiled
               }
                
                x = new JCheckBox("Approve");
                        x.setOpaque(false);                 //  approve area
                        x.setFont(new Font("" , 1 , 16));
                        x.setForeground(Color.BLACK);
                        x.setBounds(90, 215, 100, 30);
                        //x.setEnabled(false);
                        x.addItemListener
                        ( 
                            new ItemListener()
                            {

                                @Override
                                public void itemStateChanged(ItemEvent ie) 
                                {
                                  if(x.isSelected())
                                    {
                                        bu[2].setEnabled(true);
                                    }
                                    else if(!x.isSelected())
                                    {
                                        bu[2].setEnabled(false);
                                    }
                                }
                            }
                        );
                
            }
        });
        ///                                                                                                    // Nurse system main
        SearchButton = new JButton("Search");
        SearchButton.setToolTipText("To brows the history of any participant");
        SearchButton.setBounds(430, 200, 160, 60);
        SearchButton.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                        NurseSys.setVisible(false);
                        NursePanel.setVisible(false); // deVisible
                        //
                        approveDonation = new JPanel(null);
                        approveDonation.setBounds(0, 0, 800, 100);
                        approveDonation.setBackground(Color.white);
                        approveDonation.setBorder(BorderFactory.createEtchedBorder());
                        approveDonationTitle = new JLabel("Search a person");
                        approveDonationTitle.setFont(new Font("", 1, 26));
                        approveDonationTitle.setBounds(305, 40, 230, 30);
                        approveDonation.add(approveDonationTitle);

                        Icon s11 = new ImageIcon(getClass().getResource("Search.png"));
                        approveImage = new JLabel(s11);
                        approveImage.setBounds(200 , 1 , 98 , 98);
                        approveDonation.add(approveImage);
                        add(approveDonation);
                        //
                        test1 = new JPanel(null); //new panel that show
                        test1.setBounds(0,100, 800, 500);
                        //test1.setBorder(BorderFactory.createEtchedBorder());
                       // test1.setBackground(Color.white);
                        //test1.add(x);
                        //
                        
                        JPanel DrLogin = new JPanel(null); // fpr login
                        DrLogin.setBounds(267 , 130 , 265 , 180);
                        DrLogin.setBackground(Color.GRAY);
                        DrLogin.setBorder(BorderFactory.createEtchedBorder());
                        test1.add(DrLogin);
                       ///
                        JLabel Header = new JLabel("Enter ID to get result");
                        Header.setFont(new Font("Vrinda" , 1 , 18));
                        Header.setBounds(50 , 10 , 200 , 27);
                        Header.setForeground(Color.BLACK);
                        DrLogin.add(Header);
                       ///
                        JSeparator so = new JSeparator();
                        so.setBounds(20 , 40 , 225 , 10 );
                        DrLogin.add(so);
                       ///
                       JLabel Username = new JLabel("ID :");
                       Username.setForeground(Color.BLACK);
                       Username.setBounds(32 , 55 , 74 , 17); // User Name Things hhhh 
                       DrLogin.add(Username); 

                       JTextField UserNameField = new JTextField();
                       UserNameField.setBounds(32 , 75 , 200 , 30 );
                       DrLogin.add(UserNameField);
                       ///
                       
                       JButton Conform = new JButton("Find");
                       Conform.setBounds(92 , 130, 80 ,25);  
                       Conform.addActionListener( new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent ae) 
                            {
                                    /////////////////////////////////////////////////////////
                              approveDonation.setVisible(false);
                              test1.setVisible(false);
                
                
                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ProfileHeader = new JPanel(null);
                ProfileHeader.setBounds(0, 0, 800, 100);
                ProfileHeader.setBackground(Color.white);
                ProfileHeader.setBorder(BorderFactory.createEtchedBorder());
                JLabel ProfileTitle = new JLabel("Profile");
                ProfileTitle.setFont(new Font("", 1, 26));
                ProfileTitle.setBounds(305, 40, 190, 30);
                ProfileHeader.add(ProfileTitle);

                ImageIcon pic = new ImageIcon("ProfileIcon.png");
                Image pic1 = pic.getImage().getScaledInstance(pic.getIconWidth(), pic.getIconHeight(),Image.SCALE_SMOOTH);
                ImageIcon ProfileImage1 = new ImageIcon(pic1);
                JLabel ProfileImage = new JLabel(ProfileImage1);
                ProfileImage.setBounds(200 , 5 , 90 , 90);
                ProfileHeader.add(ProfileImage);
                add(ProfileHeader);
                //////////////////////////////////////////////////////////////////
                 ///
                ProfilePanel = new JPanel(null);
                ProfilePanel.setBounds(0,100, 800, 600);
                ProfilePanel.setBackground(Color.gray);
                add(ProfilePanel);
                ///

                ProfileButton = new JButton[5];    //-1
                ProfileLabel =new JLabel[10];      //+1
                ProfileTextField = new JTextField[14]; //+1
                RedioGender = new JRadioButton[2];
                //ProfileSeparator = new JSeparator[3]; //-1


                ///

                ProfileLabel[0]= new JLabel("Name :");
                ProfileLabel[0].setForeground(Color.BLACK);
                ProfileLabel[0].setFont(new Font("", 0, 16));
                ProfileLabel[0].setBounds(15 , 50 , 90 , 23);

                ProfileTextField[0] = new JTextField();
                ProfileTextField[0].setBounds(107 , 50 ,90 ,23 );
                ProfileTextField[0].setEditable(false);
                ProfileTextField[1] = new JTextField();
                ProfileTextField[1].setBounds(200 , 50 ,90 ,23 ); //Name//
                ProfileTextField[1].setEditable(false);
                ProfileTextField[2] = new JTextField();
                ProfileTextField[2].setBounds(293 , 50 ,90 ,23 );
                ProfileTextField[2].setEditable(false);

                ///

                ProfileLabel[1]= new JLabel("ID :");
                ProfileLabel[1].setForeground(Color.BLACK);
                ProfileLabel[1].setFont(new Font("", 0, 16));
                ProfileLabel[1].setBounds(15 , 93 , 90 , 23);//Donor ID
                ProfileTextField[3] = new JTextField();
                ProfileTextField[3].setBounds(107 , 93 ,275 ,23 );
                ProfileTextField[3].setEditable(false);
                ProfileTextField[3].setEditable(false);

                ///

                ProfileLabel[2]= new JLabel("Blood Type :");
                ProfileLabel[2].setForeground(Color.BLACK);
                ProfileLabel[2].setFont(new Font("", 0, 16));
                ProfileLabel[2].setBounds(15 , 136 , 90 , 23);

                ProfileTextField[4] = new JTextField();
                ProfileTextField[4].setBounds(227 , 136 ,35 ,23 );
                ProfileTextField[4].setEditable(false);

                ///
                ProfileLabel[3]= new JLabel("Age :");
                ProfileLabel[3].setForeground(Color.BLACK);
                ProfileLabel[3].setFont(new Font("", 0, 16));
                ProfileLabel[3].setBounds(15 , 179 , 90 , 23);//Donor Age

                 ProfileTextField[5] = new JTextField();
                 ProfileTextField[5].setBounds(227 , 179 ,35 ,23 );  
                 ProfileTextField[5].setEditable(false);

                 ///

                ProfileLabel[4]=new JLabel("GENDER:");
                ProfileLabel[4].setForeground(Color.BLACK);
                ProfileLabel[4].setFont(new Font("", 0, 16));
                ProfileLabel[4].setBounds(15 , 222 , 140 , 23);

                ButtonGroup bG = new ButtonGroup();
                RedioGender[0] = new JRadioButton("Male" , true);
                RedioGender[0].setBounds(190 , 222 ,55 ,23 );
                RedioGender[1] = new JRadioButton("Female" );
                RedioGender[1].setBounds(245 , 222 ,70 ,23 );
                for(JRadioButton x :RedioGender ) { bG.add(x); x.setEnabled(false);}
                ProfilePanel.add( RedioGender[0]);
                 ProfilePanel.add( RedioGender[1]);
        //        ProfileTextField[6] = new JTextField();
        //        ProfileTextField[6].setBounds(190 , 222 ,50 ,23 );

                ////

                ProfileLabel[5]=new JLabel("Phone:");
                ProfileLabel[5].setForeground(Color.BLACK);
                ProfileLabel[5].setFont(new Font("", 0, 16));
                ProfileLabel[5].setBounds(15 , 265 , 140 , 23);

                ProfileTextField[6] = new JTextField();
                ProfileTextField[6].setBounds(107 , 265 ,275 ,23 );


                ///

                ProfileLabel[6]=new JLabel("Area :");
                ProfileLabel[6].setForeground(Color.BLACK);
                ProfileLabel[6].setFont(new Font("", 0, 16));
                ProfileLabel[6].setBounds(15 , 308 , 140 , 23);

                ProfileTextField[7] = new JTextField();
                ProfileTextField[7].setBounds(107 , 308 ,275 ,23 );

                ///

                ProfileLabel[7]=new JLabel("Birth Date :");
                ProfileLabel[7].setForeground(Color.BLACK);
                ProfileLabel[7].setFont(new Font("", 0, 16));
                ProfileLabel[7].setBounds(15 , 351 , 140 , 23);

                ProfileTextField[8] = new JTextField();
                ProfileTextField[8].setBounds(190 , 351 ,50 ,23 );
                ProfileTextField[9] = new JTextField();
                ProfileTextField[9].setBounds(243 , 351 ,35 ,23 ); //Appointment Date//
                ProfileTextField[10] = new JTextField();
                ProfileTextField[10].setBounds(281 , 351 ,35 ,23 );

                ////
                ProfileLabel[9]=new JLabel("Date Join :");
                ProfileLabel[9].setForeground(Color.BLACK);
                ProfileLabel[9].setFont(new Font("", 0, 16));
                ProfileLabel[9].setBounds(15 , 394 , 140 , 23);

                ProfileTextField[11] = new JTextField();
                ProfileTextField[11].setBounds(190 , 394 ,50 ,23 );
                ProfileTextField[11].setEditable(false);
                ProfileTextField[12] = new JTextField();
                ProfileTextField[12].setBounds(243 , 394 ,35 ,23 ); //Appointment Date//
                ProfileTextField[12].setEditable(false);
                ProfileTextField[13] = new JTextField();
                ProfileTextField[13].setBounds(281 , 394 ,35 ,23 );
                ProfileTextField[13].setEditable(false);

                ///
                ImageIcon PersonPic = new ImageIcon("");
                Image PersonPic1 = PersonPic.getImage().getScaledInstance(PersonPic.getIconWidth(), PersonPic.getIconHeight(),Image.SCALE_SMOOTH);
                ImageIcon PersonProfileImage = new ImageIcon(PersonPic1);
                ProfileLabel[8]=new JLabel(PersonProfileImage);
                ProfileLabel[8].setBounds(600 , 25 , 170 , 200);
                ProfileLabel[8].setBorder(BorderFactory.createLineBorder(Color.BLACK));

                ProfileButton[0] = new JButton("Add");
                ProfileButton[0].setBounds(600, 235, 65, 30);
                ProfileButton[1] = new JButton("Remove");
                ProfileButton[1].setBounds(685, 235, 80, 30);
              

                ///
                ProfileButton[2] = new JButton("Dispaly the History");
                ProfileButton[2].setBounds(325, 465, 150, 25);
                

                ProfileButton[3] = new JButton("Delete Account");
                ProfileButton[3].setBounds(690, 465, 100, 25);
               

                ProfileButton[4] = new JButton("Back");
                ProfileButton[4].setBounds(15, 465, 100, 25);
                ProfileButton[4].addActionListener( new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) 
                    {
                         ProfileHeader.setVisible(false);
                         ProfilePanel.setVisible(false);
                         test1.setVisible(true);
                         approveDonation.setVisible(true);
                        
                    }
                });

                for (JButton b2 : ProfileButton) 
                    {
                         ProfilePanel.add(b2); // Back , Update , Change Password
                    }

                    for(JLabel JL : ProfileLabel)
                    {
                        ProfilePanel.add(JL); // Labels
                    }
                    for(JTextField JTF : ProfileTextField)
                    {
                        ProfilePanel.add(JTF); // TextFeiled
                    }

                    
                            }
                        });
                       DrLogin.add(Conform);
                       ///
                       JButton bb = new JButton("Back");
                       bb.setBounds(20 , 465, 80 ,25);                      // Cancel , NExt , Clear Button
                       bb.addActionListener( new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent ae1) 
                            {
                               test1.setVisible(false);
                               approveDonation.setVisible(false);
                               NursePanel.setVisible(true);
                               NurseSys.setVisible(true);
                            }
                        });
                        test1.add(bb);
                       ///

                       add(test1);

            }
        });
        NurseSys.add(NewDonationButton);
        NurseSys.add(SearchButton);
        /////////////////////////////////////////////////////////
    }
    
    public static void main(String[] args) {
        NurseSystemGUImain a = new NurseSystemGUImain();
        a.setVisible(true);
        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
        a.setSize(1000, 628);
        a.setResizable(false);
    }
}

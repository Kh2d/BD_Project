package bd;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Profile extends JFrame{

    private JLabel nameLabel,idLabel,genderLabel,phoneLabel,areaLabel,BTLabel,dateLabel,ageLabel,CDLabel;
    private JTextField name,id,gender,phone,area,BT,date,age,CD;
    private JButton changePW,update,back;
    private JPanel p;
    
    public Profile() {
        super("Profile");
        
        setLayout(null);

        p = new JPanel();  
        p.setBounds(500, 0, 200, 500);
        p.setBackground(Color.yellow);
        p.setLayout(null); // if you delete this line, you wouldn't be able to adjust where to place the picture.    
        JLabel picLabel = new JLabel(); // creating the Jlabel.
        picLabel.setBounds(10, 10, 165, 165); // setting the bounds of the JLabel.
        p.add(picLabel); // adding the JLabel to the panel.
        ImageIcon Image1 = new ImageIcon(""); // the track of the picture 
        Image img1 = Image1.getImage(); // converting the ImageIcon to Image. 
        Image newImg1 = img1.getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), Image.SCALE_SMOOTH); // the important step which is for fitting the picture into the label.
        ImageIcon imageIc = new ImageIcon(newImg1); // finally, setting the image to the JLabel
        picLabel.setIcon(imageIc); // adding the picture into the JLabel (not sure lol).
        JButton home,profile,history,request,invitation,appointment;
        home = new JButton("Home");
        home.setBounds(40, 200, 120, 20);
        p.add(home);
        profile = new JButton("Profile");
        profile.setBounds(40, 240, 120, 20);
        p.add(profile);
        history = new JButton("History");
        history.setBounds(40, 280, 120, 20);
        p.add(history);
        request = new JButton("Requests");
        request.setBounds(40, 320, 120, 20);
        p.add(request);
        invitation = new JButton("Invitations");
        invitation.setBounds(40, 360, 120, 20);
        p.add(invitation);
        appointment = new JButton("Appointments");
        appointment.setBounds(40, 400, 120, 20);
        p.add(appointment);
        add(p);
        // JLabels
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(40, 60, 50, 20);
        add(nameLabel);
        idLabel = new JLabel("ID:");
        idLabel.setBounds(40, 100, 50, 20);
        add(idLabel);
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(40, 140, 50, 20);
        add(genderLabel);
        phoneLabel = new JLabel("Phone#:");
        phoneLabel.setBounds(40, 180, 50, 20);
        add(phoneLabel);
        areaLabel = new JLabel("Area:");
        areaLabel.setBounds(40, 220, 50, 20);
        add(areaLabel);
        BTLabel = new JLabel("Blood Type:");
        BTLabel.setBounds(40, 260, 80, 20);
        add(BTLabel);
        dateLabel = new JLabel("Date:");
        dateLabel.setBounds(40, 300, 50, 20);
        add(dateLabel);
        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(40, 340, 50, 20);
        add(ageLabel);
        CDLabel = new JLabel("Creation Date:");
        CDLabel.setBounds(40, 380, 80, 20);
        add(CDLabel);
        // JTextFields 
        name = new JTextField();
        name.setBounds(130, 60, 100, 20);
        add(name);
        id = new JTextField();
        id.setBounds(130, 100, 100, 20);
        add(id);
        gender = new JTextField();
        gender.setBounds(130, 140, 100, 20);
        add(gender);
        phone = new JTextField();
        phone.setBounds(130, 180, 100, 20);
        add(phone);
        area = new JTextField();
        area.setBounds(130, 220, 100, 20);
        add(area);
        BT = new JTextField();
        BT.setBounds(130, 260, 100, 20);
        add(BT);
        date = new JTextField();
        date.setBounds(130, 300, 100, 20);
        add(date);
        age = new JTextField();
        age.setBounds(130, 340, 100, 20);
        add(age);
        CD = new JTextField();
        CD.setBounds(130, 380, 100, 20);
        add(CD);
        // JButtons
        changePW = new JButton("Change Password");
        changePW.setBounds(80, 420, 150, 20);
        add(changePW);
        update = new JButton("Update");
        update.setBounds(300, 420, 80, 20);
        add(update);
        back = new JButton("Back");
        back.setBounds(400, 420, 80, 20);
        add(back);
        
        JLabel userIcon = new JLabel();
        userIcon.setBounds(300, 100, 165, 165);
        add(userIcon); 
        ImageIcon Image2 = new ImageIcon("");
        Image newImg2 = Image2.getImage().getScaledInstance(userIcon.getWidth(), userIcon.getHeight(), Image.SCALE_SMOOTH); 
        ImageIcon ImageIc2 = new ImageIcon(newImg2);
        userIcon.setIcon(ImageIc2);
        
        
    }
    public static void main(String args[]) 
   { 
       Profile p = new Profile();
       p.setVisible(true);
       p.setSize(700, 500);
       p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }

}

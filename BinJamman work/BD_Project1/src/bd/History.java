package bd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

//package bd;
//
//import javax.swing.*;
//import javax.swing.event.*;
//import java.awt.*;
//import java.awt.event.*;
public class History extends JFrame {

    private JLabel historyLabel;
    private JButton save;
    private JPanel p1, p2;
    private JScrollPane scrollp;
    private JTable table;

    public History() {
        super("History");

        setLayout(null);

        p1 = new JPanel();
        p1.setBounds(500, 0, 200, 500);
        p1.setBackground(Color.yellow);
        p1.setLayout(null); // if you delete this line, you wouldn't be able to adjust where to place the picture.    
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel picLabel = new JLabel(); // creating the Jlabel.
        picLabel.setBounds(10, 10, 165, 165); // setting the bounds of the JLabel.
        p1.add(picLabel); // adding the JLabel to the panel.
        ImageIcon Image1 = new ImageIcon(""); // the track of the picture 
        Image img1 = Image1.getImage(); // converting the ImageIcon to Image. 
        Image newImg1 = img1.getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), Image.SCALE_SMOOTH); // the important step which is for fitting the picture into the label.
        ImageIcon imageIc = new ImageIcon(newImg1); // finally, setting the image to the JLabel
        picLabel.setIcon(imageIc); // adding the picture into the JLabel (not sure lol).
        JButton home, profile, history, request, invitation, appointment;
        home = new JButton("Home");
        home.setBounds(40, 200, 120, 20);
        p1.add(home);
        profile = new JButton("Profile");
        profile.setBounds(40, 240, 120, 20);
        p1.add(profile);
        history = new JButton("History");
        history.setBounds(40, 280, 120, 20);
        p1.add(history);
        request = new JButton("Requests");
        request.setBounds(40, 320, 120, 20);
        p1.add(request);
        invitation = new JButton("Invitations");
        invitation.setBounds(40, 360, 120, 20);
        p1.add(invitation);
        appointment = new JButton("Appointments");
        appointment.setBounds(40, 400, 120, 20);
        p1.add(appointment);
        add(p1);

        p2 = new JPanel();
        p2.setBounds(0, 0, 500, 100);
        p2.setBackground(Color.white);
//        p2.setLayout(null);
        p2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        historyLabel = new JLabel("History");
        historyLabel.setFont(new Font("Georgia", Font.PLAIN, 22));
        historyLabel.setForeground(new Color(50, 50, 25));
        historyLabel.setBounds(250, 20, 50, 50);
        p2.add(historyLabel);
        add(p2);

        save = new JButton("Save");
        save.setBounds(220, 350, 80, 20);
        add(save);

        scrollp = new JScrollPane();
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        scrollp.setViewportView(table);
        scrollp.setBounds(50, 200, 400, 80);
        add(scrollp);
    }

    public static void main(String args[]) {
        History h = new History();
        h.setVisible(true);
        h.setSize(700, 500);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

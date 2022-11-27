import java.awt.Color;    //library
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

public class Credit implements ActionListener {

  //Deklarasi Button, label, dan frame
  JLabel background;
  JFrame frame = new JFrame();
  JButton Play = new JButton("Lets PLAY !!!");
  JButton Exit = new JButton("Back");
  
   Credit() {
    frame.setTitle("Credit"); // Buat title di frame

    //Set Frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1300, 750);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setVisible(true);

    Play.setBounds(1040, 650, 200, 40); //Set tata letak button play
    Play.setFocusable(false);
    Play.addActionListener(this);       // tambah Actionlistener

    Exit.setBounds(40, 650, 200, 40);   //Set tata letak button exit
    Exit.setFocusable(false);
    Exit.addActionListener(this);       // tambah Action Listener

    frame.add(Play); // tampilkan button
    frame.add(Exit);

    // icon frame
    frame.getContentPane().setBackground(new Color(0x123456)); // ganti warna background
    ImageIcon image = new ImageIcon("buat file icon image disini");        // buat ImageIcon
    frame.setIconImage(image.getImage());                      // set icon

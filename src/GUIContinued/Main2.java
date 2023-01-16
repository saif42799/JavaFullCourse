package GUIContinued;

import javax.swing.*;
import java.awt.*;

public class Main2 {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Saif4\\IdeaProjects\\OneLongMonth\\src\\GUIContinued\\thumbnail_1585454189754.jpg");


        JLabel label = new JLabel(); //create label
        label.setText("Bro, do you even code?");  //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00)); //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font color of text
        label.setIconTextGap(100); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //display background color

        //Frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        //add label
        frame.add(label);

    }
}

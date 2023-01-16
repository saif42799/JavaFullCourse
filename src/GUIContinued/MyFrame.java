package GUIContinued;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("JFrame Title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); // This set the x and y dimensions of the frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\Saif4\\IdeaProjects\\OneLongMonth\\src\\GUIContinued\\thumbnail_1585454189754.jpg"); //this will create an image icon
        this.setIconImage(image.getImage()); //change icon of frame

        this.getContentPane().setBackground(new Color(85,0,48)); //change color of background


    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
Author - Aryan Raj Wahi
Module - SCC 110 
Coursework - Checker's Game 
*/

public class board 
{
    //A panel is created
    private JPanel panel1 = new JPanel();
    private JFrame frame1 = new JFrame();//ceating frame
    private String[] picall;              //*********** 
    private JButton[] grid = new JButton[64]; //this will hold the 8*8 grid
    
    
    public board(){
        frame1.setTitle("Aryan's Checkers");
        picall = new String[] {"red.png","black.png"};

        for(int i = 0; i < 64; i++)
        {
            //creating an array for the image icons
            ImageIcon[] depictions;
            //initialising the grid
            grid[i]= new JButton();
            //grid connect with the pannel
            panel1.add(grid[i]); 

            if (i == 0) {
                grid[i].setIcon(new ImageIcon(picall[0]));
            }
            else if ((i/2)*2 == i) {
                grid[i].setIcon(new ImageIcon(picall[0]));

            }
            else {
                grid[i].setIcon(new ImageIcon(picall[1]));
            }

        }
    frame1.add(panel1); //the frame is added to the panel1
	panel1.setLayout(new GridLayout(8,8)); //the grid layout is made 3 by 4
	frame1.setContentPane(panel1); //updates the current layout of the panel1
	frame1.setSize(448,363); //sets the exact size of the program according to images
	frame1.setResizable(false); //makes it so the user can not resize the program
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program after it has been exited
	frame1.setVisible(true); //sets the frame to visible
    }



}
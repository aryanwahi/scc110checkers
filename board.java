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
    //The main frame is created.
    private JFrame Mainframe= new JFrame();
    //The main panel is created.
    private JPanel Mainpanel = new JPanel();
    //Array for the icons is created.
    private String[] depictions;  
    //Array Creation of buttons for the 8x8 grid
    private JButton[] Maingrid = new JButton[64]; 
    
    
    public board()
    {
        Mainframe.setTitle("Aryan's Checkers");
        depictions = new String[] {"white.png","black.png"};

        for(int i = 0; i < 64; i++)
        {
            //creating an array for the image icons
            ImageIcon[] picall;
            //initialising the grid
            Maingrid[i]= new JButton();
            //connecting the grid to the panel
            Mainpanel.add(Maingrid[i]); 
        for(int j = 0; j < 8; j++)
        {
         if ((j/2)*2 == j)
            {
                System.out.print("White");
                Maingrid[(i)].setIcon(new ImageIcon(depictions[0]));
            }
            else
            {
                System.out.print("Black");
                Maingrid[i].setIcon(new ImageIcon(depictions[1]));
            }
           
        }
        System.out.println("--");
        }
    //Resizing prohibited
    Mainframe.setResizable(false); 
    //terminates the program after it has been exited
    Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //sets the Mainframe to be visible
    Mainframe.setVisible(true);     
    //the Mainframe is added to the Mainpanel
    Mainframe.add(Mainpanel);
    //Grid layout is set to 8x8
    Mainpanel.setLayout(new GridLayout(8,8)); 
    //Changning layout of Mainpanel
    Mainframe.setContentPane(Mainpanel); 
    //Size of the Mainframe 
    Mainframe.setSize(500,500); 
 
    }



}
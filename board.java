import java.util.*;

import javax.swing.JButton;

import java.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*
Author - Aryan Raj Wahi
Module - SCC 110 
Coursework - Checker's Game 
*/

public class board implements ActionListener
{
    private JPanel panel1 = new JPanel();// creating panel
    private JFrame frame1 = new JFrame();//ceating frame
    private String[] picall;              //*********** 
    private JButton[] grid = new JButton[65]; //this will hold the 8*8 grid
    
    
    public movingchecks()   //method for checkers 
    {
        frame.setTitle("Aryan's Checker's");
        picall = new String[] {"red.png","red-king.png","black.png","black-king.png","empty","empty2.png","selected.png"};

        for(int haha=0;haha<65;haha++)
        {
            

        }
        

    }



}
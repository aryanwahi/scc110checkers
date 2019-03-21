import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
Author - Aryan Raj Wahi
Module - SCC 110 
Coursework - Checker's Game 
*/

public class Board implements ActionListener
{
    //The main frame is created.
    private JFrame Mainframe= new JFrame();
    //The main panel is created.
    private JPanel Mainpanel = new JPanel();
    //Array for the icons is created.
    private String[] depictions;  
    //Array Creation of squares for the 8x8 grid
    private Square[][] Maingrid = new Square[8][8]; 
    //declaring variables 
    
    public Board()
    {
        Mainframe.setTitle("Aryan's Checkers");
        
        // forloop for rows
        for(int i = 0; i < 8; i++) 
        {
            //creating an array for the image icons
            ImageIcon[] picall;
            //initialising the grid
            
            
        // forloop for columns   
        for(int j = 0; j < 8; j++)
        {
            JButton b=new JButton();
            //double dimensional array grid for buttons
            Maingrid[i][j]= new Square(b,i,j);
            //connecting grid to panel
            
            Maingrid[i][j].xyz.addActionListener(this); 
            //if statment for setting  image icon to either white or black
         if ((j+i)%2!=0)
            {
                Maingrid[i][j].setEmptyWhiteSquare(Maingrid[i][j].xyz);              //setting the empty icon
                //if statement for placing white piece icon
                if(i>=5 && i<8)      
                {
                            Maingrid[i][j].setWhitePiece(Maingrid[i][j].xyz);
                              //setting the white piece icon
                }
                //else if statement for placing red piece icon
                else if(i>=0 && i<3)
                {
                             //setting the red piece icon
                            Maingrid[i][j].setRedPiece(Maingrid[i][j].xyz);
                               
                }

            }
            else
            {
                Maingrid[i][j].xyz.setIcon(new ImageIcon("empty2.png"));             //setting the not empty icon
            }
            // each button should have an action listener so that is implemented
           Mainpanel.add(Maingrid[i][j].xyz);
        }//connecting the grid to the panel
        
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
    Mainframe.setSize(800,800); 



    }
        //initialising variables 
    private int  p=-1,q=-1,r=-1,s=-1;
    private boolean movement= true;

//defining a method for the movement of pieces, linking it to the actionlistner
@Override  // to do the moves consistently, everytime a new move starts
public void actionPerformed(ActionEvent Clickie)

 {  //aware of which button is clicked on now
     JButton button = (JButton)Clickie.getSource();

    //for statement for the rows
     for(int i = 0; i < 8; i++) 
     {   
        //for statment for the columns 
        for(int j = 0; j < 8; j++) 
        {  
            //if statement for checking which button is clicked and printing that
             if(button == Maingrid[i][j].xyz)
            {
                       {
                        if(movement==false)  // if this is true that, means a move is in progress
                        {
                            r=i;
                            s=j;
                            movement=true;
                            
                        }
                        else           // if this is true that, means a move is not in progress
                        {
                            p=i;
                            q=j;
                            movement=false;
                            
                        }

                       }
            }
        }
         
     }
     System.out.println(p+" "+q+" "+r+" "+s);
   // if statment for move on the board
   if(p!=-1 && q!=-1 && r!=-1 && s!=-1)
       { 
        //calling moveto function   
        moveTo(p,q,r,s);
      }
 } 
  int i,j;
 //method moveTo which shows current and desired position, switches position 
 public void moveTo(int xCurrent, int yCurrent,int xDesired,int yDesired)
 {   
       //if statement to check if the first click is a white piece
       if(Maingrid[xCurrent][yCurrent].checkForWhitePiece(Maingrid[xCurrent][yCurrent].xyz)==true) 
       {
        //if statement to check if it a valid move
        if(Maingrid[i][j].canMoveto(xCurrent, yCurrent, xDesired, yDesired)==true)
        {
         System.out.println("Check");
         //this is for setting the white piece      teleport
         Maingrid[xCurrent][yCurrent].setEmptyWhiteSquare(Maingrid[xCurrent][yCurrent].xyz);
         Maingrid[xDesired][yDesired].setWhitePiece(Maingrid[xDesired][yDesired].xyz);
        }
       }
       //if statement to check if the first click is a red piece
       else if(Maingrid[xCurrent][yCurrent].checkForRedPiece(Maingrid[xCurrent][yCurrent].xyz)==true)           
       {
        //if statement to check if it a valid move  
        if(Maingrid[i][j].canMoveto(xCurrent, yCurrent, xDesired, yDesired)==true)
        {
         System.out.println("Check2");
         //this is for setting the red piece        teleport
         Maingrid[xCurrent][yCurrent].setEmptyWhiteSquare(Maingrid[xCurrent][yCurrent].xyz);
         Maingrid[xDesired][yDesired].setRedPiece(Maingrid[xDesired][yDesired].xyz);
        }
       }
       
       //to restart the moves
       p=-1; q=-1; r=-1; s=-1;
 }




}
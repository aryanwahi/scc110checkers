import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Square
{
    int i, j;
    ImageIcon fire = new ImageIcon("empty.png");
    ImageIcon water = new ImageIcon("empty2.png");
    ImageIcon earth = new ImageIcon("red.png"); 
    ImageIcon sand = new ImageIcon("white.png"); 
    JButton xyz = new JButton();

    public Square(JButton didi, int i, int j)
    {
        //this keyword is used for the local variable, prevents override
        this.xyz=didi;  
        this.i=i;
        this.j=j;
    }

    //an accessor for white piece checking.
  public boolean checkForWhitePiece(JButton button)
  {
   //if statment for checking white piece   
  if(button.getIcon()==sand)
    //yellowlightup();
    // changeup();
    return true;

    else
  
    return false;
  }
  //mutator changes a square to a void square.
  public void setEmptyWhiteSquare(JButton button)
  {
   //sets to a empty white square   
   button.setIcon(fire);
  }
  //mutator to create a white piece
  public void setWhitePiece(JButton button)
  {
    //sets to a white piece  
    button.setIcon(sand);
  }

//an accessor for red piece checking
  public boolean checkForRedPiece(JButton button)
  {
  if(button.getIcon()==earth)
   
     return true;
     
     else

     return false;
   
  }
  //mutator to create a red piece
  public void setRedPiece(JButton button)
  {
    //sets to a red piece
    button.setIcon(earth);
  }

//method canMoveto which allows only legal move
public boolean canMoveto(int a,int b,int c,int d)
 {
    //if statement to check if the second click is a valid move
    if(a==c-1 && (b==d-1 || b==d+1))   //white, only moving to the diagonals
         {

           return true;

         }
    if(a==c+1 &&(b==d-1 || b==d+1))    //red, only moving to the diagonals
         {
        
           return true;
      
         }
          return false;
 }

}


   
  




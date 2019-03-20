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
    return true;
else
   return false;
  }
  //mutator changes a square to a void square.
  public void setWhite(JButton button)
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
} 


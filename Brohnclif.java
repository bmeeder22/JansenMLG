import java.awt.*;
/**
 * Write a description of class Brohnclif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brohnclif implements Element
{
    private int xCoord;
    private int yCoord;
    private Image pic;
    
    public Brohnclif(int x, int y)
    {
      xCoord = x;
      yCoord = y;
    }

    
    public int getXCoord()
    {
       return xCoord;
    }
    public int getYCoord()
    {
       return yCoord;
    }
    public Image getPicture()
    {
       return pic;
    }
    public void oneForward()
    {
       xCoord = xCoord-1;
    }
}

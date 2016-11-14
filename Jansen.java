import java.awt.*;

public class Jansen implements Element
{
    private int xCoord;
    private int yCoord;
    private Image pic;
    
    public Jansen(int x, int y)
    {
      xCoord = 0;
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
       
    }
    public void oneUp()
    {
       yCoord = yCoord+1;
    }
    public void oneDown()
    {
       yCoord = yCoord-1;
    }
}

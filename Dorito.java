import java.awt.*;
public class Dorito implements Element
{
    private int xCoord;
    private int yCoord;
    private Image pic;
    
    public Dorito(int x, int y)
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
       xCoord = xCoord+1;
    }
}


import java.awt.*;
import java.applet.Applet;
public class shapeapplet extends Applet
{
	public void paint(Graphics g)
{
		g.drawLine(10,20,50,60);
		g.drawRect(10,70,40,40);
		g.drawRect(10,120,70,40);
		g.drawOval(10,190,100,100);
      int xPoints[]= {250,320,170,250};
      int yPoints[]= {100,150,150,100};
      g.fillPolygon(xPoints,yPoints,4);
		
	}
}
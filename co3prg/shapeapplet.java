/*CO3PRG-4*/

import java.awt.*;
import java.applet.Applet;
public class shapeapplet extends Applet
{
	public void paint(Graphics g)
{
		g.drawLine(15,25,40,50);
		g.drawRect(10,70,50,40);
		g.drawRect(10,120,70,40);
		g.drawOval(5,190,100,100);
      int xPoints[]= {250,320,170,250};
      int yPoints[]= {100,150,150,100};
      g.fillPolygon(xPoints,yPoints,4);
		
	}
}
import java.applet.*;
import java.awt.*;
import java.util.*;

public class SHexaCarpetGon extends Applet{
	private Image display;
	private Graphics drawingArea;
	
	public void init()
	{
		int height = getSize().height;
		int width = getSize().width;
		display = createImage(width,height);
		drawingArea = display.getGraphics();
		drawGasket(0,0,width,drawingArea);
	}
	public void paint(Graphics g)
	{
		g.drawImage(display, 0, 0, null);
	}
	public void drawGasket(int x, int y, int side, Graphics g)
	{
		int sub = side/3;
		drawHexagon(x,y,side,g);
		if(sub >= 0)
		{
			drawGasket(x+sub,y,sub,g);//Top Middle
			drawGasket(x,y+sub,sub,g);//Middle left
			drawGasket(x+sub*2,y+sub,sub,g);//Middle right
			drawGasket(x+sub,y+sub*2,sub,g);//Bottom 
		}
	}
	private static void drawHexagon(int x, int y, int side, Graphics g)
	{
		int[] xS = {x,x+side/4,x+side*(3/4),x+side,x+side*3/4,x+side/4,x};
		int[] yS = {y+side/2,y,y,y+side/2,y+side,y+side,y+side/2};
		g.drawPolygon(xS, yS, xS.length);
	}
			
}

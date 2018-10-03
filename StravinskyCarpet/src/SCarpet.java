import java.applet.*;
import java.awt.*;
import java.util.*;
public class SCarpet extends Applet {
	private Image display;//Consider this the window..sort of
	private Graphics drawingArea;//Drawing tools
	
	public void init()//Called by applet
	{
		setSize(640,640);
		int height = getSize().height;
		int width = getSize().width;
		display = createImage(width, height);//Creates the window
		drawingArea = display.getGraphics();
		drawGasket(0,0,width,drawingArea);
	}
	public void paint(Graphics g)
	{
		g.drawImage(display, 0, 0, null);
	}
	public static void drawGasket(int x, int y, int side, Graphics g)
	{
		int sub = side/3;
		g.fillRect(x+sub, y+sub, sub, sub);
		if(sub >= 3)
		{
			//Top 3 squares
			drawGasket(x,y,sub,g);
			drawGasket(x+sub,y,sub,g);//Middle
			drawGasket(x+sub*2,y,sub,g);//Top right
			//Middle 2 squares
			drawGasket(x,y+sub,sub,g);//Mid Left
			drawGasket(x+sub*2,y+sub,sub,g);//Mid Right
			//Bottom 3 squares
			drawGasket(x,y+sub*2,sub,g);
			drawGasket(x+sub,y+sub*2,sub,g);//Middle
			drawGasket(x+sub*2,y+sub*2,sub,g);//Top right
		}
	}
}

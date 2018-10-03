import java.applet.*;
import java.awt.*;
import java.util.*;
public class StravinskyCarpet extends Applet {
	private Image display;
	private Graphics drawingArea;
	public void init()
	{
		setSize(640,640);
		int height = getSize().height;
		int width = getSize().width;
		display = createImage(width,height);
		drawingArea = display.getGraphics();
		drawGasket(0,0,width,drawingArea);
	}
	public void paint(Graphics g)
	{
		g.drawImage(display,0,0,null);
	}
	public static final int STOP = 4;
	public static void drawGasket(int x, int y, int side, Graphics g)
	{
		int sub = side/3;
		g.fillRect(x+sub, y+sub, sub, sub);
		if(sub >= STOP)
		{
			//TOp 3 Squares
			drawGasket(x,y,sub,g);//Top left
			drawGasket(x+sub,y,sub,g);//Top middle
			drawGasket(x+sub*2,y,sub,g);//Top Right
			//Middle 2 squares
			drawGasket(x,y+sub,sub,g);//Middle left
			drawGasket(x+sub*2,y+sub,sub,g);//Middle Right
			//Bottom 3 squares
			drawGasket(x,y+sub*2,sub,g);//Bottom left
			drawGasket(x+sub,y+sub*2,sub,g);//Bottom middle
			drawGasket(x+sub*2,y+sub*2,sub,g);//Bttom right
		}
	}
}

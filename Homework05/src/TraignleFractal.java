import java.applet.*;
import java.awt.*;
import java.util.*;
public class TraignleFractal extends Applet {
	private Image display;
	private Graphics drawingArea;
	
	private static Color WHITE = new Color(255, 255, 255);
	private static Color BLACK = new Color(0,0,0);
	
	public void init()
	{
		setSize(640,640);
		int height = getSize().height;
		int width = getSize().width;
		display = createImage(width, height);//Creates the window
		drawingArea = display.getGraphics();
		drawTriangle1(0,0,width,drawingArea);
		drawFractal(0,0,width,drawingArea);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(display, 0, 0, null);
	}
	
	//Draws the background triangle that is right-side up
	public static void drawTriangle1(int x, int y, int side, Graphics g)
	{
		int sub = side/2;
		int[] xS = {x,x+side/2,x+side};
		int[] yS = {y+side,y,y+side};
		g.setColor(BLACK);
		g.fillPolygon(xS, yS, xS.length);
	}
	
	//Recursive method to continue drawing upside-down triangles
	public static void drawFractal(int x, int y, int side, Graphics g)
	{
		int sub = side/2;
		drawTriangleUpsideDown(x,y,side,g);
		if(sub>20)
		{
			drawFractal(x,y+sub,sub,g);//Left triangle
			drawFractal(x+sub/2,y,sub,g);//Middle Triangle
			drawFractal(x+sub,y+sub,sub,g);//Right Triangle
		}
	}
	
	//Draws upside-down Triangles
	public static void drawTriangleUpsideDown(int x, int y, int side, Graphics g)
	{
		int[] xS = {x+side/4,x+side/2,x+side*3/4};
		int[] yS = {y+side/2,y+side,y+side/2};
		g.setColor(WHITE);
		g.fillPolygon(xS, yS, xS.length);
	}
}

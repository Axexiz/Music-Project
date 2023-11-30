package pkg;
import ryanguru.ColorDisplay;

public class Attributes {


	public void Linebar(int y1, int x1, int y2,String color)
	{	

			for(int i=0;i<= y2-y1;i++)
			{
				ColorDisplay.setPixelColor(y2-i, x1,color );
			}
		
		ColorDisplay.pause(15);
			for(int i=0;i<=y2-y1;i++)
			{
				ColorDisplay.setPixelOFF(y2-i, x1);
				ColorDisplay.pause(15);
			}
	}
	
	public void LinecoordinateAni(int y1, int x1, int y2, int x2,int r,int g,int b,double t)
	{	
		
		
		double m = (y2-y1)/(x2-x1);
		for(int i = 0;i<=x2-x1;i++)
		{
			int x =  x1 + i;
			int c = (int) (y2-(m*x2));
			int y = (int) (m*x + c);
			ColorDisplay.setPixelColorRGB(y, x, r, g, b);
			ColorDisplay.pause(t);
		}
		ColorDisplay.pause(50);
		for(int i = 0;i<=x2-x1;i++)
		{
			int x =  x1 + i;
			int c = (int) (y2-(m*x2));
			int y = (int) (m*x + c);
			ColorDisplay.setPixelOFF(y, x);
			ColorDisplay.pause(t);
		}
	}
	
	public void LinecoordinateAni2(int y1, int x1, int y2, int x2,int r,int g,int b,double t)
	{	

		
		double m = (y2-y1)/(x2-x1);
		for(int i = 0;i<=x2-x1;i++)
		{
			int x =  x2 - i;
			int c = (int) (y2-(m*x2));
			int y = (int) (m*x + c);
			ColorDisplay.setPixelColorRGB(y, x, r, g, b);
			ColorDisplay.pause(t);
		}
		
		ColorDisplay.pause(50);
		double m2 = (y2-y1)/(x2-x1);
		for(int i = 0;i<=x2-x1;i++)
		{
			int x =  x2 - i;
			int c = (int) (y2-(m2*x2));
			int y = (int) (m2*x + c);
			ColorDisplay.setPixelOFF(y, x);
			ColorDisplay.pause(t);
		}
	}
	
	public void LinecoordinateAni3(int y1, int x1, int y2, int x2,int r,int g,int b,double t)
	{	

		
		double m = (y2-y1)/(x2-x1);
		for(int i = 0;i<=x1-x2;i++)
		{
			int x =  x1 - i;
			int c = (int) (y2-(m*x2));
			int y = (int) (m*x + c);
			ColorDisplay.setPixelColorRGB(y, x, r, g, b);
			ColorDisplay.pause(t);
		}
		
		ColorDisplay.pause(50);
		for(int i = 0;i<=x1-x2;i++)
		{
			int x =  x1 - i;
			int c = (int) (y2-(m*x2));
			int y = (int) (m*x + c);
			ColorDisplay.setPixelOFF(y, x);
			ColorDisplay.pause(t);
		}
	}
	
	public void SquarecoordinateRGB(int r1, int c1, int r2, int c2, int R, int G, int B,int t,int t2)
	{
		for(int i = 0;i<=r2-r1;i++)
		{
			for(int b=0;b<=c2-c1;b++)
			{
			int y = r1 + i;
			int x = c1 + b;
			ColorDisplay.setPixelColorRGB(y, x, R, G, B);
			ColorDisplay.pause(t);
			}
			ColorDisplay.pause(t2);
		}
	}
	
	public void tortisebody()
	{
		SquarecoordinateRGB(7,17-1,8,18-1,159,227,51,30,0);
		SquarecoordinateRGB(8,17-1,8,22-1,159,227,51,30,0);
		SquarecoordinateRGB(7,21-1,7,22-1,159,227,51,30,0);
		SquarecoordinateRGB(9,23-1,12,24-1,159,227,51,30,0);
		SquarecoordinateRGB(10,25-1,11,25-1,159,227,51,30,0);
	}
	
	public void tortiseshell()
	{
		SquarecoordinateRGB(9,15,9,21,30,181,105,30,0);
		SquarecoordinateRGB(10,16,10,21,30,181,105,30,0);
		SquarecoordinateRGB(11,16,11,21,30,181,105,30,0);
		SquarecoordinateRGB(12,17,12,20,30,181,105,30,0);
		SquarecoordinateRGB(13,18,13,19,30,181,105,30,0);
	}
	
	public void LinecoordinateAni4(int y1, int x1, int y2, int x2,int r,int g,int b,double t)
	{	
		
		
		double m = (y2-y1)/(x2-x1);
		for(int i = 0;i<=x2-x1;i++)
		{
			int x =  x1 + i;
			int c = (int) (y2-(m*x2));
			int y = (int) (m*x + c);
			ColorDisplay.setPixelColorRGB(y, x, r, g, b);
			ColorDisplay.pause(t);
		}
	}
	
	public void Linepattern2(int r, int g, int b)
	{ 
		LinecoordinateAni4(17,0,19,2,r,g,b,210);
		LinecoordinateAni4(11,0,19,8,r,g,b,105);
		LinecoordinateAni4(5,0,19,14,r,g,b,105);
		LinecoordinateAni4(0,1,19,20,r,g,b,105);
		LinecoordinateAni4(0,7,6,13,r,g,b,160);
		LinecoordinateAni4(15,22,19,26,r,g,b,140);
		LinecoordinateAni4(0,13,3,16,r,g,b,122);
		LinecoordinateAni4(12,25,19,32,r,g,b,140);
		LinecoordinateAni4(0,19,19,38,r,g,b,105);
		LinecoordinateAni4(0,25,14,39,r,g,b,134);
		LinecoordinateAni4(0,31,8,39,r,g,b,138);
		LinecoordinateAni4(0,37,2,39,r,g,b,205); 
	}
	
	public void Linepattern3(int r, int g, int b)
	{ 
		LinecoordinateAni4(19,37,17,39,r,g,b,210);
		LinecoordinateAni4(19,31,11,39,r,g,b,105);
		LinecoordinateAni4(19,25,5,39,r,g,b,105);
		LinecoordinateAni4(19,19,0,38,r,g,b,105);
		LinecoordinateAni4(19,13,15,17,r,g,b,160);
		LinecoordinateAni4(6,26,0,32,r,g,b,140);
		LinecoordinateAni4(19,7,12,14,r,g,b,122);
		LinecoordinateAni4(3,23,0,26,r,g,b,140);
		LinecoordinateAni4(19,1,0,20,r,g,b,105);
		LinecoordinateAni4(14,0,0,14,r,g,b,134);
		LinecoordinateAni4(8,0,0,8,r,g,b,138);
		LinecoordinateAni4(2,0,0,2,r,g,b,205);
	}
	
	public void Lineclear1(int y1,int x1, int y2, int x2,String color, int t)
	{
		for(int i=0;i<=y2-y1;i++)
		{
			for(int b=0;b<=x2-x1;b++)
			{
				int x = x1 + b;
				int y = y1 + i;
				ColorDisplay.setPixelColor(y, x, color);
			}
			ColorDisplay.pause(t);
		}
		ColorDisplay.pause(50);
		for(int i=0;i<=y2-y1;i++)
		{
			for(int b=0;b<=x2-x1;b++)
			{
				int x = x1 + b;
				int y = y1 + i;
				ColorDisplay.setPixelOFF(y,x);
			}
			ColorDisplay.pause(t);
		}
	}
	
	public void Lineclear2(int y1,int x1, int y2, int x2,String color, int t)
	{
		for(int i=0;i<=y2-y1;i++)
		{
			for(int b=0;b<=x2-x1;b++)
			{
				int x = x1 + b;
				int y = y2 - i;
				ColorDisplay.setPixelColor(y, x, color);
			}
			ColorDisplay.pause(t);
		}
		ColorDisplay.pause(50);
		for(int i=0;i<=y2-y1;i++)
		{
			for(int b=0;b<=x2-x1;b++)
			{
				int x = x1 + b;
				int y = y2 - i;
				ColorDisplay.setPixelOFF(y, x);
			}
			ColorDisplay.pause(t);
		}
	}
}


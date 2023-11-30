package pkg;

import ryanguru.ColorDisplay;

//In this class, there are classes that inherits the Attribute class to perform similar sets of tasks as there are attributes that are repeated.
//This is to save lines such that my code wont be very long and repeated.

public class Threading extends Thread {
public void run()
	{
		loopingwave(15);
	}
//This static void is similar to the Singraph in mycode. The only difference is that it has a loop statement that removes the previous coordinates of the entire singraph.
//there is also a for loop in the amplitude to animate the amplitude moving.
public static void Sinwave(int r,int g,int b)
{
	double vertshift = 10, 
	period = 0.2;
	

	int [] col = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
	
	for(double D=-5.4;D<=5.4;D=D + 1)
	{
	for(int i=0;i<col.length;i=i+1) 
	{

		double sin = (Math.sin(period*(col[i]-1)))  ;
		int y = (int) ((double)  D*sin + vertshift);

		ColorDisplay.setPixelColorRGB(y, col[i], r, g, b);
		}
	
	ColorDisplay.pause(35);
	for(int i=0;i<col.length;i=i+1) 
	{

		double sin = (Math.sin(period*(col[i]-1)))  ;
		int y = (int) ((double)  D*sin + vertshift);
		ColorDisplay.setPixelOFF(y, col[i]);
	}
	}
	}
//This method is the same as Sinwave2 but it starts off at the opposite amplitude than that of sinwave to make the looping of the sinwave look smoother.
public static void Sinwave2(int r,int g,int b)
{
	double vertshift = 10, 
	period = 0.2;
	

	int [] col = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
	
	for(double D=5.4;D>=-5.4;D--)
	{
	for(int i=0;i<col.length;i=i+1) 
	{

		double sin = (Math.sin(period*(col[i]-1)))  ;
		int y = (int) ((double)  D*sin + vertshift);

		ColorDisplay.setPixelColorRGB(y, col[i], r, g, b);
		}
	
	ColorDisplay.pause(35);
	for(int i=0;i<col.length;i=i+1) 
	{

		double sin = (Math.sin(period*(col[i]-1)))  ;
		int y = (int) ((double)  D*sin + vertshift);
		ColorDisplay.setPixelOFF(y, col[i]);
	}
	}
	}
//x amount is the amopunt of times this pattern is repeated. 
public static void loopingwave(int x)
{
	for(int i=0;i<=x;i++)
	{
		Sinwave2(50,0,100);
		Sinwave(50,0,100);
	}
}
}

//These threads will call for Linepattern 2 and 3 and in the run statement, it will require you to put in the rgb coordinates.
class threading2 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linepattern2(255,209,204);
	}
}

class threading3 extends Thread
{	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linepattern3(255,204,229);
	}
}

//These methods inherit the tortisebody and tortiseshell attributes which uses the squarecoordinateRGB method to animate the different parts of the body
class threading5 extends Thread
{Attributes attri = new Attributes();
	public void run()
	{
		attri.tortisebody();
	}
}

class threading6 extends Thread
{Attributes attri = new Attributes();
	public void run()
	{
		attri.tortiseshell();
	}
}

//These are the different lines of pattern that i used during the turtle animation. It uses the Linecoordinate method and i animate the method to disappear overtime.
//these patterns will be repeated based on the beat count. It is from threading 7 till threading18.
class threading7 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni(0,0,5,5,255,255,255,25);
	}
}

class threading8 extends Thread
{	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni(0,1,3,4,255,255,255,40);
	}
}

class threading9 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni(1,0,4,3,255,255,255,40);
	}
}

class threading10 extends Thread
{Attributes Attri = new Attributes(); 
	public void run()
	{
		Attri.LinecoordinateAni(19,0,14,5,255,255,255,25);
	}
}

class threading11 extends Thread
{Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni(19,1,16,4,255,255,255,40);
	}
}

class threading12 extends Thread
{ Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni(18,0,15,3,255,255,255,40);
	}
}

class threading13 extends Thread
{ Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni2(14,34,19,39,255,255,255,25);
	}
}

class threading14 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni2(15,36,18,39,255,255,255,40);
	}
	
}

class threading15 extends Thread
{ Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni2(16,35,19,38,255,255,255,40);
	}
}

class threading16 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni3(0,39,5,34,255,255,255,25);
	}
	
}

class threading17 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni3(1,39,4,36,255,255,255,40);
	}
}

class threading18 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.LinecoordinateAni3(0,38,3,35,255,255,255,40);
	}
}

							//Turtle legs animation
class threading19 extends Thread
{
	public void run()
	{
		loopTurtleLeg1(10);
	}
	//I use ColorDisplay.setPixelColor(y, x-2, "GRAY"); AND ColorDisplay.setPixelColor(y, x+2, "GRAY"); to ensure that the legs are moving and no additional colors are obstructing the way of the legs
		public static void LinecoordinateAni(int y1, int x1, int y2, int x2,int r,int g,int b)
		{	
			
			double m = (y2-y1)/(x2-x1);
			for(int i = 0;i<=x2-x1;i++)
			{
				int x =  x1 + i;
				int c = (int) (y2-(m*x2));
				int y = (int) (m*x + c);
				ColorDisplay.setPixelColorRGB(y, x, r, g, b);
				ColorDisplay.setPixelColor(y, x-2, "GRAY");
				ColorDisplay.setPixelColor(y, x+2, "GRAY");
			}
			
		}
		//Im looping the leg by x times. based on what i put on x, thats the amount of times it loops.
	public static void loopTurtleLeg1(int x)
	{
		for(int i = 0;i<=x;i++)
		{
			
			LinecoordinateAni(7,20,7,21,159,227,51);
			ColorDisplay.pause(300);
			LinecoordinateAni(7,22,7,23,159,227,51);
			ColorDisplay.pause(300);
			LinecoordinateAni(7,20,7,21,159,227,51);
			ColorDisplay.pause(300);
		}
	}
}

// the same applies for threading 20 but it is at a different coordinate compared to threading19
class threading20 extends Thread
{
	public void run()
	{
		loopTurtleLeg2(10);
	}
		public static void LinecoordinateAni(int y1, int x1, int y2, int x2,int r,int g,int b)
		{	
			
			double m = (y2-y1)/(x2-x1);
			for(int i = 0;i<=x2-x1;i++)
			{
				int x =  x1 + i;
				int c = (int) (y2-(m*x2));
				int y = (int) (m*x + c);
				ColorDisplay.setPixelColorRGB(y, x, r, g, b);
				ColorDisplay.setPixelColor(y, x-2, "GRAY");
				ColorDisplay.setPixelColor(y, x+2, "GRAY");
			}
			
		}
	public static void loopTurtleLeg2(int x)
	{
		for(int i = 0;i<=x;i++)
		{
			
			LinecoordinateAni(7,16,7,17,159,227,51);
			ColorDisplay.pause(300);
			LinecoordinateAni(7,14,7,15,159,227,51);
			ColorDisplay.pause(300);
			LinecoordinateAni(7,16,7,17,159,227,51);
			ColorDisplay.pause(300);
			
		}
	}
}

//LINE CORNER ANIMATION

class threading21 extends Thread //This is for printing the line animation
{
	public void run()
	{//create a for loop to repeat the same animation multiple times 
		for(int i=0;i<=4;i++)
		{
		CornerLineAni1();
		}
	}
	public  static void CornerLineAni1()
	{
		int [] row = {15,16,17,18,19  ,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19  ,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] col = {39,39,39,39,39  ,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,39  ,39,39,39,39,39,39,39,39,39,39,39,39,39,39};
		for(int i=0; i<row.length;i++)
		{
			ColorDisplay.setPixelColorRGB(row[i], col[i], 50, 0, 100);
			ColorDisplay.pause(25);
		}
	}
}

class threading22 extends Thread //This is for offing the line animation. during the offing animation, my for loop is row.length-1 because when the animation is done
								// I dont want it to completely remove everything, i want it to leave at least 1 dot so that it can transition into the next pattern.
{
	public void run()
	{
		//create a for loop to repeat the same animation multiple times 
		ColorDisplay.pause(400);
		for(int i = 0;i<=4;i++)
		{
		CornerLineAniOFF1();
		}
	}
	public  static void CornerLineAniOFF1()
	{
		int [] row = {15,16,17,18,19  ,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19  ,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] col = {39,39,39,39,39  ,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,39  ,39,39,39,39,39,39,39,39,39,39,39,39,39,39};
		
		for(int i=0; i<row.length-1;i++)
		{
			ColorDisplay.setPixelOFF(row[i], col[i]);
			ColorDisplay.pause(25);
		}
	}
}

class threading23 extends Thread
{
	public void run ()
	{//create a for loop to repeat the same animation multiple times 
		for(int i =0;i<=4;i++)
		{
		CornerLineAni2();
		}
	}
	
	public static void CornerLineAni2()//This is for printing the line animation
	{
		int [] row = {10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19  ,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19  ,18,17,16,15,14,13,12,11,10};
		int [] col = {0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,39  ,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39  ,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColorRGB(row[i], col[i], 50, 0, 100);
			ColorDisplay.pause(25);
		}
	}
}

class threading24 extends Thread
{
	public void run ()
	{//create a for loop to repeat the same animation multiple times 
		ColorDisplay.pause(400);
		for(int i=0;i<=4;i++)
		{
		CornerLineAniOFF2();
		}
	}
	
	public static void CornerLineAniOFF2()//This is for printing the line animation.
	{
		int [] row = {10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19  ,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19  ,18,17,16,15,14,13,12,11,10};
		int [] col = {0,0,0,0,0,0,0,0,0,0,0  ,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,39  ,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39  ,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0  ,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<row.length-1;i++)
		{
			ColorDisplay.setPixelOFF(row[i], col[i]);
			ColorDisplay.pause(25);
		}
	}
}

//This section is to do the beat bars
class threading25 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,5,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading26 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,6,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading27 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,7,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading28 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,8,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading29 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,9,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading30 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,10,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading31 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,11,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading32 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,12,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading33 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,13,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading34 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,14,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading35 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,15,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading36 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,16,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading37 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,17,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading38 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,18,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading39 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,19,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading40 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,20,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading41 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,21,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading42 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,22,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading43 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,23,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading44 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,24,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading45 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,25,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading46 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,26,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading47 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,27,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading48 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,28,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading49 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,29,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading50 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,30,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading51 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,31,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading52 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,32,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading53 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,33,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}
class threading54 extends Thread
{
	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Linebar(0,34,ColorDisplay.randomRow(),ColorDisplay.randomColor());
	}
}

						//Televsion off effect
class threading55 extends Thread
{	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Lineclear1(0,0,9,39, "WHITE",10);
	}
}

class threading56 extends Thread
{	Attributes Attri = new Attributes();
	public void run()
	{
		Attri.Lineclear2(10,0, 19, 39,"WHITE", 10);
	}
}

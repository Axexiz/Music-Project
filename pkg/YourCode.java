package pkg;
import ryanguru.ColorDisplay;

public class YourCode
{				
	//THESE ARE THE RANGE OF ALPHABETES USED. i added in a vertical and horizontal shift so that if i were to 
	//change my aspect ratio of the screen, i can change the text positioning as i see fit. i also set another variable
	// String called color to change the specific colors.
	public static void Array_A(int VertShift,int HoriShift,String color)
	{
		
	int [] row = {0,1,2,3,4,4,3,2,1,0,2,2};
	int [] col = {0,0,0,0,1,2,3,3,3,3,1,2};
	
	for(int i=0;i<row.length;i++)
	{
		ColorDisplay.setPixelColor(row[i]+VertShift, col[i]+HoriShift, color);
	}
	
	}
	
	public static void Array_Y(int VertShift,int HoriShift,String color)
	{
		int[] row = {4,3,2,1,0,3,4};
		int[] col = {0,1,2,2,2,3,4};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift, col[i]+HoriShift, color);
		}
	} 
	
	public static void Array_U(int VertShift,int HoriShift,String color)
	{
		int[] row = {4,3,2,1,0,0,1,2,3,4};
		int[] col = {0,0,0,0,1,2,3,3,3,3};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift,col[i]+HoriShift , color);
		}
	}

	public static void Array_J(int VertShift,int HoriShift,String color)
	{
		int[] row = {4,4,4,3,2,1,0,1};
		int[] col = {1,2,3,2,2,2,1,0};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift,col[i]+HoriShift , color);
		}
	}
	
	public static void Array_I(int VertShift,int HoriShift,String color)
	{
		int[] row = {4,4,4,3,2,1,0,0,0};
		int[] col = {0,1,2,1,1,1,0,1,2};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift,col[i]+HoriShift , color);
		}
	}
	
	public static void Array_E(int VertShift,int HoriShift,String color)
	{
		int[] row = {4,4,4,3,2,2,2,1,0,0,0};
		int[] col = {0,1,2,0,0,1,2,0,0,1,2};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift,col[i]+HoriShift , color);
		}
	}
	
	public static void Array_P(int VertShift, int HoriShift, String color)
	{
		int [] row = {0,1,2,3,4,4,4,3,2,2};
		int [] col = {0,0,0,0,0,1,2,2,2,1};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+ VertShift, col[i]+HoriShift, color);
		}
	}
	
	public static void Array_R(int VertShift, int HoriShift, String color)
	{
		int [] row = {0,1,2,3,4,4,4,3,2,1,0};
		int [] col = {0,0,0,0,0,1,2,2,1,2,3};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift, col[i]+HoriShift, color);		
		}
		
	}
	
	public static void Array_S(int VertShift, int HoriShift, String color)
	{
		int [] row = {0,0,1,2,3,4,4};
		int [] col = {0,1,2,1,0,1,2};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift,col[i]+HoriShift, color);
		}
	}
	
	public static void Array_N(int VertShift, int HoriShift, String color)
	{
		int [] row = {0,1,2,3,4,3,2,1,0,1,2,3,4};
		int [] col = {0,0,0,0,0,1,2,3,4,4,4,4,4};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift, col[i]+HoriShift, color);
		}
	}

	public static void Array_T(int VertShift, int HoriShift, String color)
	{
		int [] row = {4,4,4,4,4,3,2,1,0};
		int [] col = {0,1,2,3,4,2,2,2,2};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift, col[i]+HoriShift, color);
		}
	}
// I added pause statements for these specific letters to animate the color changes.
	public static void Array_V_ani(int VertShift, int HoriShift, String color)
	{
		int [] row = {4,3,2,1,0,1,2,3,4};
		int [] col = {0,1,2,3,4,5,6,7,8};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift, col[i]+HoriShift, color);
			ColorDisplay.pause(55);
		}
	}
	
	public static void Array_E_ani(int VertShift,int HoriShift,String color)
	{
		int[] row = {4,4,4,3,2,2,2,1,0,0,0};
		int[] col = {0,1,2,0,0,1,2,0,0,1,2};
		for(int i=0;i<row.length;i++)
		{
			ColorDisplay.setPixelColor(row[i]+VertShift,col[i]+HoriShift , color);
			ColorDisplay.pause(55);
		}
	}
	
	
				//THESE ARE THE WORDS I AM GOING TO FORM
	public static void YUJIE()
	{
		Array_Y(7,9,"WHITE");
		Array_U(4,13,"WHITE");
		Array_J(7,18,"WHITE");
		Array_I(4,22,"WHITE");
		Array_E(5,26,"WHITE");
		ColorDisplay.pause(1000);
		ColorDisplay.setScreenOFF();
	}
	
	public static void PRESENTS()
	{
		Array_P(7,2,"PINK");
		Array_R(8,6,"PINK");
		Array_E(5,11,"PINK");
		Array_S(7,15,"PINK");
		Array_E(6,19,"PINK");
		Array_N(8,24,"PINK");
		Array_T(7,30,"PINK");
		Array_S(5,35,"PINK");
		ColorDisplay.pause(1000);
		ColorDisplay.setScreenOFF();
	}
	
	//the reason why i said presents eve is because EVE is the artist of this song and i want to showcase his song to you through this project.
	public static void EVE()
	{
		Array_E_ani(6,5,"WHITE");
		Array_V_ani(6,15,"PINK");
		Array_E_ani(6,31,"WHITE");
	}
	
				//THE COLOR ANIMATION AT THE START
	public static void EVEColor()
	{
		Array_E_ani(6,5,"RED");
		Array_V_ani(6,15,"GREEN");
		Array_E_ani(6,31,"BLUE");
		Array_E_ani(6,5,"PURPLE");
		Array_V_ani(6,15,"BLACK");
		Array_E_ani(6,31,"WHITE");
		Array_E_ani(6,5,"ORANGE");
		Array_V_ani(6,15,"PURPLE");
		Array_E_ani(6,31,"GREEN");
		Array_E_ani(6,5,"PINK");
		Array_V_ani(6,15,"WHITE");
		Array_E_ani(6,31,"PINK");
		Array_E_ani(6,5,"BLACK");
		Array_V_ani(6,15,"PURPLE");
		Array_E_ani(6,31,"BLACK");
		Array_E_ani(6,5,"WHITE");
		Array_V_ani(6,15,"GREEN");
		Array_E_ani(6,31,"BLUE");
		Array_E_ani(6,5,"BLUE");
		Array_V_ani(6,15,"PURPLE");
		Array_E_ani(6,31,"WHITE");
		Array_E_ani(6,5,"ORANGE");
		Array_V_ani(6,15,"PINK");
		ColorDisplay.pause(2800);
		ColorDisplay.setScreenOFF();	
	}
	
	// when i call the arrays, i call them from side by side rather than a straight line to manipulate the eyes into thinking
	//that the 2 straight lines are displaying simultaneously on accord to the beat detected.
	public static void line_ani(String color)
	{
		int [] r = {3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12,3,12};
		int [] c = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,20,20,21,21,22,22,23,23,24,24,25,25,26,26,27,27,28,28,29,29,30,30,31,31,32,32,33,33,34,34,35,35,36,36,37,37,38,38,39,39};
		for(int l=0;l<r.length;l++)
		{
			ColorDisplay.setPixelColor(r[l], c[l], color);
			ColorDisplay.pause(1);
		}
		ColorDisplay.pause(5);
		
		for(int l=0;l<r.length;l++)
		{
			ColorDisplay.setPixelOFF(r[l],c[l]);
			ColorDisplay.pause(1);
		}
		}
	// Similar to the Line_ani public void, the arrays are being called side by side to fill up 1/3 of the entire screen
	public static void bar_animation(String color)
	{
		
		int [] row = {
	0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,
	0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,
	0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,
	0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,
	0,0,1,1,2,2,3,3,4,4,5,5,6,6, 7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,18,19,19,

	};


		int [] col = {
	4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,4,35,
	3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,3,36,
	2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,2,37,
	1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,
	0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,
	};
		for(int i=0; i<row.length;i++)
	{
		ColorDisplay.setPixelColor(row[i], col[i], color);
		ColorDisplay.pause(1);
	}
		ColorDisplay.pause(15000);
		ColorDisplay.setScreenOFF();
	} 
	//While the bar animation has finished its animation and stopped, the beat_bars will take over and 
	//call up to 29 sets of threads simultaneously and each thread's row will be called randomly with a random color as well
	//the method can be seen under the Attributes class for Linebar which utilizes randomcolordisplay and randomrow.
	// The columns remain the same which is why under Linebar, it only has one variable for the column.
	public static void beat_bars()
	{
		threading25 thread25 = new threading25();
		threading26 thread26 = new threading26();
		threading27 thread27 = new threading27();
		threading28 thread28 = new threading28();
		threading29 thread29 = new threading29();
		threading30 thread30 = new threading30();
		threading31 thread31 = new threading31();
		threading32 thread32 = new threading32();
		threading33 thread33 = new threading33();
		threading34 thread34 = new threading34();
		threading35 thread35 = new threading35();
		threading36 thread36 = new threading36();
		threading37 thread37 = new threading37();
		threading38 thread38 = new threading38();
		threading39 thread39 = new threading39();
		threading40 thread40 = new threading40();
		threading41 thread41 = new threading41();
		threading42 thread42 = new threading42();
		threading43 thread43 = new threading43();
		threading44 thread44 = new threading44();
		threading45 thread45 = new threading45();
		threading46 thread46 = new threading46();
		threading47 thread47 = new threading47();
		threading48 thread48 = new threading48();
		threading49 thread49 = new threading49();
		threading50 thread50 = new threading50();
		threading51 thread51 = new threading51();
		threading52 thread52 = new threading52();
		threading53 thread53 = new threading53();
		threading54 thread54 = new threading54();
		
		thread25.start();
		thread26.start();
		thread27.start();
		thread28.start();
		thread29.start();
		thread30.start();
		thread31.start();
		thread32.start();
		thread33.start();
		thread34.start();
		thread35.start();
		thread36.start();
		thread37.start();
		thread38.start();
		thread39.start();
		thread40.start();
		thread41.start();
		thread42.start();
		thread43.start();
		thread44.start();
		thread45.start();
		thread46.start();
		thread47.start();
		thread48.start();
		thread49.start();
		thread50.start();
		thread51.start();
		thread52.start();
		thread53.start();
		thread54.start();
	}
	//Once the beat_bars have finished, the screen will be offed and the dotanimation will be called from coordinates (0,19) 
	// to coordinates (18,19). Everytime it calls a new coordinate it removes one as well to make it look like a dot is moving.
	public static void dotanimation()
	{
		int [] dotR = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int [] dotC = {19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19};
		for(int i=0;i<dotR.length;i++)
		{
			ColorDisplay.setPixelColor(dotR[i],dotC[i],"BLACK");
			ColorDisplay.pause(70);
			ColorDisplay.setPixelOFF(dotR[i], dotC[i]);
		}
	}
	//Upon reaching (18,19), it will immediately print the outline of the entire screen and animate each coordinate side by side
	// at a slower speed.
	public static void dotline()
	{
		int[] row = {19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,18,18,17,17,16,16,15,15,14,14,13,13,12,12,11,11,10,10,9,9,8,8,7,7,6,6,5,5,4,4,3,3,2,2,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int[] col = {19,18,20,17,21,16,22,15,23,14,24,13,25,12,26,11,27,10,28,9,29,8,30,7,31,6,32,5,33,4,34,3,35,2,36,1,37,0,38,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,0,39,1,38,2,37,3,36,4,35,5,34,6,33,7,32,8,31,9,30,10,29,11,28,12,27,13,26,14,25,15,24,16,23,17,22,18,21,19,20,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19};
		for(int i=0;i<row.length;i++) {
		ColorDisplay.setPixelColor(row[i],col[i],"BLACK");
		ColorDisplay.pause(100);
		}
	}
	
	//Once the outline of the entire screen is done, i will use Squarecoordinate to call 2 squares and randomize the colors
	//every beat it detects. How square coordinates work is that it uses 2 for loops and the first i integer of the for loop will run first
	//and will wait for the entirety of the second for loop to finish before moving on to the second i integer. in this case it will print the entire
	//column first before printing moving onto the next row to print another set of the entire column.
	public static void Squarecoordinate(int r1, int c1, int r2, int c2, String color)
	{
		for(int i = 0;i<=r2-r1;i++)
		{
			for(int b=0;b<=c2-c1;b++)
			{
			int y = r1 + i;
			int x = c1 + b;
			ColorDisplay.setPixelColor(y, x,color);
			}
		}
	}
	//SquarecoordinatesAni is similar to Squarecoordinate its just that you can animate the way it moves. in this case,
	//i have set 2 types of t integer to either animate the columns or the rows.
	public static void SquarecoordinateAni(int r1, int c1, int r2, int c2, String color,int t,int t2)
	{
		for(int i = 0;i<=r2-r1;i++)
		{
			for(int b=0;b<=c2-c1;b++)
			{
			int y = r1 + i;
			int x = c1 + b;
			ColorDisplay.setPixelColor(y, x,color);
			ColorDisplay.pause(t);
			}
			ColorDisplay.pause(t2);
		}
	}
	// Its similar to SquarecoordinateAni but in this case it uses RGB coloring.
	public static void SquarecoordinateRGB(int r1, int c1, int r2, int c2, int R, int G, int B,int t,int t2)
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
	//This method uses the Y = MX + C formula using math operators to derive the line that will be drawn by making use of
	//2 coordinates to find the gradient and the constant which will then solve for Y as the X axis has been looped from 0 to the amount it is supposed to reach by using X2-X1
	// Since i want it to work for a vertical line also and it doesn't work because in mathematical terms, any number can't be divided by 0, I have decided to use an if else statement 
	//to loop the y axis such that the y coordinate increases overtime. FYI the Y coordinate represents ROW and the X coordinate represents COLUMN.
	//I have also added pause statements to the method just in case i want to animate the lines.
	public static void LinecoordinateAni(int y1, int x1, int y2, int x2,int r,int g,int b,double t)
	{	
		if(x1==x2)
		{
			for(int i=0;i<=y2-y1;i++)
			{
				ColorDisplay.setPixelColorRGB(y2-i, x2, r, g, b);
				ColorDisplay.pause(t);
			}
		}
		
		else
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
	}

	//After the SquareAnimations, it will then make use of the Square coordinates and LinecoordinateAni to do a certain pattern
	//of which sets of orange rectangle will be formed and then afterwards, white lines will rain down upon these rectangles one by one.
	public static void Linepattern()
	{

			ColorDisplay.pause(100);
			Squarecoordinate(0,2,19,7,"ORANGE");
			Squarecoordinate(0,10,19,15,"ORANGE");
			Squarecoordinate(0,18,19,23,"ORANGE");
			Squarecoordinate(0,26,19,31,"ORANGE");
			Squarecoordinate(0,34,19,39,"ORANGE");
			ColorDisplay.pause(150);
			LinecoordinateAni(0,3,19,3,255,255,255,4.5);
			LinecoordinateAni(0,6,19,6,255,255,255,5);
			LinecoordinateAni(0,11,19,11,255,255,255,5.5);
			LinecoordinateAni(0,14,19,14,255,255,255,6);
			LinecoordinateAni(0,19,19,19,255,255,255,6.5);
			LinecoordinateAni(0,22,19,22,255,255,255,7);
			LinecoordinateAni(0,27,19,27,255,255,255,7.5);
			LinecoordinateAni(0,30,19,30,255,255,255,8);
			LinecoordinateAni(0,35,19,35,255,255,255,8.5);
			LinecoordinateAni(0,38,19,38,255,255,255,9);
			ColorDisplay.pause(50);
			ColorDisplay.setScreenOFF();
			
	}
	//Once that short animation is finished it will form the tortise boody and shell via multithreading simultaneously which can
	// be seen under the Threading class of threading5 and threading6. In this particular class, it will be known as thread5 and thread6 respectively.
	// A linecoordinateAni will then be set in place along with this the tortiseblinkingeye method. I created a x variable and in that x variable,
	//it will be dependent on the amount of times i loop the eye. I also multithead the legs called thread19 and thread20.
	public static void tortiseBlinkingEye(int x)
	{
		for(int i = 0;i<=x;i++)
		{
		ColorDisplay.setPixelColorRGB(11, 23, 159, 227, 51);
		ColorDisplay.pause(200);
		ColorDisplay.setPixelColorRGB(11, 23,0, 0, 0);
		ColorDisplay.pause(900);
		}
	}
	
	
	//How this code works is that you put in 2 coordinates which will be the CENTER of the circle.
	//I will then loop the x coordinate such that in every x coordinate, i can solve for y using the formula x2 + y2 = r2
	// i will then loop the radius such that the circle increases overtime and then additionally have another loop to remove the previous printed circle
	//Such that it looks like the circle is moving every beat.
	public static void Circleanimation(int xc, int yc)
	{
	for(double r=0;r<=5;r++) {
		for(double x=0;x<=r;x=x+0.01)
		{
			double x2 =Math.pow(x, 2);
			double r2 =Math.pow(r, 2);
			double y;
			y = Math.round(Math.sqrt(r2-x2));
			ColorDisplay.setPixelColorRGB((int)x+xc, (int) y+yc, 255, 255, 255);
			ColorDisplay.setPixelColorRGB((int)x+xc, (int) -y+yc, 255, 255, 255);
			ColorDisplay.setPixelColorRGB((int)-x+xc, (int) y+yc,255, 255, 255);
			ColorDisplay.setPixelColorRGB((int)-x+xc, (int) -y+yc, 255, 255, 255);
		}
		ColorDisplay.pause(40);
			for(double x=0;x<=r;x=x+0.01)
			{
				double x2 =Math.pow(x, 2);
				double r2 =Math.pow(r, 2);
				double y;
				y = Math.round(Math.sqrt(r2-x2));
				ColorDisplay.setPixelOFF((int)x+xc, (int) y+yc);
				ColorDisplay.setPixelOFF((int)x+xc, (int) -y+yc);
				ColorDisplay.setPixelOFF((int)-x+xc, (int) y+yc);
				ColorDisplay.setPixelOFF((int)-x+xc, (int) -y+yc);
			}
	
	}
	}
	
	//This method calls for a set of squares and i implement a String color to see what color i want to use and i have 4 sets
	//of these arrays to create a ripple effect since a program runs one by one. I also used while loops to implement what i have
	// learned during lessons
	public static void SquareRippleEffect(String color)
	{
		int [] row = {0,0,1,1,9,9,10,10,15,15,16,16,18,18,19,19,15,15,16,16,12,12,13,13,9,9,10,10,12,12,13,13};
		int [] col = {19,20,19,20,28,29,28,29,22,23,22,23,19,20,19,20,16,17,16,17,13,14,13,14,10,11,10,11,25,26,25,26};
		int i = 0;
		while(i<row.length)
		{
			ColorDisplay.setPixelColor(row[i], col[i], color);
			i++;
		}
	}
	
	public static void SquareRippleEffect2(String color)
	{
		int [] row = {0,0,1,1,0,0,1,1,3,3,4,4,6,6,7,7,9,9,10,10,12,12,13,13,15,15,16,16,18,18,19,19,18,18,19,19,15,15,16,16,12,12,13,13,9,9,10,10,6,6,7,7,3,3,4,4};
		int [] col = {13,14,13,14,25,26,25,26,28,29,28,29,31,32,31,32,34,35,34,35,31,32,31,32,28,29,28,29,25,26,25,26,13,14,13,14,10,11,10,11,7,8,7,8,4,5,4,5,7,8,7,8,10,11,10,11};
		int i = 0;
		while(i<row.length)
		{
			ColorDisplay.setPixelColor(row[i], col[i], color);
			i++;
		}
		
	}
	
	public static void SquareRippleEffect3(String color)
	{
		int [] row = {0,0,1,1,0,0,1,1,3,3,4,4,6,6,7,7,12,12,13,13,15,15,16,16,18,18,19,19,18,18,19,19,15,15,16,16,12,12,13,13,6,6,7,7,3,3,4,4};
		int [] col = {7,8,7,8,31,32,31,32,34,35,34,35,37,38,37,38,37,38,37,38,34,35,34,35,31,32,31,32,7,8,7,8,4,5,4,5,1,2,1,2,1,2,1,2,4,5,4,5};
		int i = 0;
		while(i<row.length)
		{
			ColorDisplay.setPixelColor(row[i], col[i], color);
			i++;
		}
		
	}
	
	public static void SquareRippleEffect4(String color)
	{
		int [] row = {0,0,1,1,0,0,1,1,18,18,19,19,18,18,19,19};
		int [] col = {1,2,1,2,37,38,37,38,37,38,37,38,1,2,1,2};
		int i = 0;
		while(i<row.length)
		{
			ColorDisplay.setPixelColor(row[i], col[i], color);
			i++;
		}
		
	}
	
	//I made use of the SquarecoordinateAni to call each sets of columns row by row and animate each row to create a sort of wave effect
	//I will then do another set of the same method that will eliminate the wave once it has been fully printed.
	public static void clearingWave()
	{
		SquarecoordinateRGB(0,0,19,39,192,192,192,0,5);
		ColorDisplay.pause(5);
		SquarecoordinateAni(0,0,19,39,"GRAY",0,5);
	}

	// i added an array of 2 dots blinking to give an idea of where the next set of pattern will take place,
	public static void blinking()
	{
		int [] row = {10,15};
		int [] col = {0,39};
		for(int i =0;i<row.length;i++)
		{
		ColorDisplay.setPixelColorRGB(row[i], col[i], 250, 0, 0);
		ColorDisplay.pause(150);
		ColorDisplay.setPixelOFF(row[i], col[i]);
		}
	}

	//how this method works is that i create a array of columns that will form a line within the space of my display.
	// i then make use of the sin formula to find the row coordinate. y = Asin(p(x))+s where i can alther the vertical shift
	// and period. I added a pause statement inside the for loop statement to print out the entire sin graph one pixel at a time.
	public static void Singraph(int r,int g,int b)
	{
			double vertshift = 10, 
			period = 0.2;
			
			int [] col = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39};
			
			for(int i=0;i<col.length;i=i+1) 
				{

				double sin = (Math.sin(period*(col[i])))  ;
				int y = (int) ((double)  5.4*sin + vertshift);

				ColorDisplay.setPixelColorRGB(y, col[i], r, g, b);
				ColorDisplay.pause(370);
				}
	}
// I made use of 2 sets of threads: thread55 and thread 56 to make a television off animation. In thread55 and thread56, i made use of the squarecoordinateAni
// to on the full rectangle row by row in animation, Once it is done, it will clear the rectangle with the same set of animation.
// I made 2 threads with similar attributes but one animates upwards while the other animates downwards.
	public static void TelevOFF ()
	{
		threading55 thread55 = new threading55();
		threading56 thread56 = new threading56();
		thread55.start();
		thread56.start();
	}
	
	public static void onBeat(int c)
	{System.out.println("At beat : " + c);	
		threading2 thread2 = new threading2();
		threading3 thread3 = new threading3();
		threading5 thread5 = new threading5();
		threading6 thread6 = new threading6();
		threading7 thread7 = new threading7();
		threading8 thread8 = new threading8();
		threading9 thread9 = new threading9();
		threading10 thread10 = new threading10();
		threading11 thread11 = new threading11();
		threading12 thread12 = new threading12();
		threading13 thread13 = new threading13();
		threading14 thread14 = new threading14();
		threading15 thread15 = new threading15();
		threading16 thread16 = new threading16();
		threading17 thread17 = new threading17();
		threading18 thread18 = new threading18();
		threading19 thread19 = new threading19();
		threading20 thread20 = new threading20();
		threading21 thread21 = new threading21();
		threading22 thread22 = new threading22();
		threading23 thread23= new threading23();
		threading24 thread24 = new threading24();
		
	if (c==1)
	{
		YUJIE();
	}
	else if (c==3)
	{
		ColorDisplay.pause(300);
		PRESENTS();
	}
	else if (c==6)
	{
		ColorDisplay.pause(70);
		EVE();
	}
	else if (c==11)
	{
		EVEColor();
	}
	else if (c>=10 && c<30)
	{
		ColorDisplay.pause(900);
		line_ani("PINK");
	}
	else if (c==33)
	{
		bar_animation("PURPLE");
	}
	
	else if(c>=34 && c<=56)
	{
		beat_bars();
	}
	if (c==59)
	{
		dotanimation();
	}
	if (c==59 &&c<89)
	{
		ColorDisplay.pause(40);
		dotline();
	}
	if(c>=68 && c<89)
	{
		Squarecoordinate(1,1,18,18,ColorDisplay.randomColor());
		Squarecoordinate(1,20,18,38,ColorDisplay.randomColor());
	}
	if (c==89)
	{
		ColorDisplay.pause(925);
		ColorDisplay.setScreenOFF();
		ColorDisplay.pause(20);
		Linepattern();
	}
	if(c==92)
	{
		thread5.start();
		thread6.start();
		ColorDisplay.pause(700);
		tortiseBlinkingEye(10);
	}
	if(c==93)
	{
		LinecoordinateAni(6,0,6,39,193,125,80,12);
		ColorDisplay.pause(10500);
		ColorDisplay.setScreenOFF();
	}
	if(c==95)
	{//this is the legs that move simultaneously in different position independently
		thread19.start();
		thread20.start();
	}
	if(c>=95 && c<=117)
	{
		//this is the line animation that has 4 sides and is called at the same time through the beats.
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		thread11.start();
		thread12.start();
		thread13.start();
		thread14.start();
		thread15.start();
		thread16.start();
		thread17.start();
		thread18.start();
	}

	if(c==119)
	{
		//this method will call for the line patterns that will form a diamond like shape.
		thread2.start();
		thread3.start();
	}
	if(c>=127 && c<=166)
	{
		Circleanimation(9,20);
		ColorDisplay.pause(50);
		SquareRippleEffect(ColorDisplay.randomColor());
		ColorDisplay.pause(50);
		SquareRippleEffect2(ColorDisplay.randomColor());
		ColorDisplay.pause(50);
		SquareRippleEffect3(ColorDisplay.randomColor());
		ColorDisplay.pause(50);
		SquareRippleEffect4(ColorDisplay.randomColor());
	}
	if (c==167)
	{
		clearingWave();
	}		
	if(c>=168 && c<=169)
	{
		blinking();
	}
	if(c==171)
	{
		thread21.start();
		thread22.start();
		thread23.start();
		thread24.start();
	}
	if(c==180)
		{
			Singraph(50,0,100);
		}
	if(c==202)
		{
		//Once the singrapgh is fully formed, i will off the screen and reform it using thread1 which is a sin graph animation of which the entire graph has already been formed 
			ColorDisplay.setScreenOFF();
		// i then loop the graph by one time such that it duplicates the graph and form a DNA animation. The pausing plays a crucial role to the DNA effect as it needs to be perfectly timed to make sure that the 2 sin graphs are evenly spread among one another.
			for(int i=0; i <=1;i++)
			{
			Threading thread1 = new Threading();
			thread1.start();
			ColorDisplay.pause(3600);
			}
		}
	if(c>=202 && c<=215)
	{
		Squarecoordinate(0,0,3,39,ColorDisplay.randomColor());
		Squarecoordinate(16,0,19,39,ColorDisplay.randomColor());
	}
	if(c==221)
	{
		//Will wait for all the animation to go off first before closing the screen using TelevOFF if not the color will be obstructed as the Singraph thread is moving independently 
		ColorDisplay.pause(3500);
		TelevOFF();
	}

}
}

//Title: Mabel
//Artist: eve
//link of song: https://youtu.be/X_uefh0Etao
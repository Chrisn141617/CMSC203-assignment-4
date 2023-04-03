/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 04/02/2023
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Christopher Newman
*/
/**
 * 
 * @author chris
 *
 */
public class Plot {
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int depth = 0;
	
	/**
	 * setters and getters
	 * @param x
	 */
	public void setX(int x) 
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	public void setDepth(int depth) 
	{
		this.depth = depth;
	}
	
	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public int getWidth() 
	{
		return width;
	}
	
	public int getDepth() 
	{
		return depth;
	}
	/**
	 * sets the width adn depth of the plot
	 */
	public Plot() 
	{
		width = 1;
		depth = 1;
		
	}
	
	/**
	 * constructor of naming
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	/**
	 * overloading constructor
	 * @param otherPlot
	 */
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.getX();
		this.y = otherPlot.getY();
		this.width = otherPlot.getWidth();
		this.depth = otherPlot.getDepth();
		
	}
	/**
	 * takes an instance of a plot and dertermines if the current plot contains it
	 * @param plot
	 * @return
	 */
	public boolean encompasses(Plot plot)
	{
		boolean encompasses;
		
		if(this.x <= plot.x && this.y <= plot.y && this.width + x >= plot.width + plot.x && this.depth + this.y >= plot.depth + plot.y) 
		{
			encompasses = true;
		}
		
		else 
		{
			encompasses = false;
		}return encompasses;
	}
	
	/**
	 * Checks if a plot is overlapping another plot
	 * @param plot
	 * @return
	 */
	public boolean overlaps(Plot plot) 
	{
		return (x < plot.x + plot.width && x + width > plot.x && y < plot.y + plot.depth && y + depth > plot.y);
			
	}
	
	@Override
	public String toString() 
	{
		return "X: " + x + "Y: " + y + "Width: " + width + " Depth: " + depth;
	}

}

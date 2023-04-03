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
public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	/**
	 * constructor
	 */
	public Property()
	{
		propertyName = "";
		city = "";
		rentAmount = 0.0;
		owner = "";
		plot = new Plot();
	}
	
	/**
	 * overloading constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	/**
	 * another overloading constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * another overloading constructor
	 * @param otherProperty
	 */
	public Property(Property otherProperty)
	{
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		this.plot = new Plot(otherProperty.plot);
	}
	/**
	 * setters and getters
	 * @return
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public String getOwner() 
	{
		return owner;
	}
	
	public void setPropName(String propName) 
	{
		this.propertyName = propName;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public void setPlot(Plot plot)
	{
		this.plot = new Plot(plot);
	}
	/**
	 * a string that gives all infomation
	 */
	@Override
	public String toString()
	{
		return "The Property name is: " + propertyName +
				"\n" + "It is located in " + city +
				"\n" + "Who is owned by: " + owner +
				"\n" + "The rent amount is: " + rentAmount;
	}

}

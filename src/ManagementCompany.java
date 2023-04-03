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
import java.util.Arrays;

/**
 * 
 * @author chris
 *
 */
public class ManagementCompany {
	/**
	 * assigning varibales I will need to use
	 */
	int MAX_PROPERTY = 5;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Property properties[] = new Property[MAX_PROPERTY];
	private Plot mgplot;
	private String name;
	private String taxID;
	private double MgmFeePer;
	
	/**
	 * constructor0 which for assining
	 */
	public ManagementCompany() {
		name = "";
		taxID = "";
		MgmFeePer = 0.0;
		mgplot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		
	}
	/**
	 * overloading constructor
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.MgmFeePer = mgmFee;
		mgplot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * another overloading constructor
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.MgmFeePer = mgmFee;
		mgplot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.MgmFeePer = otherCompany.MgmFeePer;
		this.mgplot = new Plot(otherCompany.mgplot);
		properties = new Property[MAX_PROPERTY];
	}
	
	
	/**
	 * added a new proprety
	 * @param Property     property object
	 * @return       the index of the array where the property is added
	 */
	public int addProperty(Property Property)
	{
		for(int index = 0; index < MAX_PROPERTY; index++)
		{
			if(!mgplot.encompasses(Property.getPlot())) {
				return -3;
			}
			else if(properties[index] == null)
			{
				properties[index] = new Property(Property);
				return index;
			}
			else if(properties[index].getPlot().overlaps(Property.getPlot())) {
				return -4;
			}
		}return -1;
	}
	/**
	 * another property constructor
	 * @param name        the name of the property
	 * @param city        the name of the city it is in
	 * @param rent        how much the rent is
	 * @param owner        who it is owned by
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		Property house = new Property(name, city, rent, owner);
		int num = 0;
		
		for(int i = 0; i < this.properties.length; i++)
		{
			if(house.equals(null)){
				num = -2;
			}
			
			else if(this.properties[0].getPlot().encompasses(this.properties[i].getPlot())) 
			{
				num = -3;
			}
			
			else if(properties[i].getPlot().overlaps(properties[0].getPlot()))
			{
				num = -4;
			}
			
			else if(properties.length == MAX_PROPERTY)
			{
				num = -1;
			}
			
			else if(!properties[i].equals(null))
			{
				properties[i] = house;
				num = i;
			}
		}return num;
}

/**
 * 
 * @param name     the name of the property
 * @param city    the city it is in
 * @param rent   how much the rent is
 * @param owner   the owener of the property
 * @param x       the x coordinate of the property
 * @param y      the y coordinate of the property
 * @param width      the width of the property
 * @param depth      the depth of the property
 * @return    the index of the array where the propery is added
 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) 
	{
		Property house = new Property(name, city, rent, owner, x, y, width, depth);
		int num = 0;
		
		for(int i = 0; i < this.properties.length; i++)
		{
			if(house.equals(null)){
				num = -2;
			}
			
			else if(this.properties[0].getPlot().encompasses(this.properties[i].getPlot())) 
			{
				num = -3;
			}
			
			else if(properties[i].getPlot().overlaps(properties[0].getPlot()))
			{
				num = -4;
			}
			
			else if(properties.length == MAX_PROPERTY)
			{
				num = -1;
			}
			
			else if(!properties[i].equals(null))
			{
				properties[i] = house;
				num = i;
			}
		}return num;
		
	}
	
	/*
	 * a constucor to get the highest rent of a property
	 */
	public Property getHighestRentProperty() 
	{
		Property highest = null;
		
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i].getRentAmount() > properties[0].getRentAmount())
			{
				highest = properties[i];
			}
		}return highest;
	}
	
	/*
	 * a constructor to see if the management fee is within a range
	 */
	public boolean isManagementFeeValid()
	{
		if(MgmFeePer <= 100 && MgmFeePer >= 0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * setters and getters
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Plot getPlot()
	{
		return mgplot;
	}
	 public void setPlot(Plot plot)
	 {
		 this.mgplot = plot;
	 }
	 
	 public Property[] getProperty()
	 {
		 return properties;
	 }
	 
	 public void setProperty(Property[] props)
	 {
		 this.properties = props;
	 }
	 
	 /**
	  * this gets the count of how many properties there are
	  * @return
	  */
	 public int getPropertiesCount()
	 {
		 int num = 0;
		 for(int i = 0; i < properties.length; i++)
		 {
			 if(properties[i] == null)
			 {
				 num++;
			 }
		 }return num;
	 }
	 
	 /**
	  * more setters and getters
	  * @return
	  */
	 public String getTaxID()
	 {
		 return taxID;
	 }
	 
	 public void setTaxID(String taxID)
	 {
		 this.taxID = taxID;
	 }
	 
	 /**
	  * gets the total rent
	  * @return
	  */
	 public double getTotalRent()
	 {
		 double total = 0.0;
		
		 for(int i = 0; i < properties.length; i++)
		 {
			 if(properties[i] != null)
			 {
			 total += properties[i].getRentAmount();
			 }
		 }
		 return total;
	 }
	 
	 /**
	  * sees if the properties are full
	  * @return
	  */
	 public boolean isPropertiesFull()
	 {
		 Property something = new Property();
		 for(int i = 0; i < properties.length; i++)
		 {
			 properties[i] = something;
			 if(something == null)
			 {
				 return false;
			 }
		 }return true;
	 }
	 
	 /**
	  * removes the last prperty
	  */
	 public void removeLastProperty()
	 {
		 Property lastHouse[] = Arrays.copyOf(properties, properties.length -1);
		 for(int i = 0; i < lastHouse.length; i++)
		 {
			 properties[i] = lastHouse[i];
		 }
	 }
	 /**
	  * gets the management fee
	  * @return
	  */
	 public double getMgmFeePer() {
		 return MgmFeePer;
	 }
	 /**
	  * sets the management fee
	  * @param MgmFeePer
	  */
	 public void setMgmFeePer(double MgmFeePer)
	 {
		 this.MgmFeePer = MgmFeePer;
	 }
	 /**
	  * a string to give all of the infomation
	  */
	 @Override
	 public String toString()
	 {
		 String sentence = "";
		 sentence = ("List of the properties for " + name + ", TaxID:" + taxID + "\n" 
				 + "________________________________________________________\n");
		 for(int i = 0; i < MAX_PROPERTY; i++)
		 {
			 if(properties[i] != null) {
				 	sentence += (" Property Name: " + properties[i].getPropertyName() + "\n" +
					 " located in: " + properties[i].getCity() + "\n" +
					 " they belong to: " + properties[i].getOwner() + "\n" +
					 " The rent amount is: " + properties[i].getRentAmount() + "\n");
			 }
			 sentence += ("_________________________________________________\n" + 
			 "Total management Fee: " + MgmFeePer);
		 }  return sentence;
	 }

}

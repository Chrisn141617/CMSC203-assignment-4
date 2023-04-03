import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {
	Property sampleProperty;
	ManagementCompany mangementCo ; 

	@BeforeEach
	void setUp() throws Exception {
		mangementCo = new ManagementCompany("Railey", "555555555555", 6);
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);	
	}

	@AfterEach
	void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	void testAddPropertyProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0);
	}

	@Test
	void testAddPropertyStringStringDoubleString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddPropertyStringStringDoubleStringIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetHighestRentProperty() {
		fail("Not yet implemented");
	}

	@Test
	void testIsManagementFeeValid() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPlot() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		assertEquals(sampleProperty.getPlot().getX(), 2);
		assertEquals(sampleProperty.getPlot().getY(), 5);
		assertEquals(sampleProperty.getPlot().getWidth(), 2);
		assertEquals(sampleProperty.getPlot().getDepth(), 2);
	}

	@Test
	void testGetProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		assertEquals(mangementCo.addProperty(sampleProperty), 0, 0);

	}

	@Test
	void testGetPropertiesCount() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);	
		assertEquals(mangementCo.getPropertiesCount(), 1);
	}

	@Test
	void testGetTaxID() {
		sampleProperty = new Property ("Almost Aspen", "Gelendale", 4844, "Sammy Smith",2,5,2,2);		
		assertEquals(mangementCo.getTaxID(), 4844);
	}

	@Test
	void testGetTotalRent() {
		mangementCo = new ManagementCompany("Railey", "555555555555", 5);
		
		mangementCo.addProperty("Starbucks", "Rockvile", 1000.0, "Tommy", 1,1,1,1);
		mangementCo.addProperty("Subway", "Rockvile", 2000.0, "Chris", 2,2,2,2);
		assertEquals(3000.0, mangementCo.getTotalRent(), 0);
	}

	@Test
	void testIsPropertiesFull() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveLastProperty() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMgmFeePer() {
		mangementCo = new ManagementCompany("Sunsational", "1234", 10.0);
		assertEquals(1, mangementCo.getMgmFeePer(), 10.0);
	}

	@Test
	void testToString() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		mangementCo.addProperty(sampleProperty);	
		String pStr = "List of the properties for " + mangementCo.getName() + ", " + "taxID: " + mangementCo.getTaxID() + "\n";
		pStr += "______________________________________________________\n";
		pStr += "Sunsational,Beckman,BillyBob Wilson,2613.0\n";
		pStr += "______________________________________________________\n";
		pStr += "\n Total management Fee: " + (sampleProperty.getRentAmount() * mangementCo.getMgmFeePer()) / 100;
	}

}

package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineItemTest {
	VendingMachineItem v;

	@BeforeClass
	public void setUp() throws Exception {
		v = new VendingMachineItem("Chips", .50);
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		v = null;
	}

	@Test
	public void getNameTest() {
		assertTrue(v.getName() == "Chips");
	}

	@Test
	public void getPriceTest() {
		assertTrue( v.getPrice() == .50);
	}
	
	@Test
	public void constrTest() {
		assertNotNull(v);
	}
}


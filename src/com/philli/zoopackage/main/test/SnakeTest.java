package com.philli.zoopackage.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;
import com.philli.zoopackage.main.java.Snake;

public class SnakeTest {

	/**
	 * 
	 * @param age
	 * @param name
	 * @param species
	 * @param weight
	 * @param height
	 * @param enclosure
	 * @param endangered
	 * @param nocturnal
	 * @param gender
	 * @param venemous
	 * @param colour
	 * @param pattern
	 * @param hoursAfterEating
	 * @param excretion
	 * @param stage
	 * @param enclosureSize
	 * @param respRate
	 * @param sensResp
	 */
	Snake s = new Snake(2, "fanta", "albino cornsnake", 2, 2, 
			EnclosureType.REPTILE_CREEK, false, true, "F", false,
			"coral", "pentagons", 1, 0, "young adult", "large", 0, null, 3000);

	/**
	 * height = 2
	 * stage = baby 
	 */
	@Test
	public void testGrowth() {
		s.growth();
		assertEquals("baby", s.getStage());
	}
	/**
	 * stage = young adult 
	 * weight = 2 + 15
	 */
	@Test
	public void testNutrition() {
		s.nutrition();
		assertEquals(17, s.getWeight());
	}
	
	/**
	 * gender = F
	 * excretion = 0 + 11
	 */
	@Test
	public void testReproduction() {
		s.reproduction();
		assertEquals(11, s.getExcretion());
	}
	
	/**
	 * excretion = 0 
	 * sens resp = cold
	 */
	@Test
	public void testSensitivity() {
		s.sensitivity();
		assertEquals("cold", s.getSensResp());	}
	
	@Test
	public void testSwim() {
		s.swim();
		assertEquals(600, s.getSwimSpeed());
	}

	@Test
	public void testGetSwimSpeed() {
		assertEquals(3000, s.getSwimSpeed());
	}
	
	@Test
	public void testSetSwimSpeed() {
		s.setSwimSpeed(700);
		assertTrue(s.getSwimSpeed()==700);
	}
	
	@Test
	public void testGetSpecies() {
		String species = s.getSpecies();
		assertEquals(species, "albino cornsnake");
	}

	@Test
	public void testGetEnclosureType() {
		EnclosureType e = EnclosureType.REPTILE_CREEK;
		assertEquals(e, EnclosureType.REPTILE_CREEK);
	}

	@Test
	public void testGetName() {
		String name = s.getName();
		assertEquals(name, "fanta");
	}

	@Test
	public void testIsVenemous() {
		Boolean venemous = s.isVenemous();
		assertTrue("snake is not venemous", venemous == false);
	}

	@Test
	public void testGetColour() {
		String colour = s.getColour();
		assertEquals(colour, "coral");
	}

	@Test
	public void testGetPattern() {
		String pattern = s.getPattern();
		assertEquals(pattern, "pentagons");
	}

}

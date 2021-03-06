package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

/**
 * The Zoo does not want to create new reptiles only subclasses of Reptile
 *
 */
public abstract class Reptile extends Animal {

	public Reptile(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);
	}

	public Reptile(String name, String species, int hoursAfterEating, int excretion) {
		super(name, species, hoursAfterEating, excretion);
	}
}

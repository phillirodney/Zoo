package com.philli.zoopackage.main.java;

import com.philli.zoopackage.main.java.Enclosure.EnclosureType;

public class Crocodile extends Reptile implements Swim {
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
 * @param hoursAfterEating
 * @param excretion
 * @param stage
 * @param enclosureSize
 * @param respRate
 * @param sensResp
 */
	public Crocodile(int age, String name, String species, int weight, int height, EnclosureType enclosure,
			boolean endangered, boolean nocturnal, String gender, int hoursAfterEating, int excretion, String stage,
			String enclosureSize, int respRate, String sensResp) {
		super(age, name, species, weight, height, enclosure, endangered, nocturnal, gender, hoursAfterEating, excretion,
				stage, enclosureSize, respRate, sensResp);
	}

	

	@Override
	public void nutrition() {
		// nutrition method
		switch (getStage()) {
		case "baby":
			this.setWeight(getWeight() + 10);
			break;
		case "young adult":
			this.setWeight(getWeight() + 20);

			break;
		case "adult":
			this.setWeight(getWeight() + 30);
			break;
		default:
			this.setWeight(getWeight());
			break;
		}
	}

	@Override
	public void growth() {
		if (getHeight() < 10) {
			this.setStage("baby");
		} else if (getHeight() > 10 && getHeight() < 50) {
			this.setStage("young adult");
		} else {
			this.setStage("adult");

		}
	}

	@Override
	public void reproduction() {
		if (("F").equals(getGender())) {
			setExcretion(getExcretion() + 30);
		} else {
			setExcretion(getExcretion() + 5);
		}
	}

	@Override
	public void sensitivity() {
		if (getExcretion() > 20) {
			this.setSensResp("fever");
		}
		else {
			this.setSensResp("normal");
		}
	}



	@Override
	public void swim() {
		/*int swimSpeed = 0;
		switch (getStage()) {
		case "baby":
			swimSpeed = 200;
			break;
		case "young adult":
			swimSpeed = 300;
			break;
		case "adult":
			swimSpeed = 250;
			break;
		default:
			swimSpeed = 125;
			break;
		}		*/
	}

}

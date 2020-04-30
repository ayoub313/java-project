package uk.ac.aston.jpd.team11.groupwork.entities;

import uk.ac.aston.jpd.team11.groupwork.object.Floor;

public abstract class Person {
	private int uniqueld;
	private int currentFloor;
	private String type;
	private int weight;
	private String direction;
	
	public Person(String type, int weight, int uniqueId) {
		this.type=type;
		this.weight=weight;
		
	}
	
	public int getUniqueld() {
		return uniqueld;
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public int getweigth() {
		return weight;
	}
	
	//public void overWeigth() {
		//if(weight >= 100) {
			//lift.liftStop(); //add it on lift ]
	//	}
	}

}

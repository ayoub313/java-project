package uk.ac.aston.jpd.team11.groupwork.object;

import java.util.ArrayList;

import uk.ac.aston.jpd.team11.groupwork.entities.Person;

public class Building {
	private Floor[] floors;
	ArrayList<Person> peoples = new ArrayList<Person>();
	
	public void addPeople(Person people) {
		this.peoples.add(people);
	}
}

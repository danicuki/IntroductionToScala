package com.danicuki.introductionToScala;
import java.util.ArrayList;
import java.util.List;

public class People {
	List<Person> people = new ArrayList<Person>() {
		{
		new Person("Daniel", 35);
		}
	};
	List<Person> minors = new ArrayList<Person>(people.size());
	List<Person> adults = new ArrayList<Person>(people.size());

	public void populate() {
		for (Person person : people) {
			if (person.age() < 18)
				minors.add(person);
			else
				adults.add(person);
		}
	}
}

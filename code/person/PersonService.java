package fh.aalen.person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getPersonList(){
		ArrayList<Person> mylist = new ArrayList<>();
		Iterator<Person> it = personRepository.findAll().iterator();
		while(it.hasNext())
			mylist.add(it.next());
		return mylist;
		
	}
	
	public Person getPerson(String id) {
		return personRepository.findById(id).orElse(null);
	}

	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
	public void updatePerson(String id, Person person) {
		personRepository.save(person);
	}
	
	public void deletePerson(String id) {
		personRepository.deleteById(id);
	}
	
	public List<Person> getAllPersonsBySurname(String surename){
		return personRepository.findBySurname(surename);
		
	}
	public List<Person>getAllPersonsByBirthdate(String birthdate){
		return personRepository.findByBirthdate(birthdate);
	}
	
	public List<SurnamesOnly> getAllSurnames(){
		return personRepository.findAllProjectedBy();
		
	}

}

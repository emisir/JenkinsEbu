package fh.aalen.person;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,String> {

	public List<Person> findBySurname(String sureName);
	public List<Person> findByBirthdate(String birthdate);
	public List<SurnamesOnly> findAllProjectedBy();
}

package fh.aalen.person;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import fh.aalen.video.Video;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String surname;
	private String birthdate;

	@ManyToMany
	private List<Video> favouriteVideos;

	public Person() {
	} // When missing, problems may occur with jpa?

	public Person(long id, String surname, String birthdate) {
		super();
		this.id = id;
		this.surname = surname;
		this.birthdate = birthdate;
	}

	// Relationship N-to-M --> favours
	public List<Video> getFavouriteVideos() {
		return favouriteVideos;
	}

	public void addVideoToFavorites(Video v) {
		this.favouriteVideos.add(v);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getBirthdate() {
		return birthdate;
	}

}

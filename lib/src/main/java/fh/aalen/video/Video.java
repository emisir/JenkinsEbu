package fh.aalen.video;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fh.aalen.person.Person;

@Entity
public class Video {

	@Id
	private String title;
	private String ageRating;
	private String description;
	private String genre;

	@ManyToMany(mappedBy = "favouriteVideos")
	@JsonIgnore // Otherwise problems with recursion in json video-->person-->video-->...
	private List<Person> personFavourites;

	public Video() {
	}

	public Video(String title, String ageRating, String description, String genre) {
		super();
		this.title = title;
		this.ageRating = ageRating;
		this.description = description;
		this.genre = genre;
	}

	public List<Person> getPersonFavourites() {
		return personFavourites;
	}

	public void setPersonFavourites(List<Person> personFavourites) {
		this.personFavourites = personFavourites;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
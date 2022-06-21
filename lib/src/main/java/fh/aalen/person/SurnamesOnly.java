package fh.aalen.person;

public interface SurnamesOnly {
	@org.springframework.beans.factory.annotation.Value("#{target.genre}")
	public String getSurname();
}

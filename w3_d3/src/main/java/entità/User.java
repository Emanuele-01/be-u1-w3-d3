package entità;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter

public class User {
	@Id
	@GeneratedValue
	private UUID Id;
	private String name;
	private String lastName;
	private String email;
	private Date birday;
	private UserGenere genere;
	
	
	public User() {
		
	};
	
	public User(String name, String lastName, String email, Date birday, UserGenere genere) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.birday = birday;
		this.genere = genere;
	};
	 
	@Override 
	public String toString() {
		return "User: " + name + " / " + lastName + " / " + email + " / " + genere;
	};
}

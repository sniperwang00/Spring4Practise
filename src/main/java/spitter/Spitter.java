package spitter;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
	@NotNull
	@Size(min=4, max=10)
	private String firstName;

	private String lastName;

	private String username;

	private String password;

	public Spitter() {
	}

	public Spitter(String firstName, String lastName, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

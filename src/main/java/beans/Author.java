package beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;

@Entity
public class Author {

	@Id
	@Min(1)
	@Column(name = "AUTHOR_ID")
	@SequenceGenerator(name = "AUTHOR_ID", sequenceName = "AUTHOR_ID")
	@GeneratedValue(generator = "AUTHOR_ID", strategy = GenerationType.SEQUENCE)
	private int authorID;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String username;

	
	@Column(nullable = false)
	private String email;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "forumPostID")
	private Set<ForumPost> forumPost;
	
	
	
	
	
	

	public Author() {
		
	}

	public int getAuthorID() {
		return authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}

package beans;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;

@Entity
public class Board {


	@Id
	@Min(1)
	@Column(name = "boardID")
	@SequenceGenerator(name = "boardID", sequenceName = "boardID")
	@GeneratedValue(generator = "boardID", strategy = GenerationType.SEQUENCE)
	private int boardID;
	
	@Column
	private String name;
	
	@Column
	private String Category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "authorID", nullable = false)
	private Author author;
	
	@Column
	private Date submittedTime;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "forumPostID")
	private Set<ForumPost> forumPost;

	public Board(@Min(1) int boardID, String name, String category, Author author, Date submittedTime) {
		super();
		this.boardID = boardID;
		this.name = name;
		Category = category;
		this.author = author;
		this.submittedTime = submittedTime;
	}
	
	

	public Board() {
		
	}



	public int getBoardID() {
		return boardID;
	}

	public void setBoardID(int boardID) {
		this.boardID = boardID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Date getSubmittedTime() {
		return submittedTime;
	}

	public void setSubmittedTime(Date submittedTime) {
		this.submittedTime = submittedTime;
	}
	
	
	
}

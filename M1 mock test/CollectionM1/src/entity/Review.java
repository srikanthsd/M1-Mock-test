package entity;

import java.util.Objects;

public class Review {
	
	private String username;
	private int rating;
	private String comment;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(String username, int rating, String comment) {
		super();
		this.username = username;
		this.rating = rating;
		this.comment = comment;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(comment, rating, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return Objects.equals(comment, other.comment) && rating == other.rating
				&& Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "Review [username=" + username + ", rating=" + rating + ", comment=" + comment + "]";
	}
	
       
        

}

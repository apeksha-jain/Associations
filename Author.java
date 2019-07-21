package com.test.associations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id
	private int authorId;
	private String authorName;
	
//	private Book book;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
//	public Book getBook() {
//		return book;
//	}
//	public void setBook(Book book) {
//		this.book = book;
//	}
}

package com.test.associations;

import javax.persistence.EntityManagerFactory;

import java.util.List;

import javax.persistence.*;
public class BookAuthor {

	public static void main(String[] args) {
		
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fac.createEntityManager();
		em.getTransaction().begin();
		/*
		 * Book book2 = new Book(); Book book3 = new Book();
		 * 
		 * book2.setISBN(123); book2.setPrice(1500); book2.setTitle("Book2");
		 * 
		 * book3.setISBN(124); book3.setPrice(12500); book3.setTitle("Book3");
		 * 
		 * Author author = new Author(); author.setAuthorId(112);
		 * author.setAuthorName("Author2");
		 * 
		 * book2.setAuthor(author); book3.setAuthor(author);
		 * 
		 * em.persist(book2); em.persist(book3); em.persist(author);
		 */
		TypedQuery<Book> query = em.createQuery("select book from Book book", Book.class);
		List<Book> books  = query.getResultList();
		for(Book b:books) {
		System.out.println(b.getISBN()+" "+b.getPrice()+" "+b.getTitle());
		}
		
		TypedQuery<Book> queryStrs = em.createQuery("select books from Book books where books.price>2000", Book.class);
		List<Book> bks  = query.getResultList();
		for(Book bok:bks) {
		System.out.println(bok.getISBN()+" "+bok.getPrice()+" "+bok.getTitle());
		}
		em.getTransaction().commit();
		em.close();
		fac.close();
	}

}

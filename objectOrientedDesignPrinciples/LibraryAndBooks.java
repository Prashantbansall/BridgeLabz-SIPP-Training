package objectOrientedDesignPrinciples;

import java.util.*;

class Book{
	private String title;
	private String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	void display(){
		System.out.println("Title: " + title + "\n" + "Author: " + author);
	}
}

class Library{
	ArrayList<Book> books;
	
	Library(){
		books = new ArrayList<>();
	}
	
	void addBook(Book book) {
		books.add(book);
	}
	
	void showBooks() {
		for(Book book: books) {
			book.display();
		}
	}
}

public class LibraryAndBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Pride and Prejudice", "Jane Austen");
		Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		Book book3 = new Book("To Kill a Mockingbird","The Catcher in the Rye");
		
		Library library1 = new Library();
		Library library2 = new Library();
		
		library1.addBook(book1);
		library1.addBook(book2);
		
		library2.addBook(book2);
		library2.addBook(book3);
		
		System.out.println("Library 1: ");
		library1.showBooks();
		
		System.out.println();
		
		System.out.println("Library 2: ");
		library2.showBooks();
		
	}

}

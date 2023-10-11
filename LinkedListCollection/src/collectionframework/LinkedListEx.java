package collectionframework;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(101,"Java");
		Book b2=new Book(102,"C");
		LinkedList<Book> list= new LinkedList<Book>();
		list.add(b1);
		list.add(b2);
		
		for(Book book:list) {
			System.out.println(book.toString());
		}
	
	}

}

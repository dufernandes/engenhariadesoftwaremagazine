package com.esf.observer;

import com.esf.observer.book.BookA;
import com.esf.observer.book.BookB;

public class ObserverTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// create book club
		BookClub bookClub = new BookClub();
		
		// create subscribers - they will register themselves to the book club
		John john = new John(bookClub);
		Maria maria = new Maria(bookClub);
		Newton newton = new Newton(bookClub);
		
		// notify readers about "Book A" and "Book B"
		bookClub.notifyObservers(new BookA());
		bookClub.notifyObservers(new BookB());
	}
	
}

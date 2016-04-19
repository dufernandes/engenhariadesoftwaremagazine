package com.esf.observer;

import com.esf.observer.pattern.Element;
import com.esf.observer.pattern.Observer;
import com.esf.observer.pattern.Subject;

public class Maria implements Observer<String> {

	private Subject<String> bookClub = null;
	
	public Maria(Subject<String> bookClub) {
		this.bookClub = bookClub;
		this.bookClub.registerObserver(this);
	}
	
	public void update(Element<String> book) {
		System.out.println(String.format("Maria, you are getting the book \"%s\".", new Object[]{book.getData()}));
	}
}

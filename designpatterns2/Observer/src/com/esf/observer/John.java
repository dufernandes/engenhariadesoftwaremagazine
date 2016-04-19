package com.esf.observer;

import com.esf.observer.pattern.Element;
import com.esf.observer.pattern.Observer;
import com.esf.observer.pattern.Subject;

public class John implements Observer<String> {
	
	private Subject<String> bookClub = null;
	
	public John(Subject<String> bookClub) {
		this.bookClub = bookClub;
		this.bookClub.registerObserver(this);
	}

	public void update(Element<String> book) {
		System.out.println(String.format("John, you are getting the book \"%s\".", new Object[]{book.getData()}));
	}
}

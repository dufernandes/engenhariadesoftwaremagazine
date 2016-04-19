package com.esf.observer;

import java.util.ArrayList;
import java.util.List;

import com.esf.observer.pattern.Element;
import com.esf.observer.pattern.Observer;
import com.esf.observer.pattern.Subject;

public class BookClub implements Subject<String> {
	
	private List<Observer<String>> observers = new ArrayList<Observer<String>>();

	@Override
	public void registerObserver(Observer<String> observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer<String> observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(Element<String> element) {
		for (Observer<String> observer : observers) {
			observer.update(element);
		}
	}
}

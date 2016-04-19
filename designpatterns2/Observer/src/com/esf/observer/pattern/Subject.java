package com.esf.observer.pattern;

public interface Subject<T> {

	public void registerObserver(Observer<T> observer);
	
	public void removeObserver(Observer<T> observer);
	
	public void notifyObservers(Element<T> element);
}

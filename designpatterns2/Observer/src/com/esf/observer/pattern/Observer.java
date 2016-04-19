package com.esf.observer.pattern;

public interface Observer<T> {

	public void update(Element<T> element);
}

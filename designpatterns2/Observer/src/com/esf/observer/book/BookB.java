package com.esf.observer.book;

import com.esf.observer.pattern.Element;

public class BookB implements Element<String> {

	@Override
	public String getData() {
		return "Book B";
	}

}

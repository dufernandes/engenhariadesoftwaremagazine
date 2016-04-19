package com.esf.observer.book;

import com.esf.observer.pattern.Element;

public class BookA implements Element<String> {

	@Override
	public String getData() {
		return "Book A";
	}

}

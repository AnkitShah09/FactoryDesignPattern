package com.factorydesign.serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HeadFirstDesignPatterns")
public class HeadFirstDesignPatterns implements Book {
	@Override
	public String getBook() {
		return "This is Head First Design Patterns Book Object.";
	}
}

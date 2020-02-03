package com.factorydesign.serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HeadFirstJava")
public class HeadFirstJava implements Book {

	@Override
	public String getBook() {
		return "This is Head First Java Book Object.";
	}

}

package com.factorydesign.serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HeadFirstHTML")
public class HeadFirstHTML implements Book {
	@Override
	public String getBook() {
		return "This is Head First HTML Book Object.";
	}
}

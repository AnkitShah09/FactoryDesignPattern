package com.factorydesign.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.factorydesign.service.BookFactory;

@Service
public class BookFactoryImpl implements BookFactory {

	@Autowired
	@Qualifier("HeadFirstJava")
	Book headFirstJavaBookObject;

	@Autowired
	@Qualifier("HeadFirstDesignPatterns")
	Book headFirstDesignPatternsBookObject;

	@Autowired
	@Qualifier("HeadFirstHTML")
	Book headFirstHTMLBookObject;

	@Override
	public Book getBookObject(String bookType) {

		switch (bookType) {

		case "HeadFirstJava":
			return headFirstJavaBookObject;

		case "HeadFirstDesignPatterns":
			return headFirstDesignPatternsBookObject;

		case "HeadFirstHTML":
			return headFirstHTMLBookObject;

		default:
			return null;
		}

	}
}

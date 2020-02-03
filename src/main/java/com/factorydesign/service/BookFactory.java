package com.factorydesign.service;

import com.factorydesign.serviceImpl.Book;

public interface BookFactory {

	Book getBookObject(String bookType);
}

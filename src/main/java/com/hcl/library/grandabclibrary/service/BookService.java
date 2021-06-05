package com.hcl.library.grandabclibrary.service;

import java.util.List;

import com.hcl.library.grandabclibrary.model.Book;
import com.hcl.library.grandabclibrary.model.User;

public interface BookService {
	
	List<Book> findUsersByUuid(String uuid);

	List<Book> findUsersByTitle(String title);

	List<Book> findUsersByCatagory(String catagory);

	List<Book> findUsersByAuthor(String author);
	
	public Book addBook(Book book);

	public void deleteBook(Book book);

}

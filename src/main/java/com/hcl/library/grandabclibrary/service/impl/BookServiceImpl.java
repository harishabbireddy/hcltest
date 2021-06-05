package com.hcl.library.grandabclibrary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.library.grandabclibrary.model.Book;
import com.hcl.library.grandabclibrary.repository.BookRepository;
import com.hcl.library.grandabclibrary.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findUsersByUuid(String uuid) {
		return bookRepository.findUsersByUuid(uuid);
	}

	@Override
	public List<Book> findUsersByTitle(String title) {
		return bookRepository.findUsersByTitle(title);
	}

	@Override
	public List<Book> findUsersByCatagory(String catagory) {
		return bookRepository.findUsersByCatagory(catagory);
	}

	@Override
	public List<Book> findUsersByAuthor(String author) {
		return bookRepository.findUsersByAuthor(author);
	}


	@Override
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

}

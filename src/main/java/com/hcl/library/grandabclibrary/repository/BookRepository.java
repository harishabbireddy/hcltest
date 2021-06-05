package com.hcl.library.grandabclibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.library.grandabclibrary.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
	
	List<Book> findUsersByUuid(String uuid);

	List<Book> findUsersByTitle(String title);

	List<Book> findUsersByCatagory(String catagory);

	List<Book> findUsersByAuthor(String author);
}

package com.hcl.library.grandabclibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.library.grandabclibrary.exception.InvalidServiceInputs;
import com.hcl.library.grandabclibrary.model.Book;
import com.hcl.library.grandabclibrary.service.BookService;

@RestController
@RequestMapping(path = "/librarey/admin")
public class AdminController {
	
	
	@Autowired
	BookService bookService;
	
	 @PostMapping ("/books")
	 @ResponseBody
	 public Book addBook(@RequestBody Book book ) throws InvalidServiceInputs{
			
	    	if(null != book)
	    	{
	    		bookService.addBook(book);
	    	}else
	    	{
	    		throw  new InvalidServiceInputs(302, "Addition of Book Failed");
	    	}
			return null;
		}

}

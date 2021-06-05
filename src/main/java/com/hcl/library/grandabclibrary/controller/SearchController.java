package com.hcl.library.grandabclibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.library.grandabclibrary.constants.ApiConstants;
import com.hcl.library.grandabclibrary.exception.UserNotFoundException;
import com.hcl.library.grandabclibrary.model.Book;
import com.hcl.library.grandabclibrary.model.User;
import com.hcl.library.grandabclibrary.service.BookService;
import com.hcl.library.grandabclibrary.service.UserService;

@RestController
@RequestMapping(path = "/librarey")
public class SearchController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	BookService bookService;
	
    @GetMapping("/user/search/{searchKey}")
    @ResponseBody
	public User getUserDetails(@PathVariable String searchKey, @RequestParam String searchValue) throws UserNotFoundException{
		
    	if(null != searchKey && null != searchValue)
    	{
    		
    		if(searchKey.equalsIgnoreCase(ApiConstants.FIRSTNAME)) {
    			
    			return userService.findUsersByFirstName(searchValue);
    		}else if(searchKey.equalsIgnoreCase(ApiConstants.LASTNAME)) {
    			return userService.findUsersByLastName(searchValue);
    		}
    	}else
    	{
    		throw  new UserNotFoundException(301, "User not Fund ");
    	}
		return null;
	}
    
    @GetMapping("/book/search/{searchKey}")
    @ResponseBody
	public List<Book> geBookDetails(@PathVariable String searchKey, @RequestParam String searchValue) throws UserNotFoundException{
		
    	if(null != searchKey && null != searchValue)
    	{
    		
    		if(searchKey.equalsIgnoreCase(ApiConstants.AUTHOR)) {
    			
    			return bookService.findUsersByAuthor(searchValue);
    		}else if(searchKey.equalsIgnoreCase(ApiConstants.CATEGORY)) {
    			return bookService.findUsersByCatagory(searchValue);
    		}else if(searchKey.equalsIgnoreCase(ApiConstants.TITLE)) {
    			return bookService.findUsersByTitle(searchValue);
    		}else if(searchKey.equalsIgnoreCase(ApiConstants.UUID)) {
    			return bookService.findUsersByUuid(searchValue);
    		}
    		
    	}
		return null;
	}

}

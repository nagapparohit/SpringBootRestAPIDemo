package com.spirngboot.basics.springboot10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author 91783
 *	This controller would be registered as component/bean and managed by spring framework.
 */
@RestController
public class BooksController {

	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l,"Masterting Srping","Ranga Karnam"));
	}
	
}

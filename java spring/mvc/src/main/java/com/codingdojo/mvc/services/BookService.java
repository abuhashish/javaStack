package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
//    public Book updateBook(long id,String title,String desc,String lang,int numOfPages) {
//    	
//    }
    public void deleteBook(Long id)   {  
    bookRepository.deleteById(id);  
    }  
    public Book updateBook(Long id,String title,String desc,String lang,Integer numOfPages)   {  
    	Optional<Book> book = bookRepository.findById(id);
    	if(book.isPresent()) {
    		   book.get().setTitle(title);
    	       book.get().setDescription(desc);
    	       book.get().setLanguage(lang);
    	       book.get().setNumberOfPages(numOfPages); 
    	       bookRepository.save(book.get());
    	       return book.get();
    		}
    	else return null;
    	}
    public void updateBook(Book books)   
    {  
    bookRepository.save(books);  
    }  
    }  
    
     

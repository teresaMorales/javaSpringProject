package com.example.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mvc.models.Book;
import com.example.mvc.repositories.BookRepository;

@Service
public class BookService {
	//Agregando el book al repositorio como una dependencia
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		// obtener todos por el id
		// optional es un contenedor 
		Optional<Book> actualizarLibros = bookRepository.findById(id);
		//Obtener             //cambiar
		actualizarLibros.get().setTitle(title);
		actualizarLibros.get().setLanguage(lang);
		actualizarLibros.get().setNumberOfPages(numOfPages);
		actualizarLibros.get().setDescription(desc);
		
		// obtener para retornar
		return bookRepository.save(actualizarLibros.get());
	}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
}

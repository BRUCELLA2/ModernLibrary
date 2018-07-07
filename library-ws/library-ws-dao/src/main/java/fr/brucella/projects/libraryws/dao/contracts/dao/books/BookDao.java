package fr.brucella.projects.libraryws.dao.contracts.dao.books;

import fr.brucella.projects.libraryws.entity.books.model.Book;
import fr.brucella.projects.libraryws.entity.exceptions.NotFoundException;
import fr.brucella.projects.libraryws.entity.exceptions.TechnicalException;

/**
 * Interface for Book Data Access Object.
 *
 * @author BRUCELLA2
 */
public interface BookDao {

  /**
   * Give the book with the specified id from the datastore.
   *
   * @param bookId id of the book.
   * @return the book with the specified id.
   * @throws TechnicalException - wraps technical exception caused during data access.
   * @throws NotFoundException - This exception is throws if there is no technical exception and the
   *     author is not found.
   */
  Book getBook(final Integer bookId) throws TechnicalException, NotFoundException;

  /**
   * Update an existing book in the datastore.
   *
   * @param book the book with the updated informations to save in datastore.
   * @throws TechnicalException - wraps technical exception caused during data access.
   * @throws NotFoundException - This exception is throws if there is no technical exception and the
   *     author is not found.
   */
  void updateBook(final Book book) throws TechnicalException, NotFoundException;

  /**
   * Insert a new book in the datastore.
   *
   * @param book The book to insert in datastore.
   * @return the id of the new book.
   * @throws TechnicalException - wraps technical exception caused during data access.
   */
  int insertBook(final Book book) throws TechnicalException;

  /**
   * Delete the book with the specified id in the datastore.
   *
   * @param bookId id of the book.
   * @throws TechnicalException - wraps technical exception caused during data access.
   * @throws NotFoundException - This exception is throws if there is no technical exception and the
   *     author is not found.
   */
  void deleteBook(final Integer bookId) throws TechnicalException, NotFoundException;
}

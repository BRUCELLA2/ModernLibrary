package generated.bookserviceclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035 Generated source version: 2.2
 */
@WebService(name = "BookService", targetNamespace = "http://services.libraryws.projects.brucella.fr/")
@XmlSeeAlso({ObjectFactory.class})
public interface BookService {


  /**
   * @return returns java.lang.Boolean
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "borrowingReturn", targetNamespace = "http://services.libraryws.projects.brucella.fr/",
      className = "generated.bookserviceclient.BorrowingReturn")
  @ResponseWrapper(localName = "borrowingReturnResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.BorrowingReturnResponse")
  public Boolean borrowingReturn(@WebParam(name = "arg0", targetNamespace = "") Integer arg0) throws LibraryWsException;

  /**
   * @return returns java.lang.Boolean
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "extendBorrowing", targetNamespace = "http://services.libraryws.projects.brucella.fr/",
      className = "generated.bookserviceclient.ExtendBorrowing")
  @ResponseWrapper(localName = "extendBorrowingResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.ExtendBorrowingResponse")
  public Boolean extendBorrowing(@WebParam(name = "arg0", targetNamespace = "") Integer arg0) throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BookBorrowsCountDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "nbBorrowingByBooks", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.NbBorrowingByBooks")
  @ResponseWrapper(localName = "nbBorrowingByBooksResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.NbBorrowingByBooksResponse")
  public List<BookBorrowsCountDto> nbBorrowingByBooks() throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BorrowDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "borrowingHistoryList", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.BorrowingHistoryList")
  @ResponseWrapper(localName = "borrowingHistoryListResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.BorrowingHistoryListResponse")
  public List<BorrowDto> borrowingHistoryList() throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BookStockDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "bookStocksList", targetNamespace = "http://services.libraryws.projects.brucella.fr/",
      className = "generated.bookserviceclient.BookStocksList")
  @ResponseWrapper(localName = "bookStocksListResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.BookStocksListResponse")
  public List<BookStockDto> bookStocksList() throws LibraryWsException;

  /**
   * @return returns java.lang.Integer
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "bookBorrow", targetNamespace = "http://services.libraryws.projects.brucella.fr/",
      className = "generated.bookserviceclient.BookBorrow")
  @ResponseWrapper(localName = "bookBorrowResponse", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.BookBorrowResponse")
  public Integer bookBorrow(@WebParam(name = "arg0", targetNamespace = "") Integer arg0,
      @WebParam(name = "arg1", targetNamespace = "") Integer arg1) throws LibraryWsException;

  /**
   * @return returns generated.bookserviceclient.BookDetailsDto
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "bookDetails", targetNamespace = "http://services.libraryws.projects.brucella.fr/",
      className = "generated.bookserviceclient.BookDetails")
  @ResponseWrapper(localName = "bookDetailsResponse", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.BookDetailsResponse")
  public BookDetailsDto bookDetails(@WebParam(name = "arg0", targetNamespace = "") Integer arg0)
      throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.User>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "currentlyDeadlineExpiredUsers", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.CurrentlyDeadlineExpiredUsers")
  @ResponseWrapper(localName = "currentlyDeadlineExpiredUsersResponse", targetNamespace = "http://services.libraryws"
      + ".projects.brucella.fr/", className = "generated.bookserviceclient.CurrentlyDeadlineExpiredUsersResponse")
  public List<User> currentlyDeadlineExpiredUsers() throws LibraryWsException;

  /**
   *
   * @throws LibraryWsException
   */
  @WebMethod
  @RequestWrapper(localName = "sendReminderToUsers", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.SendReminderToUsers")
  @ResponseWrapper(localName = "sendReminderToUsersResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.SendReminderToUsersResponse")
  public void sendReminderToUsers() throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BorrowDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "currentlyBorrowForUser", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.CurrentlyBorrowForUser")
  @ResponseWrapper(localName = "currentlyBorrowForUserResponse", targetNamespace = "http://services.libraryws"
      + ".projects.brucella.fr/", className = "generated.bookserviceclient.CurrentlyBorrowForUserResponse")
  public List<BorrowDto> currentlyBorrowForUser(@WebParam(name = "arg0", targetNamespace = "") Integer arg0)
      throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BorrowDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "currentlyBooksBorrowedList", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.CurrentlyBooksBorrowedList")
  @ResponseWrapper(localName = "currentlyBooksBorrowedListResponse", targetNamespace = "http://services.libraryws"
      + ".projects.brucella.fr/", className = "generated.bookserviceclient.CurrentlyBooksBorrowedListResponse")
  public List<BorrowDto> currentlyBooksBorrowedList() throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BookDetailsDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "allBooks", targetNamespace = "http://services.libraryws.projects.brucella.fr/",
      className = "generated.bookserviceclient.AllBooks")
  @ResponseWrapper(localName = "allBooksResponse", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.AllBooksResponse")
  public List<BookDetailsDto> allBooks() throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BorrowDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "returnedBorrowsForUser", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.ReturnedBorrowsForUser")
  @ResponseWrapper(localName = "returnedBorrowsForUserResponse", targetNamespace = "http://services.libraryws"
      + ".projects.brucella.fr/", className = "generated.bookserviceclient.ReturnedBorrowsForUserResponse")
  public List<BorrowDto> returnedBorrowsForUser(@WebParam(name = "arg0", targetNamespace = "") Integer arg0)
      throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BookDetailsDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "booksSearchedList", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.BooksSearchedList")
  @ResponseWrapper(localName = "booksSearchedListResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.BooksSearchedListResponse")
  public List<BookDetailsDto> booksSearchedList(
      @WebParam(name = "arg0", targetNamespace = "") BooksSearchClientCriteriaDto arg0) throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.UserCurrentlyBorrowDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "currentlyDeadLineExpiredForUser", targetNamespace = "http://services.libraryws"
      + ".projects.brucella.fr/", className = "generated.bookserviceclient.CurrentlyDeadLineExpiredForUser")
  @ResponseWrapper(localName = "currentlyDeadLineExpiredForUserResponse", targetNamespace = "http://services"
      + ".libraryws.projects.brucella.fr/", className = "generated.bookserviceclient"
      + ".CurrentlyDeadLineExpiredForUserResponse")
  public List<UserCurrentlyBorrowDto> currentlyDeadLineExpiredForUser(
      @WebParam(name = "arg0", targetNamespace = "") Integer arg0) throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.CurrentlyBorrowExpiredDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "currentlyDeadlineExpired", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.CurrentlyDeadlineExpired")
  @ResponseWrapper(localName = "currentlyDeadlineExpiredResponse", targetNamespace = "http://services.libraryws"
      + ".projects.brucella.fr/", className = "generated.bookserviceclient.CurrentlyDeadlineExpiredResponse")
  public List<CurrentlyBorrowExpiredDto> currentlyDeadlineExpired() throws LibraryWsException;

  /**
   * @return returns java.util.List<generated.bookserviceclient.BookDetailsDto>
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "availableBooksList", targetNamespace = "http://services.libraryws.projects.brucella"
      + ".fr/", className = "generated.bookserviceclient.AvailableBooksList")
  @ResponseWrapper(localName = "availableBooksListResponse", targetNamespace = "http://services.libraryws.projects"
      + ".brucella.fr/", className = "generated.bookserviceclient.AvailableBooksListResponse")
  public List<BookDetailsDto> availableBooksList() throws LibraryWsException;

}

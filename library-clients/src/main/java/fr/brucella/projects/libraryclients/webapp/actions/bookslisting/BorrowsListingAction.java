package fr.brucella.projects.libraryclients.webapp.actions.bookslisting;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import generated.authentificationserviceclient.FullUserDto;
import generated.bookserviceclient.BookService;
import generated.bookserviceclient.BookService_Service;
import generated.bookserviceclient.LibraryWsException;
import generated.bookserviceclient.UserCurrentlyBorrowDto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class BorrowsListingAction extends ActionSupport implements SessionAware, ServletRequestAware {

  // ----- Logger
  /**
   * Borrows Listing Action logger.
   */
  private static final Log LOG = LogFactory.getLog(BorrowsListingAction.class);

  /**
   * the user's HTTP session attributes.
   */
  private Map<String, Object> session;

  /**
   * The Http Servlet Request. Used to get session informations.
   */
  private HttpServletRequest servletRequest;

  // ----- Output
  /**
   * A list of User Currently Borrow Dto.
   */
  private List<UserCurrentlyBorrowDto> borrowsList;


  // ----- Getters and Setters

  /**
   * Give the list of User Currently Borrow Dto.
   *
   * @return the list of User Currently Borrow Dto.
   */
  public List<UserCurrentlyBorrowDto> getBorrowsList() {
    return borrowsList;
  }

  /**
   * Set the list of User Currently Borrow Dto.
   *
   * @param borrowsList the list of User Currently Borrow Dto.
   */
  public void setBorrowsList(List<UserCurrentlyBorrowDto> borrowsList) {
    this.borrowsList = borrowsList;
  }


  /**
   * Set the Http Servlet Request.
   *
   * @param request
   */
  @Override
  public void setServletRequest(final HttpServletRequest request) {
    this.servletRequest = request;
  }

  /**
   * Set the user's HTTP session attributes.
   */
  @Override
  public void setSession(final Map<String, Object> session) {
    this.session = session;
  }


  // ===== Methods =====

  public String currentlyBorrows() {

    BookService_Service bookservice = new BookService_Service();
    BookService bookServicePort = bookservice.getBookServicePort();

    try {
      FullUserDto fullUserDto = (FullUserDto) this.servletRequest.getSession().getAttribute("userLog");
      setBorrowsList(bookServicePort.currentlyBorrowForUser(fullUserDto.getUserId()));
    } catch (LibraryWsException exception) {
      LOG.error(exception.getMessage());
      LOG.error(exception.getFaultInfo().getFaultString());
      this.addActionError(exception.getMessage());
      return Action.ERROR;
    }

    return Action.SUCCESS;
  }


  public String borrowsHistory(){

    BookService_Service bookservice = new BookService_Service();
    BookService bookServicePort = bookservice.getBookServicePort();

    return Action.ERROR;
  }


  public String isBeforeToNow(UserCurrentlyBorrowDto userCurrentlyBorrowDto) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate endDate = LocalDate.parse(userCurrentlyBorrowDto.getEndDate(), formatter);
    if(endDate.isBefore(LocalDate.now())) {
      return "true";
    } else {
      return "false";
    }
  }

}

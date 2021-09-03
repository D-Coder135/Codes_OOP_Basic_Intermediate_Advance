/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03/09/21
 *   Time: 7:58 PM
 *   File: BookService.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.booksManagement;

public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }
    }

    public Book[] filterBookByPublisher(Publisher publisher, Book[] books) {

    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {

    }
}

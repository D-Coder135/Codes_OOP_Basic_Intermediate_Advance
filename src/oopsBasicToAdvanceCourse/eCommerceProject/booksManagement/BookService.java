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
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.hasAuthor(author)) {

            }
        }
    }

    public Book[] filterBookByPublisher(Publisher publisher, Book[] books) {

    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {

    }
}

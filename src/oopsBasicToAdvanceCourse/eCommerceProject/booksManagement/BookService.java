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
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.hasAuthor(author)) {
                filteredBooks[index++] = book;
            }
        }
        return filteredBooks;
    }

    public Book[] filterBookByPublisher(Publisher publisher, Book[] books) {
        if (publisher == null || books == null) {
            return new Book[0];
        }
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                filteredBooks[index++] = book;
            }
        }
        return filteredBooks;

    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
            return new Book[0];
        }
        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;

        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                filteredBooks[index++] = book;
            }
        }
    }
}

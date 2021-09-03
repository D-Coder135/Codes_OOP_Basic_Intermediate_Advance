/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03/09/21
 *   Time: 7:00 PM
 *   File: Book.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.booksManagement;

import java.math.BigDecimal;

public class Book {
    private static final int DEFAULT_NUMBER_OF_AUTHORS = 10;
    private int id, amountOfPages;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private BigDecimal price;
    private CoverType coverType;

    {
        authors = new Author[DEFAULT_NUMBER_OF_AUTHORS];
    }

    public Book(int id, int amountOfPages, String name, Author[] authors, Publisher publisher, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.amountOfPages = amountOfPages;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.coverType = coverType;
    }
}

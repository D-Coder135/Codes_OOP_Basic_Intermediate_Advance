/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03/09/21
 *   Time: 7:00 PM
 *   File: Book.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.booksManagement;

import java.math.BigDecimal;

public class Book {
    private int id, amountOfPages, publishingYear;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private BigDecimal price;
    private CoverType coverType;


    public Book(int id, int amountOfPages, int publishingYear, String name, Author[] authors, Publisher publisher, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.amountOfPages = amountOfPages;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.coverType = coverType;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03/09/21
 *   Time: 7:00 PM
 *   File: Book.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.booksManagement;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

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
        this.publishingYear = publishingYear;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.price = price;
        this.coverType = coverType;
    }

    public Book() {
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && amountOfPages == book.amountOfPages && publishingYear == book.publishingYear && Objects.equals(name, book.name) && Arrays.equals(authors, book.authors) && Objects.equals(publisher, book.publisher) && Objects.equals(price, book.price) && Objects.equals(coverType, book.coverType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, amountOfPages, publishingYear, name, publisher, price, coverType);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", amountOfPages=" + amountOfPages +
                ", publishingYear=" + publishingYear +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }

    public boolean hasAuthor(Author author) {

    }
}

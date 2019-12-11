package task2.model;

import java.util.Comparator;

public class Book implements Comparator<Book> {

    private String name;
    private String Author;
    private String publishing;
    private  int year;
    private int pages;
    private double price;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, String publishing, int year, int pages, double price) {
        this.name = name;
        Author = author;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public int compare(Book book, Book t1) {
        return book.getPublishing().charAt(0)-book.getPublishing().charAt(0);
    }
}

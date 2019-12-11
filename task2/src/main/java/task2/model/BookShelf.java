package task2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookShelf {

    private String[] name = {"One", "Two","Three","Four","Five", "Six"};
    private String[] author= {"John","Mark","Peter","Oliver","Robert","Alison", "Helen"};
    private String[] publishing= {"PublishingA","PublishingB"};
    private  int []year= {1999, 2003, 2000, 2007,2013, 2014, 2020};
    private int []pages= {234,673,323,642,123,654,623};
    private double []price = {234,54,2,4,643,23,123,731,342};
    private Book [] books;
  private Random random = new Random();

  public BookShelf(int i ){
      books = generateBooks(i);
  }

    public  Book[] generateBooks(int a){
        Book [] books = new Book[a];
        for (int i = 0 ; i<a; i++){
            books[i] = new Book(name[random.nextInt(name.length)],
                    author[random.nextInt(author.length)],
                    publishing[random.nextInt(publishing.length)],
                    year[random.nextInt(year.length)],
                    pages[random.nextInt(pages.length)],
                    price[random.nextInt(price.length)]);
        }


        return books;
    }

    public Book[] getBooks() {
        return books;
    }


    public Book [] booksPublishingYear(int year){
      ArrayList<Book> list = new ArrayList<Book>();
        for (Book book: books) {
            if (book.getYear()>year){
                list.add(book);
            }

        }
        return listToArray(list);
    }

    public Book [] booksAuthor(String s){
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book book: books) {
            if (book.getAuthor().equals(s)){
                list.add(book);
            }

        }
        return listToArray(list);
    }

    public Book [] booksPublication(String s){
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book book: books) {
            if (book.getPublishing().equals(s)){
                list.add(book);
            }

        }
        return listToArray(list);
    }


    private Book[] listToArray(List<Book> list ){
      Book [] books1 = new Book[list.size()];
      for (int i =0 ; i<list.size(); i++){
          books1[i] = list.get(i);
      }
      return books1;
    }
}

package task2.view;

import task2.model.Book;

import java.util.Scanner;

public class BookView {
   static Scanner in = new Scanner(System.in);

    public static void view(Book[] books){
        System.out.println("You book array is :\n");
        for (Book book:books) {
            System.out.println(book);
        }

    }

    public static void view(String s ){
        System.out.println(s);
    }



    public  static int getSize(){
        try{
            view("Put the size of the bookshelf");
            return Integer.parseInt(in.nextLine());}
        catch (Exception e){
            return getSize();

        }
    }

    public  static int getYear(){
        try{
            view("Put the year");
            return Integer.parseInt(in.nextLine());}
        catch (Exception e){
            return getYear();

        }
    }

    public  static String getAuthor(){
        try{
            view("Put the Author");
            return in.nextLine();}
        catch (Exception e){
            return getAuthor();

        }
    }

    public  static String getPublication(){
        try{
            view("Put the Publication");
            return in.nextLine();}
        catch (Exception e){
            return getPublication();

        }
    }
}
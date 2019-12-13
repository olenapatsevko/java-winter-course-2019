package task2.control;

import task2.view.InputData;

import static task2.view.BookView.view;


public class BookInputController {

    public  static int getSize(){
        try{
            view("Put the size of the bookshelf");
            return Integer.parseInt(InputData.scan());}
        catch (Exception e){
            return getSize();

        }
    }

    public  static int getYear(){
        try{
            view("Put the year");
            return Integer.parseInt(InputData.scan());}
        catch (Exception e){
            return getYear();

        }
    }

    public  static String getAuthor(){
        try{
            view("Put the Author");
            return InputData.scan();}
        catch (Exception e){
            return getAuthor();

        }
    }

    public  static String getPublication(){
        try{
            view("Put the Publication");
            return InputData.scan();}
        catch (Exception e){
            return getPublication();

        }
    }
}

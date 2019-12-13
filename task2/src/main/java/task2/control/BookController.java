package task2.control;

import task2.model.BookShelf;
import task2.view.BookView;
import task2.view.MenuView;

import java.util.Arrays;

import static task2.view.BookView.*;
import static task2.view.BookView.view;

public class BookController {


    public static void start() {
        int i = BookView.getSize();
        BookShelf bookShelf = new BookShelf(i);
        view(bookShelf.getBooks());
        while (true) {

            BookView.view("Choose your variant\n");


            switch (MenuView.getMenu()) {
                case (1): {
                    view(bookShelf.getBooks());
                    break;
                }
                case (2): {
                    view(bookShelf.booksAuthor(BookView.getAuthor()));
                    break;
                }
                case (3): {
                    view(bookShelf.booksPublication(BookView.getPublication()));
                    break;
                }
                case (4): {
                    view(bookShelf.booksPublishingYear(BookView.getYear()));
                    break;
                }
                case (5): {
                    Arrays.sort(bookShelf.getBooks());
                    view(bookShelf.getBooks());
                    break;
                }
                case (6): {
                    return;
                }
                default: {
                    BookView.view("Sorry , you entered something wrong");
                    break;
                }
            }

        }

    }


}

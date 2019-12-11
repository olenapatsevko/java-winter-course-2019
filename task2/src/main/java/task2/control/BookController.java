package task2.control;

import secondpart.model.BookShelf;
import secondpart.view.BookView;

import java.util.Arrays;

import static secondpart.view.BookView.*;
import static secondpart.view.BookView.view;

public class BookController {


    public static void start() {
        int i = BookView.getSize();
        BookShelf bookShelf = new BookShelf(i);
        view(bookShelf.getBooks());
        while (true) {

            BookView.view("Choose your variant\n");
            BookView.view("\n 1 - See yor Bookshelf \n 2 - See authors books " +
                    "\n 3 - See all the books of certain publication " +
                    "\n 4 - See the books that were published after special year " +
                    "\n 5 - See ordered by publication books " +
                    "\n 6 - Exit");

            switch (BookView.getMenu()) {
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

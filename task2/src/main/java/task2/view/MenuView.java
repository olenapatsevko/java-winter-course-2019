package task2.view;

public class MenuView {

    public static int getMenu(){
        try{ BookView.view("Choose your variant\n \n 1 - See yor Bookshelf \n 2 - See authors books " +
                    "\n 3 - See all the books of certain publication " +
                    "\n 4 - See the books that were published after special year " +
                    "\n 5 - See ordered by publication books " +
                    "\n 6 - Exit");

            return Integer.parseInt(InputData.scan());}
        catch (Exception e){
            return getMenu();

        }
    }

}

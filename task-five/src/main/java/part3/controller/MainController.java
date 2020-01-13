package part3.controller;

import part3.model.Dictionary;
import part3.view.MainView;


public class MainController {
    MainView mainView = new MainView();
    Dictionary dictionary = new Dictionary();

    public void start() {
        while (true) {
            mainView.print("1 - Choose the language" +
                    "\n2 - Add new word" +
                    "\n3 - Translate the word" +
                    "\n4 - Translate the sentence" +
                    "\n5 - Exit ");

            switch (Integer.parseInt(MainView.scan("Enter the number"))) {
                case 1: {
                    dictionary.setLanguage(mainView.chooseLanguage());
                    break;
                }
                case 2: {
                    dictionary.setMap(MainView.scan("put the key"), MainView.scan("put the value"));
                    break;
                }
                case 3: {
                    MainView.print(dictionary.translateWord(MainView.scan("Put the word to translate")));
                    break;
                }
                case 4: {
                    MainView.print(dictionary.translateSentence(mainView.getSentence()));
                    break;

                }
                case 5: {
                    return;
                }
                default: {
                    this.start();


                }
            }
        }


    }
}

package part3.view;

import java.util.Scanner;

public class MainView {

    static Scanner in = new Scanner(System.in);


    public static void print(String s) {
        System.out.println(s);
    }

    public static String scan(String s) {
        print(s);
        return in.nextLine().trim().toLowerCase();
    }

    public boolean chooseLanguage() {
        switch (scan("Enter what language to translate").trim().toLowerCase()) {
            case "english": {

            }
            case "англійська": {
                return true;
            }
            case "ukrainian": {

            }
            case "українська": {
                return false;
            }
            default: {
                print("Incorrect input/Не коректні дані");
                return chooseLanguage();

            }
        }
    }

    public String[] getSentence() {
        return scan("Enter your sentence").trim().split("//s*|,?|;?|_*");
    }

}

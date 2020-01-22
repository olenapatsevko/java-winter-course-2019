package part1.view;

import part1.model.RegularExpression;
import part1.model.Student;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentView {
    private Scanner in = new Scanner(System.in);

    public String scan() {
        return in.nextLine();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public Student getStudent() {
        return new Student(getName("name"), getName("surname"), getName("birthday"), getName("address"), getName("phone"));
    }

    public String getName(String s) {
        print("Enter" + s);
        try {
            Pattern pattern = Pattern.compile(RegularExpression.getExpression(s));
            Matcher matcher = pattern.matcher(in.nextLine().trim());
            if (matcher.matches()) {
                return matcher.group();
            } else {
                return this.getName(s);
            }
        } catch (Exception e) {
            return this.getName(s);
        }

    }


}

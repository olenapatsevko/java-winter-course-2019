package part1.control;

import part1.model.Journal;
import part1.view.StudentView;

public class JournalController {
    StudentView studentView = new StudentView();
    Journal journal = new Journal();

    public void start() {
        while (true) {
            StudentView.print("1 enter student \n2 print journal \n3 exit");
            switch (studentView.scan().trim()) {
                case "1":
                    journal.setStudents(studentView.getStudent());
                    break;

                case "2":
                    StudentView.print(journal.toString());
                    break;

                case "3":
                    return;

                default:
                    StudentView.print("Incorrect input");
                    break;

            }

        }
    }

}

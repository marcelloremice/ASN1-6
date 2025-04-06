import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

    public static void main(String[] args)
    {
        String input;     // To hold input
        int questions = -1;    // Number of questions
        int missed = -1;       // Number of questions missed

        // Get the number of questions on the exam
        input = JOptionPane.showInputDialog("How many questions are on the exam?");
        try{
            questions = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Error parsing input, stopping program. ");
            System.exit(1);
        }

        // Get the number of questions the student missed
        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        try{
            missed = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Error parsing input, stopping program. ");
            System.exit(1);
        }

        // Create an Exam object
        Exam exam = new Exam(questions, missed);

        // Display the test results
        String message = "Each question counts " + (exam.getPointsEach() * 100);
        message += " points.\nThe exam score is " + (exam.getScore() * 100);
        message += "\nThe exam grade is " + exam.getGrade();
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
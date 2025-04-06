public class Exam extends Assessment {
    private final int question;
    private final int missed;

    public Exam(int question, int missed) {
        this.question = question;
        this.missed = missed;
        setScore(calScore());
    }
    public double getPointsEach(){
        double Pointsearch = 0;
        Pointsearch = (double) 1 / question;
        return Pointsearch;
    }
    public double calScore(){
        double temp;
        int correct = this.question - this.missed;
        temp =((double) correct / this.question);
        return temp;
    }
}

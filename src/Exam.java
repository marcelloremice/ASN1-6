public class Exam extends Assessment {
    private final int question;
    private final int missed;

    public Exam(int question, int missed) {
        this.question = question;
        this. missed = missed;
        setScore(calScore());
    }
    public double getPointsEach(){
        double Pointsearch = 0;
        double questions = 0;
        Pointsearch = questions/100;
        return Pointsearch;
    }
    public int calScore(){
        int num = 0;
        double temp;
        temp =((double) this.missed / this.question);
        return num;
    }
}

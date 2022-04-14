package 异常;

public class TeacherDemo {
    public static void main(String[] args) {
        int score =101;
        Teacher t =new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}

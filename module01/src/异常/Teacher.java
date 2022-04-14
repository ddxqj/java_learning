package 异常;

public class Teacher {
    public void checkScore(int score) throws ScoreException {
        if(score <0||score>100){
            //throw new ScoreException();
            throw new ScoreException("成绩越界");
        } else {
            System.out.println("成绩正常");
        }
    }
}

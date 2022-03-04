package exct;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1 = "What is the year Sri lanka cricket team won icc odi world cup? \n" +
                "(a)2011 \n(b)1996 \n(c)2014 \n(d)1999";
        String q2 = "What is the year Sri lanka cricket team won icc T20 world cup? \n" +
                "(a)2011 \n(b)1996 \n(c)2014 \n(d)1999";

        Quizz [] question = {
                new Quizz(q1,"b"),
                new Quizz(q2,"c")
        };
        testApp(question);
    }
    public static void testApp(Quizz [] question){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for(int i=0; i< question.length; i++){
            System.out.println(question[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(question[i].answer)){
                score++;
            }
        }
        System.out.println("Your score is "+score+"/"+question.length);
    }
}

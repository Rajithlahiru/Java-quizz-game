package exct;

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
    }
}

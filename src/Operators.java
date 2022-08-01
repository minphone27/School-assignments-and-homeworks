public class Operators {

    //exercise 1
    public static void exercise1(int length, int width){
        System.out.println("Exercise 1 : " + (length  * width));
    }

    //exercise 2
    public static void exercise2(){
        System.out.println("Exercise 2 : " + (((( 8 + 2345 ) / 3 ) % 5 ) * 5));
    }

    //exercise 3
    public static void exercise3(){
        int answer = 8;
        answer += 2345;
        answer /= 3;
        answer %= 5;
        System.out.println("Exercise 3 : " + (answer * 5));
    }

    //exercise 4
    public static void exercise4(int num1, int num2) {
        System.out.println( "Exercise 4 : " + (num1 == num2 ? "Equal" : "Not equal"));
    }

    public static void exercise5(int sub1,int sub2,int sub3){
        System.out.println("Exercise 5 : ");
        System.out.println("The total mark is " + (sub1 + sub2 + sub3));

        //looping
        int[] subs = {sub1,sub2,sub3};
        for (int i = 0; i < subs.length; i++) {
            double answer = (double) subs[i]/100;
            System.out.println("Percentage of sub" + (i+1) + " = " + answer + " %");
        }

        //regular method
        double answer1 = (double) sub1/100;
        System.out.println("Percentage of sub1 = " + answer1 + " %" );
        double answer2 = (double) sub2/100;
        System.out.println("Percentage of sub2 = " + answer2 + " %" );
        double answer3 = (double) sub3/100;
        System.out.println("Percentage of sub3 = " + answer3 + " %" );

        // DRY = Don't Repeat Yourself
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conditional {
    static Scanner scanner = new Scanner(System.in);

    //Exercise 1
    public static void oddEven(){
        System.out.print("Enter a random number : ");
        int number = scanner.nextInt();
        System.out.println(number % 2 != 0 ? "Odd" : "Even");
    }

    public static void checkSqr(){
        System.out.print("Length :");
        double l = scanner.nextDouble();
        System.out.print("Width :");
        double w = scanner.nextDouble();
        System.out.println(l == w ? "This is a square." : "Definitely not a square.");
    }

    public static void whosBig(){
        System.out.print("First number :");
        double f = scanner.nextDouble();
        System.out.print("Second number :");
        double s = scanner.nextDouble();
        System.out.println(f>s ? "First number is bigger." : "Second is big.");
    }

    static private String generateRandom(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public static void checkPin(){
        String random = generateRandom(7);
        System.out.println("Given pin :"+random);
        System.out.print("Enter the above pin :");
        String pin = scanner.nextLine();
        System.out.println(pin.equals(random) ? "You're good to go." :  "Wrong pin." );
    }

    public static void discountCheck(){
        System.out.print("Your purchase(Note that if you order 5000 and above you will get 10% discount) :");
        double purchase = scanner.nextDouble();
        if (purchase >= 5000){
            System.out.println("Your purchase is "+purchase +" and you will get 10% discount.");
        }else {
            System.out.println("Your purchase is "+purchase);
        }
    }

    public static void sameName(){
        System.out.print("First name :");
        String f = scanner.nextLine();
        System.out.print("Second name :");
        String s = scanner.nextLine();
        System.out.println(f.equals(s) ? "Same names." : "Different names" );
    }

    public static void checkFail(){

        List<Integer> subjects = new ArrayList<>();
        int time = 0;
        while (true){
            System.out.print("Enter subject :");
            int sub = scanner.nextInt();
            subjects.add(sub);
            if(time == 3){
                break;
            }

            time++;
        }

        System.out.println();

        for (int i = 0; i < subjects.toArray().length; i++) {

            System.out.println(subjects.get(i) >= 60 ? "Pass" : "Fail");
        }

    }

    public static void checkGrade(){
        System.out.print("Enter your grade :");
        String grade = scanner.next();
        switch (grade) {
            case "A" -> System.out.print("Excellent");
            case "B" -> System.out.print("Good");
            case "C" -> System.out.print("Average");
            case "D" -> System.out.print("Deficient");
            case "F" -> System.out.print("Failing");
        }
    }

}


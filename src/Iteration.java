public class Iteration {

    //For loop

    public static void forLoop(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "time");
        }
    }

    //While loop

    public static void whileLoop(){
        int time = 0;
        while (time < 4){
            System.out.println("Run");
            time++;
        }
    }

    //Do while loop

    public static void doWhile(){
        int time = 0;
        do {
            System.out.println("run");
            time++;
        }while (time < 4);
    }

    //For each

    public static void forEach(){
        String [] people = {"Pyae sone","Su pyae me","Htet Naung Htun","Aung Kyaw Zall","Ba Sai","Khant Kyaw Min","Bruce"};

        for (String person: people) {
            if (person.equals("Bruce")){
                System.out.println(person+" is sayagyii");
            }else {
                System.out.println(person + " noob");
            }

        }
    }

}

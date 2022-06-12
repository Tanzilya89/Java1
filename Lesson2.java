package Lesson2;


public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(checkingTheLimits(2,7));
        positiveOrNegative(8);
        System.out.println(numberPositiveOrNegative(-2));
        stringAndNumbers("Tanzilya", 8);
        System.out.println(leapYear(2022));

    }


    public static boolean checkingTheLimits(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void positiveOrNegative(int a) {
        if (  a >0 ){
            System.out.println("Положительно");
        } else{
            System.out.println("Отрицательно");
        }
    }
    public static boolean numberPositiveOrNegative(int a) {
        if (  a >0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void stringAndNumbers(String st, int b) {
        for (int x = 2; x <= b; x++) {
            System.out.println("["+x+"]" + "" + st);

        }
    }
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 ==0) {
            return true;
        }
        else {
            return false;
        }
    }
}


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        Numbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {

        int a = 6, b = 9, c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {

            int value = 100;

            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100 & value > 100) {
                System.out.println("Желтый");
            } else  {
                System.out.println("Зеленый");

            }
        }
        public static void Numbers() {

            int a = 6;
            int b = 26;

            if (a >=b ) {
                System.out.println("a >=b" );
            }
            if (a < b) {
                System.out.println("a < b");
            }
        }
    }





public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] doubles = { 1.57, 7.654, 9.986};

        String[] strings = {"One", "Two", "Three"};

        System.out.println("Задание 2.");

        for (int i=0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }

        for ( int i = 0; i < doubles.length; i++) {
            if (i != doubles.length - 1) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.println(doubles[i]);
            }
        }

        for ( int i = 0; i < strings.length; i++) {
            if (i != strings.length - 1 ) {
                System.out.print(strings[i] + ", ");
            } else {
                System.out.println(strings[i]);
            }
        }

        System.out.println("задание 3.");

        for (int i = numbers.length; i >= 0; i--) {
            if ( i != 0) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.println(numbers[i]);
            }
        }



    }
}
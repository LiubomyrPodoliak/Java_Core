package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int readNumber(int start, int end) throws NotInRangeException {

        int result = scanner.nextInt();
        if ((start < result) && (result < end)) {
            return result;
        } else {
            throw new NotInRangeException();
        }
    }

    public static void main(String[] args) {

//        try {
//            System.out.println("Enter d1");
//            int d1 = scanner.nextInt();
//
//            System.out.println("Enter d2");
//            int d2 = scanner.nextInt();
//            System.out.println(Div.div(d1,d2));
//        }catch(InputMismatchException e1){
//            System.err.println("Not a number");
//        }catch (ArithmeticException e2){
//            System.out.println(e2.getMessage());
//        }

        int[] arry = new int[10];

        int start = 1;
        int end = 100;

        for (int i = 0; i < arry.length; i++) {
            try {
                System.out.println("Enter int");
                arry[i] = readNumber(start, end);
                start = arry[i];
            } catch (NotInRangeException e) {
                e.printStackTrace();
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
        }


    }


}

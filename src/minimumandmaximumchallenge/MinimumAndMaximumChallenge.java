package minimumandmaximumchallenge;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax() {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        /*boolean first = true; boolean flag = boolean value that can be true or false and wait the user
                                to enter at least one number*/

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {

                int number = sc.nextInt();
                
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            sc.nextLine(); //handle enter key!!
        }
        System.out.println("min= " + min + ", max = " + max);
        sc.close();
    }

}

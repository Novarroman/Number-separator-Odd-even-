import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> oddsList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        int intToSort;
        intToSort = 1;

        System.out.println("Hi! This program counts odd and even numbers you enter.");
        System.out.println("Entering 0 will stop it and get you the results.");

        while (intToSort != 0) {

            System.out.println("Enter your number, please!");
            Scanner in = new Scanner(System.in);
            int userInput = in.nextInt();
            intToSort = userInput;
            if (intToSort % 2 == 0) {
                Integer integerToSort = intToSort;
                evenList.add(integerToSort);
            } else {
                Integer integerToSort = intToSort;
                oddsList.add(integerToSort);
            }
        }
        int listCount1 = oddsList.size();
        int listCount2 = evenList.size();

            /*   for(int c : oddsList)
       {
         System.out.println(oddsList.get(c));
        }

       for(int c : evenList)
       {
        System.out.println(evenList.get(c));
       }

*/

        System.out.println("You have entered " + listCount1 + " odd and " + (listCount2 - 1) + " even number(s)");

    }
}


/*
Yuanbo Pang CIS 35A
Description: This program contains a method `removeDuplicates` that takes an `ArrayList` and returns a new `ArrayList` containing only the distinct elements from the original list. The method uses a `HashSet` to filter out duplicate elements. The original list is input by the user via the keyboard.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        HashSet<E> set = new HashSet<>(list);


        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter integers for the first list (type 'done' to finish):");
        ArrayList<Integer> list1 = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list1.add(scanner.nextInt());
        }
        scanner.next();

        ArrayList<Integer> uniqueList1 = removeDuplicates(list1);
        System.out.println("Unique elements from the first list: " + uniqueList1);
    }
}

/*
Example Output:
Enter integers for the first list (type 'done' to finish):
1 2 2 3 3 3 4 done
Unique elements from the first list: [1, 2, 3, 4]

Enter integers for the second list (type 'done' to finish):
10 20 20 30 40 40 50 done
Unique elements from the second list: [10, 20, 30, 40, 50]
*/

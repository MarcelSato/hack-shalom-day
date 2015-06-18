package main.java.com.example;

import java.util.*;

/**
 * Created by marcelsato on 5/3/15. Master
 * Recursion
 */
public class HelloHackShalomDay {

    public static void main(String[] args) {
        System.out.println("Hello Shalom Hack Day!!!!\n");


        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(3);
        numbers1.add(2);
        numbers1.add(4);
        numbers1.add(7);
        numbers1.add(2);
        numbers1.add(7);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);
        numbers2.add(11);

        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(13);
        numbers3.add(14);
        numbers3.add(11);
        numbers3.add(12);
        numbers3.add(12);
        numbers3.add(13);
        numbers3.add(10);
        numbers3.add(19);

        List<Integer> numbers4 = new ArrayList<>();
        numbers4.add(3);
        numbers4.add(4);
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(2);

        List<Integer> numbers5 = new ArrayList<>();
        numbers5.add(9);
        numbers5.add(8);
        numbers5.add(7);
        numbers5.add(6);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);

        System.out.println("List 1 " + numbers1 + "\nDuplicates " + showResult2(numbers1) + "\n");
        System.out.println("List 2 " + numbers2 + "\nDuplicates " + showResult2(numbers2) + "\n");
        System.out.println("List 3 " + numbers3 + "\nDuplicates " + showResult2(numbers3) + "\n");
        System.out.println("List 4 " + numbers4 + "\nDuplicates " + showResult2(numbers4) + "\n");
        System.out.println("List 5 " + numbers5 + "\nDuplicates " + showResult2(numbers5) + "\n");

    }

    public static List showResult(List<Integer> numbers){
        List<Integer> dp = new ArrayList<>();
        return findDuplicates2(numbers, dp);
    }

    public static List findDuplicates(List<Integer> numbers, List<Integer> dp){
        int head = numbers.get(0);
        numbers.remove(0);
        for(int i = 0; i < numbers.size(); i++){
            if(head == numbers.get(i) && !dp.contains(head)) dp.add(numbers.get(i));
        }
        Collections.sort(dp);
        if(numbers.size() == 0) return dp;
        return findDuplicates(numbers, dp);
    }

    public static List showResult2(List<Integer> numbers){
        List<Integer> dp = new ArrayList<>();
        final List duplicates2 = findDuplicates2(numbers, dp);
        Collections.sort(duplicates2);
        return duplicates2;
    }

    /**
     * The recursion needs three basic conditions:
     *
     * 1 - You need to pass the 'accumulator' which saves the context of all recursion calls
     *  and contains the final result
     *
     * 2 - The recursive method has to start with the stop condition which defines when the recursion
     *  needs to stop and the result in the accumulator is ready to be returned
     *
     * 3 - No internal loops! The recursion by its own is a kind of loop managed by the method stack
     *  calls (I can explain that better later for you).
     *
     *
     * @param numbers
     * @param dp
     * @return
     *
     *
     * Nice thanks for that, I got it now!!
     */
    public static List findDuplicates2(List<Integer> numbers, List<Integer> dp) {
        // stop condition
        if (numbers.isEmpty()) return dp;

        final Integer head = numbers.remove(0);
        if (numbers.contains(head) && !dp.contains(head)) dp.add(head);

        return findDuplicates2(numbers, dp);
    }
}

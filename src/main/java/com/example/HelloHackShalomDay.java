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
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(1);
        numbers2.add(2);

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

        System.out.println("List 1 " + numbers1 + "\nDuplicates " + showResult(numbers1) + "\n");
        System.out.println("List 2 " + numbers2 + "\nDuplicates " + showResult(numbers2) + "\n");
        System.out.println("List 3 " + numbers3 + "\nDuplicates " + showResult(numbers3) + "\n");
        System.out.println("List 4 " + numbers4 + "\nDuplicates " + showResult(numbers4) + "\n");
        System.out.println("List 5 " + numbers5 + "\nDuplicates " + showResult(numbers5) + "\n");
    }

    public static List showResult(List<Integer> numbers){
        List<Integer> dp = new ArrayList<>();
        return findDuplicates(numbers, dp);
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
}

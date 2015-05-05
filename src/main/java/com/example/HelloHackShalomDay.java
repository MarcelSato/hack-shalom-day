package main.java.com.example;

import java.util.*;

/**
 * Created by marcelsato on 5/3/15. Master
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

        System.out.println("List 1" + showResult(numbers1) + "\n");
        System.out.println("List 2" + showResult(numbers2) + "\n");
        System.out.println("List 3" + showResult(numbers3) + "\n");
        System.out.println("List 4" + showResult(numbers4) + "\n");
        System.out.println("List 5" + showResult(numbers5) + "\n");

    }


    public static Object showResult(List<Integer> numbers){
        int count = 0;
        List<Item> result = new ArrayList<>();
        for(int i  = 0; i < numbers.size(); i++){
            Item item = new Item();
            item.setValue(numbers.get(i));
            if(result.contains(item))
                continue;

            for(int j = i + 1; j < numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){

                    if(result.contains(item)) {
                        int index = result.indexOf(item);
                        result.get(index).addCount();
                    } else {
                        item.addCount();
                        result.add(item);
                    }

//                    result.equals(numbers.get(i) + " " + count); // Wrong
                }

        Collections.sort(result);    //count = 0;
            }
        }
                return result.toString();
    }


}

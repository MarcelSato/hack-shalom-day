package main.java.com.example;

import java.util.*;

/**
 * Created by marcelsato on 5/3/15. Pesquisar recursão
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

//        numbers2.get(0)
//        numbers2.remove(0)

        System.out.println(showResult(numbers1));
        System.out.println(showResult(numbers2));

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

//                    result.equals(numbers.get(i) + " " + count);
                }
                //count = 0;
            }
        }
        Collections.sort(result);
        return result.toString();
    }
                //try recursion

}

package main.java.com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by marcelsato on 5/3/15.
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

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(1);
        numbers2.add(2);

        System.out.println(showResult(numbers1));
        System.out.println(showResult(numbers2));

    }


    public static  showResult(List<Integer> numbers){
        Set mySet = new HashSet<>();
        for(int i = 0; i < numbers.size(); i++){
                mySet.add(numbers.get(i));
            }




        return numbers.size() != mySet.size();





//            if(numbers.size() > mySet.size()){
//                return true;
//            }
//            return false;
    }


}

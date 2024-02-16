package algorithm.practice.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PNCBank_Scadea {

    public static void main(String[] args) {


        //get even numbers from the list
        List<Integer> list  = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);

        System.out.println(list.stream().filter(e -> e % 2 == 0)
                .collect(Collectors.toList()));

       // sort the list according to thir length (number of characters)
        List<String> stringList = new ArrayList<>();
        stringList.add("January");
        stringList.add("February");
        stringList.add("March");
        stringList.add("April");
        stringList.add("May");

        Collections.sort(stringList, new MyComparator());

        System.out.println(stringList);

    }


}
class MyComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {

        return  (o1.length() > o2.length() ? 1 : -1);

    }
}
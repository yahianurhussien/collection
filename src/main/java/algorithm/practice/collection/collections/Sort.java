package algorithm.practice.collection.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Sort {



    public static void main(String[] args) {

        Person p1 = new Person("Yahia" , 32);
        Person p2 = new Person("Alen", 32);
        Person p3 = new Person("Alen", 30);
        Person p4 = new Person("Zara", 34);


        List<Person> personList = Arrays.asList(p1,p2,p3,p4);


        // sort using Collections sort method
      //  Collections.sort(personList, new MyComparator());
       Collections.sort(personList, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        // using sort method from stream api

        System.out.println(personList.stream().sorted(new MyComparator()).collect(Collectors.toList()));

        System.out.println(personList.stream()
                .sorted(Comparator.comparing(p -> p,new MyComparator())).collect(Collectors.toList()));



       Comparator<Person> byName =  (x,y) -> x.getName().compareTo(y.getName());
       Comparator<Person> byAge = (x,y) -> Integer.compare(x.getAge(),y.getAge());

        System.out.println(personList.stream()
                .sorted(byName.thenComparing(byAge)).collect(Collectors.toList()));

        System.out.println(personList);
    }

}

class MyComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2){
        if(p1.getName().equals(p2.getName())){
            return    Integer.compare(p1.getAge(), p2.getAge());
        }else{
            return p1.getName().compareTo(p2.getName());
        }
    }
}

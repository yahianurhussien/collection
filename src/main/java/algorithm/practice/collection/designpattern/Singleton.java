package algorithm.practice.collection.designpattern;

public class Singleton {

    public String str;
    private Singleton(){

    }

    public static Singleton getSingleInstance(){
        return new Singleton();
    }
}

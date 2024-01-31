package algorithm.practice.collection.string;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();
        java.util.HashMap<Character, Integer> map1 = new java.util.HashMap<>();
        java.util.HashMap<Character, Integer> map2 = new java.util.HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map1.containsKey(a.charAt(i))) {

                map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
            } else {

                map1.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (map2.containsKey(b.charAt(i))) {

                map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
            } else {

                map2.put(b.charAt(i), 1);
            }
        }


        return map1.equals(map2);

    }


    // optimized function

    static boolean isAnagramOptimized(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        java.util.Arrays.sort(charArrayA);
        java.util.Arrays.sort(charArrayB);

        return java.util.Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

        boolean ret2 = isAnagramOptimized(a, b);
        System.out.println((ret2) ? "Anagrams" : "Not Anagrams");


        // sample scanner input
        //TestTest
        //testsest
    }
}

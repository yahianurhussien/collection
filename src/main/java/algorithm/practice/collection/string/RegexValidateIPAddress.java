package algorithm.practice.collection.string;

import java.util.Scanner;

public class RegexValidateIPAddress {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String ipAddress = scanner.next();

            System.out.println(ipAddress.matches(new MyRegex().pattern));

        }


    }
}

class MyRegex {

    String pattern =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}


//sample input  0-255.0-255.0-255.0-255
//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP

//    output
//    true
//    true
//    true
//    false
//    false
//    false





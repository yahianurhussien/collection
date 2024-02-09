package algorithm.practice.collection.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLtagContentExtractor {


    // Method to extract content within HTML-like tags from a given string.
    public static void extractContent(String s) {
        // Regular expression to match HTML-like tags and their content.
        String regex = "<(.+)>([^<]+)</\\1>";
        // Compile the regular expression into a Pattern.
        Pattern pat = Pattern.compile(regex);
        // Create a Matcher to find matches in the input string.
        Matcher mat = pat.matcher(s);
        // Initialize a boolean flag to check if any matches were found.
        Boolean found = false;

        // Loop through the string and find all matches.
        while (mat.find()) {
            // Print the content inside the matched tags (group(2)).
            System.out.println(mat.group(2));
            // Set the found flag to true, since we found at least one match.
            found = true;
        }

        // If no matches were found, print "None".
        if (!found) {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner to read input from the console.

        Scanner input = new Scanner(System.in);
        // Read the number of lines to process.
        int numOfLines = Integer.parseInt(input.nextLine());

        // Iterate through the specified number of lines.
        for (int i = 0; i < numOfLines; i++) {
            // Read a line of input.
            String s = input.nextLine();
            // Call the `extractContent` method to process the input string.
            extractContent(s);
        }
    }


//        sample input
//         4
//        <h1>Nayeem loves counseling</h1>
//        <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//        <Amee>safat codes like a ninja</amee>
//        <SA premium>Imtiaz has a secret crush</SA premium>

//    sample output
//    Nayeem loves counseling
//    Sanjay has no watch
//    So wait for a while
//    None
//    Imtiaz has a secret crush
}


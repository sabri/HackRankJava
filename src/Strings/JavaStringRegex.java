package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by sabrouch.
 * Date: 11/27/2020
 */

public class JavaStringRegex {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
      while( testCases>0){
        testCases--;
        String pattern = in.nextLine();
        //Write your code
        try{
            Pattern.compile(pattern);
            System.out.println("Valid");
        }catch(PatternSyntaxException e){
            System.out.println("Invalid");
        }


    }
}
}

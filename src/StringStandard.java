import java.util.Scanner;

/**
 * Created by sabrouch.
 * Date: 11/26/2020
 */

public class StringStandard {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i = A.compareTo(B);
        if(i>0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);;
        System.out.println(atemp+" "+btemp);
    }
}

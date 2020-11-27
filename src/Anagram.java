import java.util.Scanner;

/**
 * Created by sabrouch.
 * Date: 11/26/2020
 */

public class Anagram {
    static boolean isAnagram(String A, String B) {
        A=A.toLowerCase();
        B=B.toLowerCase();
        boolean f = false;
        int k=0;
        if (A.length() == B.length()){
            for (int i = 0; A.length() >= i; i++){
                if (B.indexOf(A.charAt(i)) != -1) {
                    k += 1;
                }
            }
            if (k== B.length()){
                f = true;
            }
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

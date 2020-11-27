import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by sabrouch.
 * Date: 11/27/2020
 */

public class Javalambda {

    interface PerformOperation {
        boolean check(int a);
    }
    static class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        PerformOperation isOdd()
        {
            PerformOperation p =  (a) -> {return a%2!=0;};

            return p;
        }

        PerformOperation isPrime()
        {
            PerformOperation p =  (a) -> {

                boolean flag = true;
                for (int i = 2; i <= a / 2; ++i) {
                    if (a % i == 0) {
                        flag = false;
                        break;
                    }
                }
                return flag;
            };
            return p;
        }

        PerformOperation isPalindrome()
        {
            PerformOperation p =  (a) -> {
                String word = ""+a;
                boolean isPalindrome = true;
                for(int i = 0;i<(int)word.length()/2;i++)
                {
                    if(word.charAt(i) != word.charAt(word.length()-1-i)){
                        isPalindrome = false;
                        break;

                    }
                }
                return isPalindrome;
            };
            return p;
        }
    }
    public static class Solution {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T--> 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }

}

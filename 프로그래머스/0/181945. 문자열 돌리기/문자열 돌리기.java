import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] copy = a.toCharArray();
        for(char z : copy){
            System.out.println(z);
        }
    }
}
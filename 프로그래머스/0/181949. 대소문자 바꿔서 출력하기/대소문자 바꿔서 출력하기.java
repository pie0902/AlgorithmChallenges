import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] copy = a.toCharArray();
        for(int i = 0; i< copy.length; i++){
            if(copy[i]>=97){
                copy[i] -= 32;
            }   
            else{
                copy[i] +=32;
            }
        }
        String answer = new String(copy);
        System.out.println(answer);
    }
}
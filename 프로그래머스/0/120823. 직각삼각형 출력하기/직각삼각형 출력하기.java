import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        for(int i = 1; i <= n ; i++){
            star += '*';
            System.out.println(star);
        }
        
    }
}
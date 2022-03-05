import java.util.Scanner;

public class q10872{
    static int factorial(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return factorial(n)*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.close();
        
        System.out.println(factorial(n));
    }
}
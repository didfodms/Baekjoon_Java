import java.util.Scanner;

public class q10871{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int x = sc.nextInt(); int a;
        
        for(int i=0; i<n; i++){
            a = sc.nextInt();
            if(a<x) System.out.println(a);
        }
    }
}
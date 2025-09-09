package looping_prac;
import java.util.Scanner;
public class PrimeCheck{
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0) {
                System.out.println(n+" is Not prime");
                break;
            }
        }
        if(i==n){
            System.out.println(n+"is prime");
        }
            }
        
}

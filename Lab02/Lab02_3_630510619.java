//630510619 ณัฐวัฒน์ คำวังสวัสดิ์
import java.util.Scanner;
public class Lab02_3_630510639 {
    public static void main(String[] args){
        int number;
        boolean oddEven, prime;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();
        oddEven = checkOddEven(number); 
        prime = checkPrime(number); 
        if (oddEven == true){ 
            System.out.printf("%d is odd number." + '\n',number);
        }else{
            System.out.printf("%d is even number." + '\n',number);
        }
        if (prime == true){
            System.out.printf("%d is prime number." + '\n',number);
        }else{
            System.out.printf("%d is not prime number." + '\n',number);
        }
    }
    
    public static boolean checkOddEven(int n){
        if (n % 2 == 0){ 
            return(false);
        }else{ //odd
            return(true);
        }
    }

    public static boolean checkPrime(int n){
        double range;
        int i, value, testP;
        range = Math.sqrt(n);
        value = (int)range;
        testP = 0;
        if (n == 1){ 
            return(false);
        }
        for (i=2;i<=value;i++){
            if (n % i == 0){ 
                testP += 1;
            }else{ 
                continue;
            } 
        }
        if (testP > 0){
            return(false);
        }else{
            return(true);
        }

    }
}

//630510619 ณัฐวัฒน์ คำวังสวัสดิ์
import java.util.*;
public class Lab02_1_630510619 {
    public static void main(String[] args) {
        char ch;
        int number;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Alphabet: ");
        ch = input.nextLine().charAt(0);
        
        do{
            System.out.println("Input Number (between 2 and 10)");
            System.out.print("Enter Number: ");
            number = input.nextInt();
        }while (number < 2 || number > 10); 
        if(Character.toLowerCase(ch)=='a') {
            printStarA(number);
        }else if (Character.toLowerCase(ch)=='b') {
            printStarB(number);
        }else {
            System.out.print("Good Bye");
        }
        
    }
    public static void printStarA(int n) { 
        int row,col;                       
        for(row=n;row>=1;row--) {          
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void printStarB(int n) {  
        int row,col,dot,test,test2;         
        test = 1; //number of dots          
        test2 = n-1; //number of space
        for(row=n;row>=1;row--) {
            for(col=test2;col>=1;col--) {
                System.out.print(" ");
            }
            for(dot=1;dot<=test;dot++){
                System.out.print("*");
            }
            System.out.print('\n');
            test += 1;
            test2 -= 1;
       }
    }

}

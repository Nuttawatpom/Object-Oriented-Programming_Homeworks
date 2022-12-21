import java.util.Scanner;
import java.util.Arrays;
//630510619 ณัฐวัฒน์  คำวังสวัสดิ์
public class Lab01_4_630510619 {
    public static void main(String[] args) {
        int [] A = new int[5];
        int [] B = new int [5];
        int [] C = new int [10];
        Scanner sn = new Scanner(System.in);
        int i,j,number;
        for(i = 0; i <= 9 ; i++){
            if(i < 5){
                if(i == 0){
                    System.out.println("Enter Array A");
                }
                number = sn.nextInt();
                A[i] = number;
            }
            else{
                if(i == 5){              
                    System.out.println("Enter Array B");
                }
                number = sn.nextInt();
                B[i-5] = number;
            }
        }
        for(i = 0;i <= 4; i++){
            C[i] = A[i];
            C[i+5] = B[i];
        }
        Arrays.sort(C);
        for(i = 0 ;i<= 9;i++){
            System.out.print(C[i] + " ");
        }
        System.out.print("\n");
    }
}

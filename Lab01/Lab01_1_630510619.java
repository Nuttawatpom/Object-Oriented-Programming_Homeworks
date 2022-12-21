import java.util.Scanner;
// 630510619 ณัฐวัฒน์  คำวังสวัสดิ์
public class Lab01_1_630510619{
    public static void main(String[] args){
        int A = 0;
        int B = 0;
        int C = 0;
        int X ;

        Scanner sn = new Scanner(System.in);
        System.out.print("Input A: ");
        A = sn.nextInt();
        System.out.print("Input B: ");
        B = sn.nextInt();
        System.out.print("Input C: ");
        C = sn.nextInt();

        System.out.printf("%d, %d",A ,B);

        X = (A * A) + (B * B);
        while (X <= C){
            System.out.print(" " + X);
            A = B;
            B = X;
            X = (A * A) + (B * B);
        }
    }
}     
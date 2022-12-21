import java.util.Scanner;
// 630510619 ณัฐวัฒน์  คำวังสวัสดิ์
public class Lab01_3_630510619 {
    public static void main(String[] args) {
        int Kombucha,sum,r,newbottle,NEXT,count=1;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter N: ");
        Kombucha = sn.nextInt();
        sum = Kombucha; 
        newbottle = Kombucha/5; 
        r = Kombucha % 5; 
        NEXT = ((Kombucha/5)*2)+(Kombucha%5);
        while(NEXT >= 5){
            sum += newbottle*2;
            newbottle = (NEXT/5);
            r = NEXT % 5;
            NEXT = ((newbottle)*2) + r;
        }
        sum += newbottle*2;
        System.out.printf("Total number of drinking bottles = %d ", sum);
        System.out.printf("The remaining empty bottles = %d \n", NEXT);
    }
    
}

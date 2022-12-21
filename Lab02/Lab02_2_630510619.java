//630510619 ณัฐวัฒน์ คำวังสวัสดิ์
import java.util.Scanner;
public class Lab02_2_630510639 {
    public static void main(String[] args){
        int numPoint, x, y, i, qua1, qua2, qua3, qua4, numX, numY, origin;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        numPoint = input.nextInt(); 
        qua1 = 0;
        qua2 = 0;
        qua3 = 0;
        qua4 = 0;
        numX = 0;
        numY = 0;
        origin = 0;
        for (i=1;i<=numPoint;i++) { 
            System.out.printf("Enter point #%d: ",i);
            x =  input.nextInt();
            y = input.nextInt();
            int ans = checkQuadrant(x,y);
            if(ans != 0){ 
                if (ans == 1){
                    qua1 += 1;
                }else if (ans == 2){
                    qua2 += 1;
                }else if (ans == 3){
                    qua3 += 1;
                }else if (ans == 4){
                    qua4 += 1;
                }else if (ans == 5){
                    numX += 1;
                }else if (ans == 6){
                    numY += 1;
                }else if (ans == 7){
                    origin += 1;
                }
            }
        }
        System.out.printf("Number of points in Qaudrant 1 = %d" + '\n',qua1);
        System.out.printf("Number of points in Qaudrant 2 = %d" + '\n',qua2);
        System.out.printf("Number of points in Qaudrant 3 = %d" + '\n',qua3);
        System.out.printf("Number of points in Qaudrant 4 = %d" + '\n',qua4);
        System.out.printf("Number of points on X axis = %d" + '\n',numX);
        System.out.printf("Number of points on Y axis = %d" + '\n',numY);
        System.out.printf("Number of points on origin point = %d" + '\n',origin);
        
    }
    
    public static int checkQuadrant(int a,int b) {
        if (a > 0 && b > 0){ 
            return(1);
        }else if (a < 0 && b > 0){ 
            return(2);
        }else if (a < 0 && b < 0){ 
            return(3);
        }else if (a > 0 && b < 0){ 
            return(4);
        }else if (b == 0 && a > 0 || b == 0 && a < 0 ){ // x axis
            return(5);
        }else if (a == 0 && b > 0 || a == 0 && b < 0 ){ // y axis
            return(6);
        }else if (a == 0 && b == 0 ){ 
            return(7);
        }else{ 
            return(0);
        }
        
        
    }

}

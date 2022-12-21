//630510619 ณัฐวัฒน์

import java.util.Scanner;

class Drawing{

    public void drawingTriangle(int N){
        for (int row=1;row<=N;row++){
            for (int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void drawingTriangle(int N,char X){
        for (int row=N;row>=1;row--){
            for (int col=1;col<=row;col++){
                System.out.print(X);
            }
            System.out.println();
        }
    }
}

public class Lab06_1_630510619 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = input.nextInt();
        System.out.print("Input X: ");
        input.nextLine();
        char x = input.nextLine().charAt(0);
        Drawing myDrawing = new Drawing();
        myDrawing.drawingTriangle(n);
        myDrawing.drawingTriangle(n, x);

    }
}
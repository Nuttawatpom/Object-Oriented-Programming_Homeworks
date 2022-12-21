package Lab10;
//630510619_ณัฐวัฒน์
import java.util.Scanner;

class Shape2Dim{
    protected int N;
    public void setN(int n){
        N = n;
    }
}

//class สำหรับวาดรูปสี่เหลี่ยมขนมเปียกปูน
class Rhombus extends Shape2Dim{
    Rhombus(){N = 0;}
    void draw(){
        if(N > 0){
            int i;
            String fsq = "%" + N +"c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for(i=1;i<N;i++){
                fsq2 = "%" + (N-i) + "c%" + (2*i) + "c\n";
                System.out.printf(fsq2,'*','*');
            }for(i=N-2;i>=1;i--){
                fsq2 = "%" + (N-i) + "c%" + (2*i) + "c\n";
                System.out.printf(fsq2,'*','*');
            }
            System.out.printf(fsq,'*');
        }
    }
}

//class สำหรับวาดรูปสี่เหลี่ยม
class Square extends Shape2Dim{
    Square(){N = 0;}
    void draw(){
        if(N > 0){
            int i,j;
		    for(i = 1; i <= N; i++){
			    if(i == 1 || i == N)
				    for(j = 1; j <= N; j++)
					    System.out.print("*");
			    else
				    for(j = 1; j <= N; j++)
					    if(j == 1 || j == N)
						    System.out.print("*");
					    else
						    System.out.print(" ");
			    System.out.print("\n");
            }
		}
	}
}

//class สำหรับวาดรูปlามเหลี่ยม
class Triangle extends Shape2Dim{
    Triangle(){N = 0;}
    void draw(){
        if(N > 0){
            int i;
            String fsq = "%" + N + "c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for(i = 1; i < N-1 ; i++){
                fsq2 = "%" + (N-i)+"c%"+(2*i)+"c\n";
                System.out.printf(fsq2,'*','*');
            }
            for(i = 1; i <= N; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Lab10_2_630510619{
    public static void main(String[] args){
        int P,size;
        char shape;
        Scanner input = new Scanner(System.in);
        System.out.print("Input M: ");
        P = input.nextInt();
        Shape2Dim[] sh = new Shape2Dim[P];
        for(int i=0;i<P;i++){
            System.out.print("Input Type (R S or T) and Size: ");
            shape = input.next().charAt(0);
            size = input.nextInt();
            if(shape == 'R'){
                sh[i] = new Rhombus();
                sh[i].setN(size);
            }else if(shape == 'S'){
                sh[i] = new Square();
                sh[i].setN(size);
            }else{
                sh[i] = new Triangle();
                sh[i].setN(size);
            }
        }
        
        System.out.print("Rhombus\n");
        for(int i=0;i<P;i++){
            if(sh[i] instanceof Rhombus){//condition check
                ((Rhombus)sh[i]).draw();
            }
        }
        System.out.println();
        
        //วาดรูปเหลี่ยมตามจำนวน P
        System.out.print("Sqaure\n");
        for(int i=0;i<P;i++){
            if(sh[i] instanceof Square){//condition check
                ((Square)sh[i]).draw();
            }
        }
        System.out.println();
        
        //วาดรูปสามเหลี่ยมตามจำนวน P
        System.out.print("Triangle\n");
        for(int i=0;i<P;i++){
            if(sh[i] instanceof Triangle){//condition check
                ((Triangle)sh[i]).draw();
            }
        }
        System.out.println();
    }
}
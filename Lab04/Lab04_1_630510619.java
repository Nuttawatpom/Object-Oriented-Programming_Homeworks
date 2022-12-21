import java.util.Scanner;
// 630510619 ณัฐวัฒน์  คำวังสวัสดิ์
class Matrix{
    private int size;
    private int [ ][ ] data = new int [50][50];
    boolean identityStatus;

    public void setSize(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input size: ");
        size = input.nextInt();
    }
    public void setData(){
        int i,j ;
        Scanner input = new Scanner(System.in);

        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                System.out.printf("Input number [%d][%d] : ",i,j);
                data[i][j] = input.nextInt();
            }
        }//end for j
        System.out.println();
    }//end for i    
    public void checkIdentity(){
         int i,j ;
         identityStatus = true;
         for(i=0;i<size && identityStatus;i++){
             for(j=0;j<size && identityStatus;j++){
                if((i==j) && (data[i][j] != 1))
                    identityStatus = false;
                else if((i!=j) && data[i][j] != 0)
                    identityStatus = false;
             }//for j
         }
    }//end method
    public void showIdentity(){
        if (identityStatus)
            System.out.print("This martix is identity martix.");
        else
            System.out.print("This martix is not identity martrix.");
    }//end showIdentity
}


public class Lab04_1_630510619{
    public static void main(String[] args){
        Matrix m = new Matrix();
        m.setSize();
        m.setData();
        m.checkIdentity();
        m.showIdentity();
    }
}
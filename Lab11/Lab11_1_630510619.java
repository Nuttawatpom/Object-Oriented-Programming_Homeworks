package Lab11;
import java.util.Scanner;

public class Lab11_1_630510619 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integer number");
        Integer[] inData = new Integer[3]; //arrray integer
        for(int i=0;i<3;i++){
            inData[i] = input.nextInt();
        }
        System.out.println("Enter 3 characters");
        Character[] charData = new Character[3]; //arrray character
        for(int i=0;i<3;i++){
            charData[i] = input.next().charAt(0);
        }
        System.out.println("Enter 3 float numbers");
        Float[] foData = new Float[3]; //array float
        for(int i=0;i<3;i++){
            foData[i] = input.nextFloat();
        }
        System.out.println();
        System.out.println(getCenter(inData)); //call sort function 
        System.out.println(getCenter(charData));
        System.out.print(getCenter(foData));
    }

    public static <TYPE extends Comparable>TYPE getCenter(TYPE dataList[]){
       TYPE backUp;
        for(int i=0;i<3;i++){ //sort
            for(int j=i+1;j<3;j++){
                if(dataList[i].compareTo(dataList[j])>0){
                    backUp = dataList[i];
                    dataList[i] = dataList[j];
                    dataList[j] = backUp;
                }
                
            }
        }
        return(dataList[1]); //return mid value 

    }
    
}

import java.util.Scanner;
//630510619 ณัฐวัฒน์  คำวังสวัสดิ์

class Human{
    private char gender;
    private float weight;
    private float height;
    private String shape;
        public void setData(){
            Scanner inVar = new Scanner(System.in);
            do{
            System.out.print("Enter gender: ");
            gender = inVar.nextLine().charAt(0);
            }while (gender != 'm' && gender != 'f');

            System.out.print("Enter weight: ");
            weight = inVar.nextFloat();

            System.out.print("Enter height: ");
            height = inVar.nextFloat();

        }

        public void calShape(){
            if (gender == 'f'){
                if (weight <= height - 100)
                shape = "Your shape is OK.";
                else
                shape = "Your shape is not OK.";
            }else{
                if (weight <= height - 100)
                shape = "Your shape is OK.";
                else
                shape = "Your shape is not OK.";
            }
        }
        
        public void printResult(){
            System.out.print(shape);
        }

}

public class Lab03_1_630510619 {
    public static void main(String[] args){
        Human h = new Human();// h = instance ของคาส Human
        h.setData();
        h.calShape();
        h.printResult();

    }
}
//630510619 ณัฐวัฒน์

import java.util.Scanner;

class Human{
    
    private String name;
    private int height;
    private int weight;
    private char sex;
    private int sw;
    private int calwei;

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input name: ");
        name = input.nextLine();
        System.out.print("Input height: ");
        height = input.nextInt();
        System.out.print("Input weight: ");
        weight = input.nextInt();
        System.out.print("Input sex: ");
        input.nextLine();
        sex = input.nextLine().charAt(0);
    }

    public void calWeight(){
        if (sex == 'M'||sex == 'm'){
            sw = height - 100;
        }else if (sex == 'F'||sex == 'f'){
            sw = height - 110;
        }
    }

    public void calSw(){//calculate difference between weight and standrad weight
        calwei = Math.abs(weight - sw);//change negative to positive
    }

    public int calWei(){
        return(calwei);
    }

    public String resultName(){
        return(name);
    }
}

public class Lab06_2_630510619{
    public static void main(String[] args){
        Human p1 = new Human();
        System.out.println("Input data for person #1");
        p1.setData();
        p1.calWeight();
        p1.calSw();
        Human p2 = new Human();
        System.out.println("Input data for person #2");
        p2.setData();
        p2.calWeight();
        p2.calSw();

        if (p1.calWei() == p2.calWei()){
            System.out.print("The weight of both of them are close to the standard weight equally.");
        }else if(p1.calWei() > p2.calWei()){
            System.out.printf("Weightof %s is closer to standard weight than %s",p2.resultName(),p1.resultName());
        }else if(p1.calWei() < p2.calWei()){
            System.out.printf("Weightof %s is closer to standard weight than %s",p1.resultName(),p2.resultName());
        }
    }
}

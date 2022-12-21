//630510619 ณัฐวัฒน์ คำวังสวัสดิ์
package Lab05_3_630510619;
import java.util.ArrayList;
import java.util.Scanner;
class Menu{
    private int choice;
    public void setChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("**********");
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.show");
        System.out.println("4.exit");
        System.out.println("**********");
        System.out.print("Please select choice: ");
        choice = input.nextInt();
    }
    
    public int getChoice(){
        return(choice);
    }
}

class Stack{
    private  ArrayList<Integer> item = new ArrayList<Integer>();
    private int top;
    public Stack(){ 
        top = -1; //index
    }
    
    public void push(){
        int data;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Data: ");
        data = input.nextInt();
        top += 1; //add index
        item.add(top, data); //add data to list
    }

    public void pop(){
        System.out.printf("pop %d"+'\n',item.get(top)); //show last data  
        item.remove(top);
        top -= 1; 
    }

    public void show(){
        for (int i : item){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    
    public boolean isEmpty(){ //check list data or not
        if(top == -1){
            return(true);
        }else{
            return(false);
        }
    }

    public boolean isFull(){ //check list  data 
        if(top == 4){
            return(true);
        }else{
            return(false);
        }
    }

}

public class Lab05_3_630510619 {
    
    public static void main(String[] args){
        int choice;
        Scanner input = new Scanner(System.in);
        Stack s = new Stack(); 
        while(true){
            Menu m = new Menu(); 
            m.setChoice();
            choice = m.getChoice(); 
            if(choice == 1){
                if(s.isFull() == false){
                    s.push();
                }else{
                    System.out.print("Stack is full"+'\n');
                }
            }else if(choice == 2){ 
                if(s.isEmpty()){
                    System.out.print("Stack is empty"+'\n');
                }else{
                    s.pop();
                }
            }else if(choice == 3){ //show
                if(s.isEmpty()){
                    System.out.print("Stack is empty"+'\n');
                }else{
                    s.show();
                }
            }else if(choice == 4){ //exit
                System.out.print("Bye Bye");
                break;
            }
        }
    }
}

package Lab11;

import java.util.Scanner;

public class Lab11_2_630510619 {
    class Queue<TYPE>{
        private int N;
        private final Object[] item; 
        private int front;
        private int rear;
        private int count;
        
        Queue(int x){
            N = x;
            item = new Object[N];
            front = 0;
            rear = -1;
            count = 0;
        }
        
        public void enqueue(TYPE v){
            if(rear < N-1){
                rear++;
                item[rear] = v;
                count++;
                System.out.println("OK");       
            }
        }
        public void dequeue(){
            if(isEmty() == false){
                System.out.println(item[front]);
                item[front] = null;
                front++;
                count--;
            }else{
                System.out.println("Queue is empty.");
            }
        }
        
        public boolean isEmty(){
            if(count == 0){
                return(true);
            }else{
                return(false);
            }
        }
    
        public boolean isFull(){
            if(rear == N-1){
                return(true);
            }else{
                return(false);
            }
        }
        
        public void show(){
            if(isEmty() == true){
                System.out.println("Nothing to show.");
            }else{
                for(int i=front;i<=rear;i++){
                    System.out.print(item[i] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public class Lab11_2_630510639 {
    
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Input N : ");
            int n = input.nextInt();
            System.out.print("Select int or char(i or c) : ");
            char c = input.next().charAt(0);
            int menuChoice;
            if(c == 'i'){
                Queue<Integer> dataList = new Queue(n);
                int value;
                do{
                    System.out.println();
                    System.out.println("1) enqueue");
                    System.out.println("2) dequeue");
                    System.out.println("3) show");
                    System.out.println("4) exit");
                    System.out.print("Select choice : ");
                    menuChoice = input.nextInt();
                    if(menuChoice == 1){
                        if(dataList.isFull()){
                            System.out.println("Queue is full.");
                        }else{
                            System.out.print("Input data for enqueue : ");
                            value = input.nextInt();
                            dataList.enqueue(value);
                        }
                    }else if(menuChoice == 2){
                        dataList.dequeue();;
                    }else if(menuChoice == 3){
                        dataList.show();
                    }else{
                        System.out.println("Bye.");
                    }
                    System.out.println("*******************************************************");            
                }while(menuChoice != 4);
            }else{
                Queue<Character> dataList = new Queue(n);
                char value;
                do{
                    System.out.println();
                    System.out.println("1) enqueue");
                    System.out.println("2) dequeue");
                    System.out.println("3) show");
                    System.out.println("4) exit");
                    System.out.print("Select choice : ");
                    menuChoice = input.nextInt();
                    if(menuChoice == 1){
                        if(dataList.isFull()){
                            System.out.println("Queue is full.");
                        }else{
                            System.out.print("Input data for enqueue : ");
                            value = input.next().charAt(0);
                            dataList.enqueue(value);
                        }
                    }else if(menuChoice == 2){
                        dataList.dequeue();
                    }else if(menuChoice == 3){
                        dataList.show();
                    }else{
                        System.out.println("Bye.");
                    }
                    System.out.println("*******************************************************");              
                }while(menuChoice != 4);
            
            }
        }      
    }
}

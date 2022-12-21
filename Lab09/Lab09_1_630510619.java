import java.util.Scanner;

class OderItem{
    private String fName;//foodName
    private int price;
    private int numDish;
    public void setfName(String fn){//fn = fName
        fName = fn;
    }
    public void setPrice(int pr){//pr = price
        price = pr;
    }
    public void setNumDish(int nd){//nd = numdish
        numDish = nd;
    }
    public String getFName(){
        return fName;
    }
    public int getPrice(){
        return price;
    }
    public int getNumDish(){
        return numDish;
    }    
}

class Order{
    private String oID;//orderID
    private String tNO;//tableNo
    private int numFood;//numberOfItem
    private OderItem[] orderI = new OderItem[10]; 
    public void setData(){
        String fName;//food name
        int price;
        int numDish; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter order ID : ");
        oID = input.next();
        System.out.print("Enter Table No.: ");
        tNO = input.next();
        System.out.print("Enter number of food items : ");
        numFood = input.nextInt();
        if (numFood <= 10 && numFood >= 0){//Loop set value   
            for (int i = 0;i<numFood;i++){
                System.out.println("*************************************************************");
                System.out.print("Enter food name : ");
                input.nextLine();
                fName = input.nextLine();
                System.out.print("RiceEnter price : ");
                price = input.nextInt();
                System.out.print("Enter number of dishes : ");
                numDish = input.nextInt();
                orderI[i] = new OderItem();
                orderI[i].setfName(fName);
                orderI[i].setPrice(price);
                orderI[i].setNumDish(numDish);
            }
        }
    }
    public void showData(){
        System.out.printf("Order ID - %s\tTable No. - %s\n",oID,tNO);
        System.out.println("Food Name\tPrice/Dish(Baht)\tQTY");
        int sumTotal = 0;
        for (int i = 0;i<numFood;i++){//Loop show Result
            String nameFood = orderI[i].getFName();
            int price = orderI[i].getPrice();
            int numDish = orderI[i].getNumDish();
            sumTotal += price * numDish;
            System.out.printf("%s\t%d\t\t\t%d\n",nameFood,price,numDish);
        }
        System.out.printf("TotalPrice = %d Bath",sumTotal);
    }
}

public class Lab09_1_630510619 {
    public static void main(String[] args){
        Order oRder = new Order();
        oRder.setData();
        oRder.showData();
    }
}
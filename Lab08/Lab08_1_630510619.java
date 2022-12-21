import java.util.Scanner;

class Land{
    protected int landsizeh;//lansize of house
    public void landSize(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter land size: ");
        landsizeh = input.nextInt();
    }
    public int getLandSizeh(){//of House
        return landsizeh;
    }
}

class LandForHouse extends Land{
    private int houseprice;
    private int housestatus = 0;
    public void setDataH(){//setdata size house
        Scanner input = new Scanner(System.in);
        System.out.print("Enter house price: ");
        houseprice = input.nextInt();
    }
    public int getHousePrice(){
        return houseprice;
    }
    public void addStastus(){
        housestatus += 1;
    }
    public int getStatus(){
        return housestatus;
    }
}

class LandForSale extends Land{
    private int landsizel;//landsize of land
    private String title;
    private int evaluate;
    private int salestatus = 0;
    private float salePrice;
    public void setDataL(){//setdata land
        Scanner input = new Scanner(System.in);
        System.out.print("Enter land size: ");
        landsizel = input.nextInt();
        System.out.print("Enter title deed: ");
        title = input.next();
        System.out.print("Enter Evaluate price : ");
        evaluate = input.nextInt();
    }
    public void addStastus(){
        salestatus += 1;
    }
    public void salePrice(float v){
        salePrice = v;
    }
    public int getEvaluate(){
        return evaluate;
    }
    public int getLandSizeL(){//of Land
        return landsizel;
    }
    public int getSaleStatus(){
        return salestatus;
    }
    public String getTitle(){
        return title;
    }
    public float getSalePrice(){
        return salePrice;
    } 
}

public class Lab08_1_630510619 {
    public static void main(String[] args){
        int numhouse,numland;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of house: ");
        numhouse = input.nextInt();
        System.out.print("Enter number of lands: ");
        numland = input.nextInt();
        System.out.println("");
        LandForHouse[] land = new LandForHouse[numhouse];
        for (int i = 0;i<numhouse;i++){
            System.out.printf("Enter data for house #%d\n",i+1);
            land[i] = new LandForHouse();
            land[i].landSize();
            land[i].setDataH();
            System.out.println("");
        }
        LandForSale[] sale = new LandForSale[numland];
        for (int i = 0;i<numland;i++){
            System.out.printf("Enter data for land #%d\n",i+1);
            sale[i] = new LandForSale();
            sale[i].setDataL();
            System.out.println("");
        }
        matchHoseAndLand(land, sale, numhouse, numland);
        resultShow(sale, numland);
    }

    public static void matchHoseAndLand(LandForHouse[] l,LandForSale[] s,int numhouse,int numland){
        float v;//value salePrice
        for (int i = 0;i<numhouse;i++){
            for (int j = 0;j<numland;j++){
                if (l[i].getLandSizeh() <= s[j].getLandSizeL()){
                    if (s[j].getSaleStatus() == 0 && l[i].getStatus() == 0){
                        s[j].addStastus();
                        l[i].addStastus();
                        v = s[j].getEvaluate() + 0.1f * s[j].getEvaluate() + 0.05f * l[i].getHousePrice();
                        s[j].salePrice(v);
                    }
                }
            }
        }
    }

    public static void resultShow(LandForSale[] s,int numland){
        System.out.println("Report for lands which can be sold");
        System.out.println("soldTitle deed\tSale price");
        float totalP = 0;
        for (int i = 0;i<numland;i++){
            String tt = s[i].getTitle();
            float result = s[i].getSalePrice();
            int eva = s[i].getEvaluate();
            System.out.printf("%s\t\t%.2f\n",tt,result);
            totalP += result - eva;
        }
        System.out.println("");
        System.out.printf("Total profit = %.2f",totalP);
    }
}
import java.util.Scanner;
//630510619 ณัฐวัฒน์  คำวังสวัสดิ์
class Parking{
    private char vehicle;
    private int time;
    private double cost;

    public void setData(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for vehicleparking #"+i);
        do{
            System.out.print("Enter vehicle type: ");
            vehicle = Character.toLowerCase(sc.nextLine().charAt(0));
        }while (vehicle != 'c' && vehicle != 'm');

        System.out.print("Enter minute: ");
        time = sc.nextInt();
    }
    public void calCost(){
        if (vehicle == 'c'){
            if (time <= 60){
                cost = time;
            }
            else if (time >= 61 && time < 120){
                cost = 60+((time%60)*0.75);
            }
            else if (time == 120){
                cost = 105;
            }
            else if (time >= 121 && time < 240){
                cost = 105+((time%120)*0.5);
            }
            else if (time == 240){
                cost = 165;
            }
            else{
                cost = 165+((time-240)*0.25);
            }
        }
        else{
            if(time > 60){
                if (time%60 != 0){
                    cost = (Math.floor(time/60)*5)+5;
                }
            }
            else{
                cost = 5;
            }
        }
    }
    public void printResult(int t){
        System.out.printf("%.2f Bath(s)",cost);
        System.out.println();
    }
}

public class Lab03_2_630510619 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking p1, p2;

        p1 = new Parking();
        p1.setData(1);
        p1.calCost();
        p1.printResult(1);

        p2 = new Parking();
        p2.setData(2);
        p2.calCost();
        p2.printResult(2);
    }

}

//ณัฐวัฒน์ คำวังสวัสดิ์ 630510619
import java.util.Scanner;

class Employee{
    protected String id;
    protected String name1;
    protected String name2;
    protected String name;

    public void setInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input id : ");
        id = input.next();
        System.out.print("Input name : ");
        name1 = input.next();
        name2 = input.next(); 
    }
    public String getId(){
        return id;
    }
    public String getName(){
        name = name1+' '+name2;
        return name;
    }
}
class Monthly extends Employee{
    private int salary;
    private int period;
    private int reOver;
    private int total;
    public void setSalary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input salary : ");
        salary = input.nextInt();
        System.out.print("Input overtime period : ");
        period = input.nextInt();
    }
    public int getSalary(){
        return salary;
    }
    public int getPeriod(){
        return period;
    }
    public void setOverTime(){
        reOver = period * 200;
    }
    public int getOverTime(){
        return reOver;
    }
    public void setTotal(){
        total = salary + reOver;
    }
    public int getResult(){
        return total;
    }
}
class Commission extends Employee{
    protected int sale;
    protected int ratecom;
    protected int result;//commission value
    public void setCommission(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input total sale : ");
        sale = input.nextInt();
        System.out.print("Input percent of commission rate : ");
        ratecom = input.nextInt();
    }
    public int getSale(){
        return sale;
    }
    public int rateCom(){
        return ratecom;
    }
    public void setResult(){
        result = (sale * ratecom)/100; 
    }
    public int getResult(){
        return result;
    }
}
class Weekly extends Commission{
    private int weekrate;
    private int workweek;
    private int resultw;//wage value
    private int total;
    public void setWeekly(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input weeklyrate : ");
        weekrate = input.nextInt();
        System.out.print("Input working week : ");
        workweek = input.nextInt();
    }
    public int getWeekRate(){
        return weekrate;
    }
    public int getWorkWeek(){
        return workweek;
    }
    public void setResultw(){
        resultw = weekrate * workweek;
    }
    public int getResultw(){
        return resultw;
    }
    public void setTotal(){
        total = result + resultw;
    }
    public int getTotal(){
        return total;
    }
}

class Daily extends Commission{
    private int dailyrate;
    private int workingday;
    private int resultd;//wage value
    private int total;
    public void setDaily(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input dailyrate : ");
        dailyrate = input.nextInt();
        System.out.print("Input working day : ");
        workingday = input.nextInt();
    }
    public int getDailyrate(){
        return dailyrate;
    }
    public int getWorkingDay(){
        return workingday;
    }
    public void setResultd(){
        resultd = dailyrate *workingday;
    }
    public int getResultd(){
        return resultd;
    }
    public void setTotal(){
        total = result + resultd;
    }
    public int getTotal(){
        return total;
    }
}

public class Lab07_2_630510619 {
    public static void main(String[] args){
        int nm,nw,nd;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number of monthly employees : ");
        nm = input.nextInt();
        Monthly[] m = new Monthly[nm];
        for (int i = 0;i<nm;i++){
            System.out.printf("Input person #%d\n",i+1);
            m[i] = new Monthly();
            m[i].setInfo();
            m[i].setSalary();
            m[i].setOverTime();
            m[i].setTotal();
        }
        System.out.println(".......................................................");
        System.out.print("Input Number of weekly employees : ");
        nw = input.nextInt();
        Weekly[] w = new Weekly[nw];
        for (int i = 0;i<nw;i++){
            System.out.printf("Input person #%d\n",i+1);
            w[i] = new Weekly();
            w[i].setInfo();
            w[i].setCommission();
            w[i].setWeekly();
            w[i].setResult();
            w[i].setResultw();
            w[i].setTotal();
        }
        System.out.println(".......................................................");
        System.out.print("Input Number of dailyemployees : ");
        nd = input.nextInt();
        Daily[] d = new Daily[nd];
        for (int i =0;i<nd;i++){
            System.out.printf("Input person #%d\n",i+1);
            d[i] = new Daily();
            d[i].setInfo();
            d[i].setCommission();
            d[i].setDaily();
            d[i].setResult();
            d[i].setResultd();
            d[i].setTotal();
        }
        theResult(m, w, d, nm, nw, nd);
    }
    public static void theResult(Monthly[] m,Weekly[] w,Daily[] d,int nm,int nw,int nd){//เม็ดตอดเเสดงผล
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\tABC Company");
        System.out.println("Monthly Employees");
        System.out.println("ID\tName\t\t\tSalary\t\tOvertimewage\tTotal");
        int sumS = 0;
        int sumO = 0;
        int sumTm = 0;
        for (int i = 0;i<nm;i++){
            String id = m[i].getId();
            String n = m[i].getName();
            int s = m[i].getSalary();
            int o = m[i].getOverTime();
            int r = m[i].getResult();
            sumS += s; 
            sumO += o;
            sumTm += r;
            System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,n,s,o,r);
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",sumS,sumO,sumTm);
        System.out.println("");
        System.out.println("Weekly Employees");
        System.out.println("ID\tName\t\t\tCommission\tMonthly wage\tTotal");
        int sumCw = 0;
        int sumMw = 0;
        int sumTw = 0;
        for (int i =0;i<nw;i++){
            String id = w[i].getId();
            String n = w[i].getName();
            int co = w[i].getResult();
            int mo = w[i].getResultw();
            int to = w[i].getTotal();
            sumCw += co;
            sumMw += mo;
            sumTw += to;
            System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,n,co,mo,to);
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",sumCw,sumMw,sumTw);
        System.out.println("");
        System.out.println("Daily Employees");
        System.out.println("ID\tName\t\t\tCommission\tMonthly wage\tTotal");
        int sumCd = 0;
        int sumMd = 0;
        int sumTd = 0;
        for (int i = 0;i<nd;i++){
            String id = d[i].getId();
            String n = d[i].getName();
            int co = d[i].getResult();
            int mo = d[i].getResultd();
            int to = d[i].getTotal();
            sumCd += co;
            sumMd += mo;
            sumTd += to;
            System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,n,co,mo,to);
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",sumCd,sumMd,sumTd);
    }
}
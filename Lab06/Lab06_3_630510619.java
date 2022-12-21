import java.util.ArrayList;
import java.util.Scanner;

class Star{
    private int number;
    private int point;
    private String name;
    public Star(String n,int p,int num){
        name = n;
        point = p;
        number = num;
    }
    public int renum(){
        return(number);
    }
    public void addPoint(){
        point += 1;
    }
    public int rePoint(){
        return(point);
    }
}

class Voter{
    private String name;
    private int mStar;
    private int fStar;

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input name :");
        name = input.nextLine();
        System.out.print("Input number of actor and number of actress: ");
        mStar = input.nextInt();
        fStar = input.nextInt(); 
    }

    public int rems(){//method for Result number Starman 
        return(mStar);
    }

    public int refs(){//method for Result number Starwoman
        return(fStar);
    }

    public String reName(){//name humnam
        return(name);
    }
}

public class Lab06_3_630510619 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input N : ");
        int num = input.nextInt();
        int i;
        Voter[] p = new Voter[num];
        for (i=0;i<num;i++){
            p[i] = new Voter();
            System.out.printf("Input vote #%d\n",i+1);
            p[i].setData();
        }
        Star ms1 = new Star("Nadech",0,1);
        Star ms2 = new Star("Wier",0,2);
        Star ms3 = new Star("Mario",0,3);
        Star[] ms = new Star[3];
        ms[0] = ms1;
        ms[1] = ms2;
        ms[2] = ms3;

        Star fs1 = new Star("Aum",0,1);
        Star fs2 = new Star("Yaya",0,2);
        Star fs3 = new Star("Bella",0,3);
        Star[] fs = new Star[3];
        fs[0] = fs1;
        fs[1] = fs2;
        fs[2] = fs3;
    
        int[] win = checkAndPrintVote(ms,fs,p);
        printGoodLuckPeople(win,p);
    }
    public static int[] checkAndPrintVote(Star[] ms,Star[] fs,Voter[] voter){
        int i,n;
        n = voter.length;//check len Array
        int[] win = new int[2];
        for (i=0;i<n;i++){
            if (voter[i].rems() == ms[0].renum()){
                ms[0].addPoint();
            }else if (voter[i].rems() == ms[1].renum()){
                ms[1].addPoint();
            }else if (voter[i].rems() == ms[2].renum()){
                ms[2].addPoint();
            }
            if (voter[i].refs() == fs[0].renum()){
                fs[0].addPoint();
            }else if (voter[i].refs() == fs[1].renum()){
                fs[1].addPoint();
            }else if (voter[i].refs() == fs[2].renum()){
                fs[2].addPoint();
            }
        }
        if (ms[0].rePoint() >= ms[1].rePoint() && ms[0].rePoint() >= ms[2].rePoint()){
            win[0] = 1;
            System.out.print("Top star award(Actor)goes to Nadech\n");
        }else if (ms[1].rePoint() > ms[0].rePoint() && ms[1].rePoint() >= ms[2].rePoint()){
            win[0] = 2; 
            System.out.print("Top star award(Actor)goes to Wier\n");
        }else if (ms[2].rePoint() > ms[0].rePoint() && ms[2].rePoint() > ms[1].rePoint()){
            win[0] = 3;
            System.out.print("Top star award(Actor)goes to Mario\n");
        }
        if (fs[0].rePoint() >= fs[1].rePoint() && fs[0].rePoint() >= fs[2].rePoint()){
            win[1] = 1;
            System.out.print("Top star award(Actress)goes to Aum\n");
        }else if (fs[1].rePoint() > fs[0].rePoint() && fs[1].rePoint() >= fs[2].rePoint()){
            win[1] = 2;
            System.out.print("Top star award(Actress)goes to Yaya\n");
        }else if (fs[2].rePoint() > fs[0].rePoint() && fs[2].rePoint() > fs[1].rePoint()){
            win[1] = 3;
            System.out.print("Top star award(Actress)goes to Bella\n");
        }
        return(win);       
    }
    public static void printGoodLuckPeople(int[] win,Voter[] voter){
        int i,n;
        n = voter.length;
        ArrayList<String> people = new ArrayList<String>();
        for(i=0;i<n;i++){
            if(voter[i].rems() == win[0] && voter[i].refs() == win[1]){
                people.add(voter[i].reName());
            }
        }
        System.out.print("Good luck vote -> ");
        for(String result:people){
            System.out.print(result+" ");
        }
    }
}

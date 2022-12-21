//630510619 ณัฐวัฒน์ คำวังสวัสดิ์
package Lab05_1_630510619;
import java.util.Scanner;


class Subjects{
    private char grade;
    private int credit;
    private int gradePoint;
    private int totalPoint;

    public void getData(int num){
        Scanner input = new Scanner(System.in);
        System.out.printf("Subject#%d"+'\n',num);
        System.out.print("input Grade: "); 
        grade = input.nextLine().charAt(0); 
        grade = Character.toUpperCase(grade); 
        System.out.print("input Credit: "); 
        credit = input.nextInt(); 
    }

    public void calTotalPoint(){ 
        if (grade == 'A'){ 
            gradePoint = 4;
        }else if(grade == 'B'){
            gradePoint = 3;
        }else if(grade == 'C'){
            gradePoint = 2;
        }else if(grade == 'D'){
            gradePoint = 1;
        }else if(grade == 'F'){
            gradePoint = 0;
        }
        totalPoint = gradePoint * credit;
    }
    public char getGrade(){
        return(grade);
    }
    public int getCredit(){
        return(credit);
    }
    public int getTotalPoint(){
        return(totalPoint);
    }
    public int getGradePoint(){
        return(gradePoint);
    }

} 


public class Lab05_1_630510619 {
    
    public static void main(String[] args){
        int numSub,sumCredit,sumPoint;
        double gpa;
        Scanner input = new Scanner(System.in);
        System.out.print("input N: ");
        numSub = input.nextInt();
        Subjects[] sub = new Subjects[numSub]; 
        for (int i=0;i<numSub;i++){ 
            sub[i] = new Subjects();
            sub[i].getData(i+1);
            sub[i].calTotalPoint();
        }
        System.out.println();
        System.out.print("           Grade      GradePoint            Credit           TotalPoint");
        System.out.println();
        sumCredit = 0; //total credit
        sumPoint = 0; //total point
        for (int i=0;i<numSub;i++){
            System.out.printf("Subject%d     %s            %d                   %d                  %d"+'\n',i+1,sub[i].getGrade(),sub[i].getGradePoint(),sub[i].getCredit(),sub[i].getTotalPoint());
            sumCredit += sub[i].getCredit();
            sumPoint += sub[i].getTotalPoint();
        }
        System.out.printf("Total                                         %d                 %d"+'\n',sumCredit,sumPoint);
        gpa = sumPoint/(double)sumCredit; //calculate GPA
        System.out.printf("GPA = %.1f",gpa);
    }
}

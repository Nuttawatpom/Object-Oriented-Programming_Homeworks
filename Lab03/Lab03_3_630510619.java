
import java.util.Scanner;
//630510619 ณัฐวัฒน์ คำวังสวัสดิ์
class Student{
    private String grade;
    private int midtermScore;
    private int finalScore;
    private int sumScore;
    private int stuId; //student id

    public void getData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        stuId = input.nextInt();
        System.out.print("Enter midterm and final scores: ");
        midtermScore = input.nextInt();
        finalScore = input.nextInt();
    }

    public void calGrade(){ //calculate grade
        sumScore = midtermScore + finalScore;
        if (sumScore >= 85){
            grade = "A";
        }else if (sumScore >= 80 && sumScore <= 84){
            grade = "B+";
        }else if (sumScore >= 75 && sumScore <= 79){
            grade = "B";
        }else if (sumScore >= 60 && sumScore <= 74){
            grade = "C+";
        }else if (sumScore >= 55 && sumScore <= 59){
            grade = "C";
        }else if (sumScore >= 50 && sumScore <= 54){
            grade = "D+";
        }else if (sumScore >= 45 && sumScore <= 49){
            grade = "D";
        }else{
            grade = "F";
        }
    }
    public void printResult(){
        System.out.printf("%d    %d       %s" + '\n',stuId,sumScore,grade);
    }

}

public class Lab03_3_630510619 {
    public static void main(String[] args) {
        int num, x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        num = input.nextInt();
        Student[] stu = new Student[num];
        for (x =0 ;x < num;x++){ 
            System.out.printf("Enter data for student #%d"+'\n',x+1);
            Student backup = new Student();
            backup.getData();
            backup.calGrade();
            stu[x] = backup; 
        }
        y = 0;
        System.out.println(); 
        System.out.println("No.  StudentID   Score    Grade");
        while (y != num){ //show result
            System.out.printf("%d    ",y+1);
            stu[y].printResult();
            y += 1;
        }
    }
}

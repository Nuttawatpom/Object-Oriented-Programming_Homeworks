package Lab10;
import java.util.Scanner;

abstract class Student{
    protected String name;
    protected int midtermScore;
    protected int filnalScore;

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter mindterm Score: ");
        midtermScore = input.nextInt();
        System.out.print("Enter final Score: ");
        filnalScore = input.nextInt();
    }
    public String getName(){
        return name;
    }
    public int getMidtermScore(){
        return midtermScore;
    }
    public int getFinalScore(){
        return filnalScore;
    }
    public abstract char calGrade(int totalScore);

}

class Ungergraduate_Student extends Student{
    private int projectScore;

    public void setProjectScore(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter project score: ");
        projectScore = input.nextInt();
    }
    public int getProjectScore(){
        return projectScore;
    }
    public char calGrade(int totalScore){
        return(totalScore >= 50 && projectScore >= 50)?'S':'U';
    }
}

class Graduate_Student extends Student{
    private int publicationNo;

    public void setPublicationNo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of publications: ");
        publicationNo = input.nextInt();
    }
    public int getPublicationNo(){
        return publicationNo;
    }

    public char calGrade(int totalScore){
        return(totalScore >= 60 && publicationNo >= 2)?'S':'U';
    }
}

public class Lab10_1_630510619 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student[] std = new Student[100];
        int point = 0;
        char choice;
        
        do{
            System.out.print("Enter undergraduate student or graduate student (u/g): ");
            choice = input.nextLine().charAt(0);
            if(choice =='u'){
                std[point] = new Ungergraduate_Student();
                std[point].setData();
                ((Ungergraduate_Student)std[point]).setProjectScore();
                point++;
            }
            else if(choice == 'g'){
                std[point] = new Graduate_Student();
                std[point].setData();
                ((Graduate_Student)std[point]).setPublicationNo();
                point++;
            }
            else{
                System.out.println("Invalid Type of student");
            }
            System.out.print("Enter another (y/n)?");
            choice = input.nextLine().charAt(0);
        }
        while(choice == 'y');

        reportGrade(std,point);
    }
    public static void reportGrade(Student[] std,int n){
        System.out.print("\nGrade Report\n");
        System.out.print("= = = = = = = = =\n");

        int num_S = 0;
        for (int i =0;i<n;i++){
            System.out.printf("%s ",std[i].getName());
            int mid = std[i].getMidtermScore();
            int fn = std[i].getFinalScore();
            int totalScore = mid + fn;
            System.out.print("gets grade ");
            char grade;
            if(std[i]instanceof Ungergraduate_Student){
                grade = std[i].calGrade(totalScore);
            }
            else{
                grade = std[i].calGrade(totalScore);
            }
            System.out.printf("%c.\n",grade);

            if(grade == 'S'){
                num_S++;
            }
        }
        System.out.printf("Total :Grade U = %d\tGrade S = %d\n",n-num_S,num_S);
    }    
}

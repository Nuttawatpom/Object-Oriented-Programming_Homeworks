import java.util.Scanner;

class Personnel{
    protected String firstname;
    protected String lastname;
    protected int age;

    public void setInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first name :");
        firstname = input.nextLine();
        System.out.print("Input last name :");
        lastname = input.nextLine();
        System.out.print("Input age :");
        age = input.nextInt();
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
}
class Teacher extends Personnel{
    private int salary;
    public void setSalary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input salary :");
        salary = input.nextInt();
    }
    public int getSalary(){
        return salary;
    }
}
class Student extends Personnel{
    private int year;
    public void setStudyYear(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input study year :");
        year = input.nextInt();
    }
    public int getStudyYear(){
        return year;
    }
}

public class Lab07_1_630510619 {
    public static void main(String[] args){
        int n,i,nT,nS;
        char choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Input N :");
        n = input.nextInt();
        Teacher[] t = new Teacher[n];
        Student[] s = new Student[n];
        nT = 0;
        nS = 0;
        for (i=0;i<n;i++){
            System.out.printf("Input person #%d (Teacher or Student ) : ",i+1);
            choice = input.next().charAt(0);
            if (choice == 'T' || choice == 't'){
                t[nT] = new Teacher();
                t[nT].setInfo();
                t[nT].setSalary();
                nT += 1;
            }
            else {
                s[nS] = new Student();
                s[nS].setInfo();
                s[nS].setStudyYear();
                nS += 1;
            }
        }
        printAllStudents(s, nS);
        printAllTeachers(t, nT);
        float avgt = calAndPrintAvgAge(t, s, nS, nT);
        countTeacher(avgt, t, nT);
    }
    public static void printAllStudents(Student[] s,int nS){
        System.out.println("Student");
        System.out.println("\tFirstname\tLastname\tAge\tStudy year");
        for (int i = 0;i<nS;i++){
            String fname = s[i].getFirstName();
            String lname = s[i].getLastName();
            int age = s[i].getAge();
            int year = s[i].getStudyYear();
            System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\n",i+1,fname,lname,age,year);
        }
        System.out.println();
    }
    public static void printAllTeachers(Teacher[] t,int nT){
        System.out.println("Teacher");
        System.out.println("\tFirstname\tLastname\tAge\tSalary");
        for (int i = 0;i<nT;i++){
            String fname = t[i].getFirstName();
            String lname = t[i].getLastName();
            int age = t[i].getAge();
            int salary = t[i].getSalary();
            System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\n",i+1,fname,lname,age,salary);
        }
        System.out.println();
    }
    public static float calAndPrintAvgAge(Teacher[] t,Student[] s,int nS,int nT){
        int sums = 0;
        int sumt = 0;
        float avgs;
        float avgt;
        for (int i = 0;i<nS;i++){
            int age = s[i].getAge();
            sums += age;
        }
        avgs = (float)sums/nS;
        for (int i = 0;i<nT;i++){
            int age = t[i].getAge();
            sumt += age;
        }
        avgt = (float)sumt/nT;
        System.out.printf("Average of student age = %.2f\n",avgs);
        System.out.printf("Average of teacher age = %.2f\n",avgt);
        return avgt;
    }
    public static void countTeacher(float avgt,Teacher[] t,int nT){
        int sumt = 0;
        for (int i = 0;i<nT;i++){
            int age = t[i].getAge();
            if (age < avgt){
                sumt += 1;
            }
        }
        System.out.printf("Number of teachers who have age below average = %d\n",sumt);
    }
}

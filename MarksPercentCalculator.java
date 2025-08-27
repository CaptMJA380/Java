import java.util.Scanner;
public class MarksPercentCalculator {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        float total_marks;
        System.out.println("Enter marks of Subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks of Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks of Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks of Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks of Subject 5: ");
        float sub5 = sc.nextFloat();

        total_marks = sub1+sub2+sub3+sub4+sub5 ;
        float percentage = total_marks/500*100;

        System.out.println("Your percentage is: "+percentage);
    }
}

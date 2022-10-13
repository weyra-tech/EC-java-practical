import java.util.Scanner;

public class DayFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter ur marks");
        double marks= input.nextDouble();
        if(marks>=25 && marks<=45)
        {
            System.out.println("ur grade is E");
        } else if (marks >45 && marks<=50)
        {
            System.out.println("ur grade is D");
            
        } else if (marks>50 && marks<=60)
        {
            System.out.println("Ur grade is C");
        } else if (marks>60 && marks<=80) {
            System.out.println("Ur grade is B");

        } else if (marks>80) {
            System.out.println("Ur grade is A");

        }
        else {
            System.out.println("Ur grade is F");
        }


    }
}

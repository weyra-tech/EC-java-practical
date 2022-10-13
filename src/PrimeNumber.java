import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Pls Enter the number u want to cheak");
        int primeNUmber= input.nextInt();

        System.out.println("the number u eneterd is prime  "+primeCheack(primeNUmber));

    }
    public static boolean primeCheack(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
       return true;
    }

}

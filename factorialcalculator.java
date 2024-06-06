import java.util.Scanner;
public class factorialcalculator {
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            
            factorial *= i;
        }
        System.out.printf("Gabriel the factorial of num is %d = %d", num, factorial);
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a number: ");
     int n = reader.nextInt(); 

reader.close();
       
    }
}
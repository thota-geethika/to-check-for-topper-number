import java.util.Scanner;

public class CheckForTopperNumber {
    public static void main(String[] args) {

        // Taking input from user;
        String numberToCheck;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a probable topper number or not: ");
        numberToCheck = scan.next();

        int evenSum = 0;
        int oddSum = 0;

        for(int iterator=0;iterator<numberToCheck.length();iterator++)
        {
            int currentNumber = Character.getNumericValue(numberToCheck.charAt(iterator));
            if(currentNumber%2 == 0)
            {
                evenSum += currentNumber;
            }
            else
            {
                oddSum += currentNumber;
            }
        }

        //Checking if oddSum is equal to evenSum
        if(oddSum == evenSum)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
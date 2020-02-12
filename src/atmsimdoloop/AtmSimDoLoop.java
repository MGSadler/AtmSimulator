/*Program should start with an initial account balance, which can be set to any double value.
 *All output of currency values should include a leading dollar sign and use 2 decimal positions.
 */

/*Prompt the user with the following prompt
*"Enter the number of your desired transaction type."
*"1. Balance"
*"2. Deposit"
*"3. Withdrawal"
*"4. Quit"
*/

/*If a balance is requested the program should output "Your current balance is $X.XX" where X.XX is the initial balance,
and then re-display the prompt and await the next transaction type.
*If a deposit is requested, prompt the user to enter the amount of the deposit (use a double for this).  Add the deposit
amount to the initial balance and then print "Your current balance is $X.XX" where X.XX is the new balance after the deposit,
then re-display the prompt and await the next transaction type.
*If a withdrawal is requested, prompt the user to enter the amount of the withdrawal (use a double for this).  If the proposed
withdrawal amount is less than or equal to the initial balance, prin "Your current balance is $X.XX" where X.XX is the new
balance after the withdrawal, and then re-display the prompt and await the next transaction type.  If the proposed withdrawal
amount exceeds the initial balance, print "Insufficient funds.  Your current balance is $X.XX" where X.XX is the initial
balance, and then re-display the prompt and await the next transaction type.
*If "Quit" is requested, the program should print "Good-bye" and then stop.
*/

//Note that you need to keep track of the current balance during each loop iteration.

package atmsimdoloop;

import java.util.Scanner;

public class AtmSimDoLoop {
    
    static double startBalance = 250.00;

    public static void deposit(double currentBalance) {
        startBalance += currentBalance;
        display();
    }
    
    public static void display(){
        System.out.printf("Your current balance is $%1.2f\n", startBalance);
    }
    public static void withdrawal(double currentBalance) {
        if(currentBalance > startBalance){
            System.out.printf("Insufficient funds.  Your current balance is $%1.2f\n", startBalance);
        }
        else{
            startBalance-=currentBalance;
            display();}
    }
    public static void main(String[]args){
        int userInput;
        Scanner selection = new Scanner(System.in);
        
        do{
            System.out.println("Enter the number of your desired transaction type.");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Quit");
            
            userInput = selection.nextInt();
            
            switch(userInput){
                case 1:display();
                break;
                
                case 2:System.out.println("Please enter the amount of the deposit");
                double currentBalance = selection.nextDouble();
                deposit(currentBalance);
                break;
                
                case 3:System.out.println("Please enter the amount of the withdrawal");
                double currentBalance1 = selection.nextDouble();
                withdrawal(currentBalance1);
                break;
                
                case 4:return;
                
                default: System.out.println("Error! Please select a number between 1 and 4\n");
            }
            }while(userInput != 4);
        {
            
        }
           
    }
        
}

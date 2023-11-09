import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double intialbalance){
        balance=intialbalance;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount<balance){
        balance=balance-withdrawAmount;
        System.out.println("Withdrawal successful. Current balance: " +balance);
        }
        else{
            System.out.println("amount insufficient");
        }

    }

    public void deposit(double depositAmount){
        balance=balance+depositAmount;
        System.out.println("Deposit successful. Current balance: " +balance);

    }

    public void cheakBalance()
    {

        System.out.println("your current balance : "+balance);
    }
}
public class Atm{
    public static void main(String args[]){
        double intialbalance=500000.99;
        BankAccount ac=new BankAccount(intialbalance);
        Scanner ob=new Scanner(System.in);
       int a;
       do{
        System.out.println("enter your choice :");
        System.out.println("1.Withdraw"+"\n"+"2. Deposit"+"\n"+"3. Check Balance"+"\n"+"4. Exit");
        a=ob.nextInt();
        switch(a){
            case 1:
            System.out.println("enter your withdraw amount :");
            double withdrawAmount=ob.nextDouble();
            ac.withdraw(withdrawAmount);
            break;

            case 2:
            System.out.println("enter your deposit amount :");
            double depositAmount=ob.nextDouble();
            ac.deposit(depositAmount);
            break;

            case 3:
           ac.cheakBalance();
            break;

            case 4:
            System.out.println("Exiting. Thank you!");
            break;

            default :
            System.out.println("Invalid choice. Please try again.");
            break;

        }
       
}while(a!=4);
ob.close();
    }
    
}
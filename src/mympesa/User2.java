
package mympesa;
import java.util.Scanner;

public class User2 {
    
    int user2 = 300;
    private String name;
    public final int cost = 10;
   Scanner input = new Scanner(System.in);
   int balance = 200;
   public void deposit(){
       int amt;
       System.out.print("enter amount to deposit: ");
       amt = input.nextInt();
       balance = amt + balance;
       if(amt <= 0){
           System.out.println("Invalid amount please enter the right amount");
       } else{
           System.out.println("Successfully deposited Ksh" + amt + " new balance is Ksh" + balance);
       }
      
   }

     public void withdraw(){
      
      int amt;
      System.out.print("Enter amount to withdraw: ");
      amt = input.nextInt();
      if(amt < balance){
          balance = balance - amt - cost;
          System.out.println("Successfully withdrawn Ksh" + amt  + " new balance is Ksh" + balance);
      }else{
          
          System.out.println("insufficient funds please top up to withdraw ");
      }
     }
     public void balance(){
         int amt;
         System.out.print("Type 0 to check your balance");
         amt = input.nextInt();
        
         System.out.println("Your Balance is Ksh" + balance);
     }
     public String getName(){
         return name;
     }
     public void setName(){
        System.out.print("Enter name: ");
          this.name = input.nextLine();  
        }   
     public void payBill(){
         int amt;
         System.out.print("Enter amount to pay: ");
         amt = input.nextInt();
         if(amt < balance){
             balance = balance - amt;
             System.out.println("Successfull paid the bill of Ksh" + amt + " new balance is Ksh" + balance);
         } else{
             System.out.println("Payment was unsuccessful please top up");
         }
         
     }
     public void sendMoney(){
         int amt1;
         System.out.print("Enter amount to send: ");
         amt1 = input.nextInt();
         if(amt1 < balance){
             balance = balance - amt1 - cost;
             System.out.println("Successfully transfered Ksh" + amt1 + " your new balance is Ksh" + balance);
         } else{
             System.out.println("Insufficient funds please top up to be able to transfer");
         }
         
     }
     
}


package mympesa;

import java.util.Scanner;

public class MyMpesa {
    

    public static void main(String[] args) {
        
        User2 user2 = new User2();
        User1 user1 = new User1();
        Agent agent = new Agent();
        database db = new database();
        
        System.out.println("Select from the menu\n1.Deposit \n2.Withdraw \n3.Send  \n4.Balance \n5.Register user \n6.Pay bill \n7. Delete user");
        
        Scanner input = new Scanner(System.in);
        int  one=1 ;
        int two=2;
        int three=3;
        int four=4;
        int five = 5;
        int six = 6;
        int userinput=input.nextInt();
        
        int choices=userinput;
        
       
        switch (choices){
            case 1:choices=1;
                agent.agentNumber();
                user2.deposit();
                
                
                break;
                case 2:choices = 2;
                agent.agentNumber();
                 user2.withdraw();
                break;
                case 3: choices = 3;
                user2.sendMoney();
                break;
                case 4: choices = 4;
                user2.balance();
                agent.openConnection();
                
                break;
                case 5 : choices = 5;
                //user2.setName();
                agent.openConnection();
                agent.insertCustomer();
                agent.deposit();
                   
                //System.out.println("Successfully registerd " + user2.getName());
                break;
                case 6 : choices = 6;
                user2.payBill();
                break;
                
                 
                case 7: choices = 7;
                 agent.openConnection();
                agent.delete();
                }
        
              
    
        
    }
    
}

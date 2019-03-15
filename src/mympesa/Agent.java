
package mympesa;
import java.util.Scanner;
import java.sql.*;
public class Agent {
   
    private String firstName;
    private  String lastName;
    private String dob;
    private String idNumber;
     private int amount;
    private Connection conn;
    private Statement statement;
    private String name;
   
    public int number; 
   Scanner input = new Scanner(System.in);
   int balance = 10000;
    public Connection openConnection()
    {
        if (conn == null){
            String url = "jdbc:mysql://localhost:3306/paymentsystem?zeroDateTimeBehaviour=convertToNull[root on Default schema]";
            String dbName = "paymentsystem";
                    
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try{
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection( url + dbName,userName,password);
                System.out.println("Connection successful");
            }
            catch
        (Exception e){
            System.out.println(e);
            }
        }
        return conn;
    }
    public String getFirstName(){
        return firstName;
    }
    public String setFirstName(String FirstName){
        this.firstName = FirstName;
        return FirstName;
    }
    public String getLasttName(){
        return lastName;
    }
    public String setLastName(String LastName){
        this.lastName = LastName;
        return LastName;
    }
    public String getDob(){
        return dob;
    }
    public String setDob( String DOB){
        this.dob =  DOB;
        return DOB;
    }
    public String getIdNumber(){
        return idNumber;
    }
    public String setIdNumber( String idnumber){
        this.idNumber = idnumber;
        return idnumber;
    }
    public int getAmount(){
        return amount;
    }
    public int setAmount( int Amount){
        this.amount = Amount;
        return Amount;
    }
    public void insertCustomer(){
        try{
        Statement statement = conn.createStatement();
        Scanner input = new Scanner(System.in);
        database db = new database();
        
        
        
        System.out.print("Enter First Name: ");
        String FirstName = setFirstName(input.next());
        System.out.print("Enter Last Name: ");
        String LastName = setLastName(input.next());
        System.out.print("Enter dob: ");
        String DOB = setDob(input.next());
        System.out.print("Enter ID number: ");
        String idnumber = setIdNumber( input.next());
        System.out.print("Enter amount: ");
        int Amount = setAmount( input.nextInt());
        
       

      String sql;
      sql = "INSERT INTO users( firstName,lastName,dob,idNumber,amount)"  
           +" VALUES ( ?, ?,?, ?,?)";
            PreparedStatement insert =conn.prepareStatement(sql);
            insert.setString(1, firstName);
            insert.setString(2, lastName);
            insert.setString(3, DOB);
            insert.setString(4, idNumber);
            insert.setInt(5, amount);
            insert.executeUpdate();

       
        } catch(Exception e){
          
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage());
            
        }
    }
   public void deposit(){
       try{
         Statement statement = conn.createStatement();
         
         
        
        System.out.print("enter id");
         int id =  input.nextInt();
         System.out.print("Enter amount: ");
        int Amount = input.nextInt();
        
       statement.executeUpdate("UPDATE users SET amount = '" + Amount  +"' where id ='"+id+"'");
       }catch(Exception e){
          
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage());
            
        }
   }
   public void delete(){
       try{
         System.out.print("Enter id to delete:");  
       int id = input.nextInt();
       Statement statement = conn.createStatement();
       statement.executeUpdate("DELETE FROM users where id = '"+id+"'");
       
   }catch(Exception e){
          
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage());
   }
   }
   public void agentNumber(){
       System.out.println("Enter agent number");
      number = input.nextInt();
      
         try {
          if (number != 7535);
          
         }  catch (Exception e){
                 System.out.println("Something went wrong");
             }
      }
   

     public void withdraw(){
          try{
         Statement statement = conn.createStatement();
        System.out.print("enter id");
         int id =  input.nextInt();
         System.out.print("Enter amount: ");
        
        int Amount = input.nextInt();
       statement.executeUpdate("UPDATE users SET amount = '" + Amount +"' where id ='"+id+"'");
       }catch(Exception e){
          
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage());
            
        }
     
     }
     public void balance(){
         try{
         Statement statement = conn.createStatement();
        System.out.print("enter id");
         int id =  input.nextInt();
          statement.executeUpdate("SELECT amount FROM users where id = id");
     }catch(Exception e){
          
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage());
     }
     }
     public String getName(){
         return name;
     }
     public void setName(){
        System.out.print("Enter name: ");
          this.name = input.nextLine();  
        }   
}

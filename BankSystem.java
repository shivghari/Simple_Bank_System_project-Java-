import java.util.Scanner;


class Bank
{
    String name;
    String Address;
    String MobileNo;
    int accountNumber;
    int Balance;
    int Password;
    String UserName;
    private String Acctype;

    public void insertInfo()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Account Holder name : ");
        name = s1.nextLine();    
        System.out.print("Enter Account user Name : ");
        UserName = s1.nextLine();
        System.out.print("Enter the Address : ");  
        Address = s1.nextLine();  
        System.out.print("Enter the Mobile No : ");
        MobileNo = s1.nextLine();    
        System.out.print("Enter the Account-Number : ");    
        accountNumber = s1.nextInt();
        System.out.print("Enter the Balance : ");    
        Balance = s1.nextInt();
        System.out.print("Enter the Password : ");  
        Password = s1.nextInt();
        
        if(UserName.equals(name))
        {
            Acctype = "Single Account";
        }
        else
        {
            Acctype = "Joint Account";
        }
    }
    public void showInfo()
    {
        System.out.println("-------------------------------");
        System.out.println("Account Holder Name : "+name);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Residance Addresss : "+Address);
        System.out.println("Mobile-NO : "+MobileNo);
        System.out.println("Account Password : "+Password);
        System.out.println("Account User : "+UserName);
        System.out.println("Account type : "+Acctype);
        System.out.println("Current Banalce : "+Balance);
        System.out.println("-------------------------------");
    }
    public Bank()
    {
        name  = "";
        Address = "";
        MobileNo = "";
        accountNumber = 0;
        Balance = 0;
        Password = 0;
        UserName = "";
    }
    public int RetAcc()
    {
        return accountNumber;
    }
    public int RetPass()
    {
        return Password;
    }
    public String RetUser()
    {
        return name;
    }
    public int Deposit(int DeopsitedCash)
    {
        Balance = Balance + DeopsitedCash;
        return Balance;
    }
    public int Widraw(int WidrawCash)
    {
        Balance = Balance - WidrawCash;
        return Balance;
    }
}
public class BankSystem
{
    public static void main(String args[])
    {
            
            Bank [] ac = new Bank[100];
            int n = 0;      
            char loop;
            do
                {
                Scanner s2 = new Scanner(System.in);
                System.out.println("------------------------");
                System.out.println("Welcome To Xyz Bank Ltd.");
                System.out.println("------------------------");
                System.out.println("1. Add Account");
                System.out.println("2. Diposit Cash");
                System.out.println("3. Withdraw CAsh");
                System.out.println("4. View Details");
                System.out.println("5. Change Details");
                System.out.println("6. Close Account");
                System.out.println("7. Exit");
                System.out.println("------------------------");
                System.out.print("Enter your Choice :  ");
                int choise;
                choise = s2.nextInt();
                switch(choise)
                {
                    case 1:
                            System.out.println("---------------------");
                            System.out.println("NEW ACCOUNT COUNTER");
                            System.out.println("---------------------");
                            ac[n] = new Bank();
                            ac[n].insertInfo();
                            n++;
                            break;

                    case 2:
                            System.out.println("---------------------");
                            System.out.println("CASH DEPOSIT COUNTER");
                            System.out.println("---------------------");
                            Scanner s4 = new Scanner(System.in);
                            int CheckPass;
                            int CheckAccno; 
                            System.out.print("Enter the Account-No  = ");
                            CheckAccno = s4.nextInt();
                            System.out.print("Enter the Password  = ");
                            CheckPass = s4.nextInt();
                            
                            for(int k=0;k<100;k++)
                            {
                                if(CheckAccno == ac[k].RetAcc())
                                {
                                    if(CheckPass == ac[k].RetPass())
                                    {

                                        int amount;
                                        int current;
                                        System.out.print("Enter the amount to be deposited : ");
                                        amount = s4.nextInt();
                                        current = ac[k].Deposit(amount);
                                        System.out.println("------------------------------------------------------------");
                                        System.out.println("Account No \t Deposied amount \t Current Balance ");
                                        System.out.println(CheckAccno +"\t\t "+ amount +"\t\t\t "+ current );
                                        System.out.println("------------------------------------------------------------");
                                         break;
                                    }
                                    else
                                    {
                                        System.out.println("Incorrect Password !");
                                    }
                                    
                                }
                                    
                            }
                            
                            break;

                    case 3:
                            System.out.println("---------------------");
                            System.out.println("CASH WITHDRAW COUNTER");
                            System.out.println("---------------------");
                            Scanner s7 = new Scanner(System.in);
                            int CheckPass1;
                            int CheckAccno1; 
                            System.out.print("Enter the Account-No  = ");
                            CheckAccno1 = s7.nextInt();
                            System.out.print("Enter the Password  = ");
                            CheckPass1 = s7.nextInt();
                            
                            for(int k=0;k<100;k++)
                            {
                                if(CheckAccno1 == ac[k].RetAcc())
                                {
                                    if(CheckPass1 == ac[k].RetPass())
                                    {

                                        int Widamount;
                                        int current;
                                        System.out.print("Enter the amount to be withdrawed : ");
                                        Widamount = s7.nextInt();
                                        current = ac[k].Widraw(Widamount);
                                        System.out.println("------------------------------------------------------------");
                                        System.out.println("Account No \t Withdrawed amount \t Current Balance ");
                                        System.out.println(CheckAccno1 +"\t\t "+ Widamount +"\t\t\t "+ current );
                                        System.out.println("------------------------------------------------------------");
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Incorrect Password !");
                                    }
                                    
                                }
                                    
                            } 
                            break;
                    
                    case 4:
                            System.out.println("---------------------");
                            System.out.println("SHOW DATA COUNTER");
                            System.out.println("---------------------");
                            int accNo;
                            Scanner s6 = new Scanner(System.in);
                            System.out.print("Enter the Accouny-no : ");
                            accNo = s6.nextInt();
                            int pass;
                            System.out.print("Enter the Password : ");
                            pass = s6.nextInt();
                            for(int i=0;i<100;i++)
                            {
                                if(accNo == ac[i].RetAcc())
                                {
                                    if(pass == ac[i].RetPass())
                                    {
                                        System.out.println("---------------------");
                                        System.out.println("YOUR REQUESTED DATA");
                                        System.out.println("---------------------");
                                        ac[i].showInfo();
                                        
                                        break;
                                    }
                                }
                            }
                            break;
                    
                    case 5:
                            System.out.println("---------------------");
                            System.out.println("MODIFY DATA COUNTER");
                            System.out.println("---------------------");
                            Scanner s8 = new Scanner(System.in);
                            int CheckPass2;
                            int CheckAccno2; 
                            System.out.print("Enter the Account-No  = ");
                            CheckAccno2 = s8.nextInt();
                            System.out.print("Enter the Password  = ");
                            CheckPass2 = s8.nextInt();
                            
                            for(int k=0;k<100;k++)
                            {
                                if(CheckAccno2 == ac[k].RetAcc())
                                {
                                    if(CheckPass2 == ac[k].RetPass())
                                    {
                                        Scanner s10 = new Scanner(System.in);
                                        System.out.print("Chnaging the data of the account-no "+CheckAccno2+"\n");
                                        System.out.print("Enter the modified name : ");
                                        ac[k].name = s10.nextLine();
                                        System.out.print("Enter the modified Address : ");
                                        ac[k].Address = s10.nextLine();
                                        System.out.print("Entet the modified nuhmber : ");
                                        ac[k].MobileNo = s10.nextLine();
                                        System.out.print("Enter the modified User name : ");
                                        ac[k].UserName = s10.nextLine();
                                        System.out.print("Enter the updated password : ");
                                        ac[k].Password = s10.nextInt();
                                        System.out.print("Account modified Succcessfully ..!");
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Incorrect Password !");
                                    }
                                    
                                }
                                    
                            }

                            break;
                    
                    case 6:
                                    
                            System.out.println("---------------------");
                            System.out.println("CLOSING ACCOUNT COUNTER");
                            System.out.println("---------------------");
                            Scanner s11 = new Scanner(System.in);
                            int CheckPass3;
                            int CheckAccno3; 
                            System.out.print("Enter the Account-No  = ");
                            CheckAccno3 = s11.nextInt();
                            System.out.print("Enter the Password  = ");
                            CheckPass3 = s11.nextInt();
                            
                            for(int k=0;k<100;k++)
                            {
                                if(CheckAccno3 == ac[k].RetAcc())
                                {
                                    if(CheckPass3 == ac[k].RetPass())
                                    {
                                        int CheckClose;
                                        System.out.println("Are you Sure to Close this Account..?(1 for Yes || 0 For no) : ");
                                        CheckClose = s11.nextInt();
                                        if(CheckClose == 1)
                                        {
                                            ac[k].name  = "";
                                            ac[k].Address = "";
                                            ac[k].MobileNo = "";
                                            ac[k].Balance = 0;
                                            ac[k].Password = 9999;
                                            ac[k].UserName = "";
                                            ac[k].accountNumber = CheckAccno3;
                                            System.out.println("The Account with Account-no : "+CheckAccno3+" is Colsed, From Now you Can't operate this Account....!");
                                            System.out.println("This Account Can't be  given to another person.....!");
                                        }
                                        else
                                        {
                                            System.out.println("thankyou For Continue with XYX Bank...");
                                        }
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Incorrect Password !");
                                    }
                                    
                                }
                                    
                            }
                            
                        break;
                
                    case 7:
                            System.out.println("Visit  Again.....!");
                            break;
                    
                    default:
                            System.out.println("Enterthe valid choise...!");
                            break;
                }


                    Scanner s5 = new Scanner(System.in);
                    System.out.print("Go to Home (Y/N)");
                    loop = s5.nextLine().charAt(0);

            }
            while(loop != 'n');
        
    }
}

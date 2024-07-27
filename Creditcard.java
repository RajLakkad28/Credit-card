package com.mycompany.project;
import java.util.Scanner;
import java.io.*;

public 
        class Project extends BankAccount {

	public static void main(String[] args) {
		
               
                int x=0;
                int y=0;
                int ch;
               
		BankAccount obj = new BankAccount();
                Scanner scanner = new Scanner(System.in);
                obj.getdata();
                do{
                     System.out.println("...............................................................");
                     System.out.println("1.If You Want To Pay Money: ");
                     System.out.println("2.If You Want To Check Expence History: ");
                     System.out.println("3.Exit\n");
                     System.out.println("...............................................................");
                     System.out.print("enter your choise : ");
                     ch = scanner.nextInt();
                    
                
                                        
                if(ch==1)
                {
                    x=1;
                }
                switch(ch)
                {
                    case 1:
                         
                            obj.payment();
                           
                           
                           obj.display1();
                         try{
                              BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\new.txt"));
                              bw.write("How Many Transaction : "+obj.n+"\n");
                              for(int i=0;i<n;i++)
                              {
                                  bw.write("Platform : "+obj. expensename[i]+"\n");
                                  bw.write("Expence : "+obj. a[i]+"\n\n\n");
                                  
                              }
                              
                bw.write("***********************************************************************************************************\n");
                bw.write("*                                        total expense of this month                                      *\n");
                bw.write("***********************************************************************************************************\n");
                bw.write("platform"+"                                   expense"+"                              cashback\n");
                bw.write("________                                   _______                              ________\n ");
                bw.write("reliancemall"+"                               10000$"+"                                 500\n");
                bw.write("petrolpump"+"                                 5000$"+"                                  100\n");
                bw.write("Amazon"+"                                     7500"+"                                   225\n");
                bw.write("school fees"+"                                14000$"+"                                 980\n");
                bw.write("airport"+"                                    8500$"+"                                  255\n");
                bw.write("school fees"+"                                14000$"+"                                 980\n");
                bw.write("***********************************************************************************************************\n");
                bw.write("                                         Extra expense of this month\n");
                bw.write("___________________________________________________________________________________________________________\n");
                
                for(i=0;i<j;i++)
                {
                    if(obj.a[i]<=5000)
                    {
                        obj.b[i]=(obj.a[i]*2)/100;                        
                   }
                    else if(a[i]>5000 && a[i]<=10000)
                    {
                        obj.b[i]=(obj.a[i]*3)/100;
                    }
                    else if(obj.a[i]>10000 && obj.a[i]<=20000)
                    {
                        obj.b[i]=(obj.a[i]*5)/100;
                    }
                    else if(obj.a[i]>20000 && obj.a[i]<=30000)
                    {
                        obj.b[i]=(obj.a[i]*6)/100;
                    }
                    else if(obj.a[i]>40000 && obj.a[i]<=55000)
                    {
                        obj.b[i]=(obj.a[i]*8)/100;
                    }
                }
                for(i=0;i<obj.j;i++)
                {
                bw.write(obj.expensename[i]+"                                            "+obj.a[i]+"$"+"                                   "+obj.b[i]+"\n");
                
                }
                bw.write("\n\n                  Cashback  Successfully credited into your bank account\n\n");
                            
                              bw.close();
                              
                         }
                         catch(Exception ex)
                         {
                             return;
                         } 
                         
                         if(y==0)
                         {
                         try{
                             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\1.txt"));
                             
                             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\new.txt"));
                             
                             String s;
                             
                             while((s=br.readLine()) != null)
                             {
                                 bw.write(s+"\n");
                             }
                             br.close();
                             bw.close();
                         }
                         catch(Exception ex)
                         {
                             return;
                         }
                         }
                         if(y==1)
                         {
                         try{
                             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\2.txt"));
                             
                             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\new.txt"));
                             
                             String s;
                             
                             while((s=br.readLine()) != null)
                             {
                                 bw.write(s+"\n");
                             }
                             br.close();
                             bw.close();
                         }
                         catch(Exception ex)
                         {
                             return;
                         }
                         }
                         if(y==2)
                         {
                         try{
                             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\3.txt"));
                             
                             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91635\\OneDrive\\Desktop\\Expence\\new.txt"));
                             
                             String s;
                             
                             while((s=br.readLine()) != null)
                             {
                                 bw.write(s+"\n");
                             }
                             br.close();
                             bw.close();
                         }
                         catch(Exception ex)
                         {
                             return;
                         }
                         }
                         
                        
                           y++;
                            
                            break;
                            
                    case 2:  if(x==0)
                    {
                        obj.display();
                    }
                        else
                    {
                        obj.display1();
                    }
                    break;
                    
                    default: System.out.println("Invalid Choice..............................");
                        
                        
                }
		//obj.showMenu();
               
               
               }while(ch!=3);
               
	}
         
}

class BankAccount{
	String bankname;
        String ifsc;
	long  accno;
        static int h=0;
        static int k=0;
        
        static int i=0;
        static int n;
        static int j=0;
        static int c=0;
        static double expense1=0;
       static double expense=45000;
        static String expensename[]=new String [10];
        static double[] a=new double[40];
        static double[] b=new double[40];
	
	void getdata() 
        {
		Scanner scanner = new Scanner(System.in);
                System.out.print("enter bank name : ");
                 bankname = scanner.nextLine();
                 System.out.print("enter IFSC code. : ");
                ifsc = scanner.nextLine();
                System.out.print("enter account no. : ");
                accno = scanner.nextInt();
                
	}
	void display()
        {
                int limit=100000;
                System.out.println("credit card limit is : "+limit);
                int used=45000;
                System.out.println("this month expenses: "+used);
                System.out.println("***********************************************************************************************************");
                System.out.println("*                                          history of expense                                             *");
                System.out.println("***********************************************************************************************************");
                System.out.println("platform"+"                                   expense"+"                              cashback");
                System.out.println("________                                   _______                              ________ ");
                System.out.println("reliancemall"+"                               10000$"+"                                 500");
                System.out.println("petrolpump"+"                                 5000$"+"                                  100");
                System.out.println("Amazon"+"                                     7500"+"                                   225");
                System.out.println("school fees"+"                                14000$"+"                                 980");
                System.out.println("airport"+"                                    8500$"+"                                  255");
                System.out.println("___________________________________________________________________________________________________________");
        }
        void payment()
        {
             Scanner scanner = new Scanner(System.in);
            
            System.out.println("how many transaction you want to pay now: ");
            n=scanner.nextInt();
              
            
                
               while(expense<=100000)
            {
                
                for(i=h;i<n+h;i++)
                {
                System.out.println("add extra expense of this month: ");
                System.out.print("add plateform: ");
                expensename[i] = scanner.next();
                System.out.print("add expense: ");
                a[i] = scanner.nextDouble();
                if(expense+a[i]<=100000){
                expense=expense+a[i];
                }
                else{
                System.out.println("expense is more then your valid limit: ");
                
                break;
            }
             k++;
             j++;  
            } break;}
            
            System.out.println("expense: "+expense);
            h=k;
           
       
        
	
}
        
        
        
        void display1()
        {
                System.out.println("***********************************************************************************************************");
                System.out.println("*                                        total expense of this month                                             *");
                System.out.println("***********************************************************************************************************");
                System.out.println("platform"+"                                   expense"+"                              cashback");
                System.out.println("________                                   _______                              ________ ");
                System.out.println("reliancemall"+"                               10000$"+"                                 500");
                System.out.println("petrolpump"+"                                 5000$"+"                                  100");
                System.out.println("Amazon"+"                                     7500"+"                                   225");
                System.out.println("school fees"+"                                14000$"+"                                 980");
                System.out.println("airport"+"                                    8500$"+"                                  255");
                System.out.println("school fees"+"                                14000$"+"                                 980");
                System.out.println("***********************************************************************************************************");
                System.out.println("                                         Extra expense of this month");
                System.out.println("___________________________________________________________________________________________________________");
                for(i=0;i<j;i++)
                {
                    if(a[i]<=5000)
                    {
                        b[i]=(a[i]*2)/100;                        
                   }
                    else if(a[i]>5000 && a[i]<=10000)
                    {
                        b[i]=(a[i]*3)/100;
                    }
                    else if(a[i]>10000 && a[i]<=20000)
                    {
                        b[i]=(a[i]*5)/100;
                    }
                    else if(a[i]>20000 && a[i]<=30000)
                    {
                        b[i]=(a[i]*6)/100;
                    }
                    else if(a[i]>40000 && a[i]<=55000)
                    {
                        b[i]=(a[i]*8)/100;
                    }
                }
               
                for(i=0;i<j;i++)
                {
                System.out.println(expensename[i]+"                                            "+a[i]+"$"+"                                   "+b[i]);
                
                }
                System.out.println("\n                    Cashback  Successfully credited into your bank account");
                }
        }


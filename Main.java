import java.util.Scanner;

class Main{


public static void main(String[] args){


Scanner sc = new Scanner(System.in);

ContactBook cb = new ContactBook();




String name="";
Long number=0L;
String email="";
boolean exit=false;



while(!exit){

System.out.println("\nMenu:\n1.Add Contact\n2.Search Contact\n3.delete Contact\n4.List All Contacts\n5.Exit\n6.updateContact\n7.countContacts\n8.searchByNumber\nEnter Your Choice");

int operation=sc. nextInt();
sc.nextLine();


switch (operation){

                           case 1:
                                  System.out.println("\nEnter name");
                                  name = sc.nextLine();
                                  

                                  boolean validate=false;
                                  boolean skipped = false;
                                  while(!validate){
                                           System.out.println("\nEnter number");
                                           String temp = sc.nextLine();
                                       
                                           if (temp.length()==10 && temp.matches("[0-9]+")){
                                                         number=Long.parseLong(temp);
                                                         validate=true;}
                                  
                                          else{
                                                        System.out.println("\nInvalid Number");
                                                        System.out.println("\n1.Add valid number / 2.Skip");
                                                        int choice=sc.nextInt();
                                                        sc.nextLine();
                                                        if(choice == 1){
                                                                 continue;}
                                                        else{
                                                                 validate=true;
                                                                 skipped=true;}
                                              }
                                   }
                                  
                                  if(!skipped){
                                  System.out.println("\nEnter Email");
                                  email=sc.nextLine();

                                  cb.addContact(name,number,email);}
                                  else{System.out.println("\nContact Not Added");}
                                  break;

                          case 2:

                                  System.out.println("\nEnter Contact name");
                                  name=sc.nextLine();

                                  cb.searchContact(name);
                                  break;

                          case 3:

                                  System.out.println("\nEnter Contact");
                                  name=sc.nextLine();

                                  cb.deleteContact(name);
                                  break;

                          case 4:

                                  cb.listAllContacts();
                                  break;

                          case 5:
     
                                  System.out.println("\nGoodbye!");
                                  exit=true;
                                  break;
  
                          case 6:
     
                                  System.out.println("\nEnter Contact Name");
                                  name=sc.nextLine();

                                  if(cb.checkContact(name)){
     
                                  System.out.println("\nWhat do you want  to update? Number/Email/Both");
                                  String choice=sc.nextLine();
    

                                  if (choice.equals("Number")){

                                                 System.out.println("\nEnter Number");
                                                 number=sc.nextLong();
                                                 sc.nextLine();

                                                 cb.updateContact(name,number);}

                                  else if(choice.equals("Email")){

                                                 System.out.println("\nEnter email");
                                                 email=sc.nextLine();
 
                                                cb.updateContact(name,email);}

                                  else{

                                               System.out.println("\nEnter Number");
                                               number=sc.nextLong();
                                               sc.nextLine();


                                               System.out.println("\nEnter email");
                                               email=sc.nextLine();

                                               cb.updateContact(name,number,email);}
         

     
                                   }
                                   else{
                                   System.out.println("\nContact not Found");}
     
                                   break;
     


                        case 7:

                              cb.countContact();
                              break;

                       case 8:
                             boolean validate1=false;
                             while(!validate1){
                                           System.out.println("\nEnter number");
                                           String temp = sc.nextLine();
                                       
                                           if (temp.length()==10 && temp.matches("[0-9]+")){
                                                         number=Long.parseLong(temp);
                                                         
                                                        cb.searchByNumber(number);
                                                         validate1=true;}
                                  
                                          else{
                                                        System.out.println("\nInvalid Number");
                                                        System.out.println("\n1.Add valid number / 2.Skip");
                                                        int choice=sc.nextInt();
                                                        sc.nextLine();
                                                        if(choice == 1){
                                                                 continue;}
                                                        else{
                                                                 validate1=true;
                                                                 }
                                              }
                                   }

                                   break;
                                   

}

}

}
}
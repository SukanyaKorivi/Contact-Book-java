import java.util.Scanner;

class Main{


public static void main(String[] args){


Scanner sc = new Scanner(System.in);

ContactBook cb = new ContactBook();




String name="";
Long number= 0L;
String email="";
boolean exit=false;



while(!exit){

System.out.println("Menu:\n1.Add Contact\n2.Search Contact\n3.delete Contact\n4.List All Contacts\n5.Exit\nEnter Your Choice");

int operation=sc. nextInt();
sc.nextLine();


switch (operation){

   case 1:
      System.out.println("Enter name");
      name = sc.nextLine();

      System.out.println("Enter number");
      number = sc.nextLong();
      sc.nextLine();

      System.out.println("Enter Email");
      email=sc.nextLine();

      cb.addContact(name,number,email);
      break;

   case 2:

      System.out.println("enter Contact name");
      name=sc.nextLine();

      cb.searchContact(name);
      break;

   case 3:

      System.out.println("Enter Contact");
      name=sc.nextLine();

      cb.deleteContact(name);
      break;

   case 4:

      cb.listAllContacts();
      break;

  case 5:
     System.out.println("Goodbye!");
     exit=true;
     break;

}

}

}

}
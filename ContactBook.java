import java.util.HashMap;
import java.util.Map;

class ContactBook{


Map<String, Contact> contactlist= new HashMap<>();


public void addContact(String name,Long number,String email){

  Contact obj=new Contact(name,number,email);

  contactlist.put(name,obj);
  
}


public void searchContact(String name){
    

      if(contactlist.containsKey(name)){
 
             Contact c=contactlist.get(name);
             c.display();
      }
      else{
             System.out.println("Contact not found");
      }

}
public void deleteContact(String name){

       if(contactlist.containsKey(name)){
  

             contactlist.remove(name);
             System.out.println("Contact deleted successfully!");
       }
       else{

             System.out.println("Contact not found");
       }

}


public void listAllContacts(){


      if(contactlist.isEmpty()){
 
           System.out.println("No contacts found");
      }

      else{

           for (String names : contactlist.keySet()){

                   Contact c= contactlist.get(names);

                   c.display();
             }
      }
}

public boolean checkContact(String name){
        return contactlist.containsKey(name);
   
}


public void updateContact(String name,Long number,String email){
    
  Contact obj1=new Contact(name,number,email);
  contactlist.put(name,obj1);
  System.out.println("Contact updated successfully!");  

          }


public void updateContact(String name,Long number){
 
     Contact c=contactlist.get(name);
     String email=c.email;
    
     Contact obj2=new Contact(name,number,email);
     contactlist.put(name,obj2);
     System.out.println("Contact updated successfully!");

}


public void updateContact(String name,String email){
 
     Contact c=contactlist.get(name);
     Long number=c.number;
    
     Contact obj3=new Contact(name,number,email);
     contactlist.put(name,obj3);
     System.out.println("Contact updated successfully!");

}
}
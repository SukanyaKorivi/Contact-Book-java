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




}
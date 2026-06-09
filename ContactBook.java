import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedHashMap;

class ContactBook{


Map<String, Contact> contactlist= new HashMap<>();



public void addContact(String name,Long number,String email){
 
 
                Contact obj=new Contact(name,number,email);
                contactlist.put(name.toLowerCase(),obj);
 
}


public boolean isDuplicate(Long number){
 
               for(Map.Entry<String,Contact> entry: contactlist.entrySet()){
                            if(number.equals(entry.getValue().getNumber())){
                                          
                    
                                          return true;
                       
                               }
                               
                }
                return false;
}

public void searchContact(String name){
    
                 if(contactlist.containsKey(name.toLowerCase())){
 
                          Contact c=contactlist.get(name.toLowerCase());
                          c.display();
                   }
                 else{
                          System.out.println("Contact not found");
                    }

}


public void searchByNumber(Long number){

                  boolean found=false;
                  for(Map.Entry<String,Contact> entry: contactlist.entrySet()){
                                if(entry.getValue() != null && number.equals(entry.getValue().getNumber())){
                                            Contact c=entry.getValue();
                                            c.display();
                                            found=true;
                                            break;
                                }
                }
                if(!found){

                          System.out.println("Contact not found");
                 }

}

public void deleteContact(String name){

                if(contactlist.containsKey(name.toLowerCase())){
  
                               contactlist.remove(name.toLowerCase());
                               System.out.println("Contact deleted successfully!");
                  }
                else{

                               System.out.println("Contact not found\n");
                  }

}


public void listAllContacts(){

               if(contactlist.isEmpty()){
 
                              System.out.println("No contacts found");
                 }

              else{
        
                             List<Map.Entry<String, Contact>> listsort=new ArrayList<>(contactlist.entrySet());
        
                             Collections.sort(listsort, (e1,e2) -> e1.getKey().compareTo(e2.getKey()));
        
                             LinkedHashMap<String ,Contact> sortedcontactlist= new LinkedHashMap<>();
        
                             for(Map.Entry<String, Contact> entry:listsort){
                                              sortedcontactlist.put(entry.getKey(),entry.getValue());
                             
                              }

                          for (Contact c:sortedcontactlist.values()){

                                     c.display();
                              }
              }

}

public boolean checkContact(String name){

                   return contactlist.containsKey(name.toLowerCase());
   
}


public void updateContact(String name,Long number,String email){
    
                   Contact obj1=new Contact(name,number,email);

                   contactlist.put(name.toLowerCase(),obj1);
  
                   System.out.println("Contact updated successfully!\n");  

}


public void updateContact(String name,Long number){
 
                   Contact c=contactlist.get(name.toLowerCase());
                   String email=c.email;
    
                   Contact obj2=new Contact(name,number,email);
                   contactlist.put(name.toLowerCase(),obj2);
                   System.out.println("Contact updated successfully!");

}


public void updateContact(String name,String email){
 
                  Contact c=contactlist.get(name.toLowerCase());
                  Long number=c.number;
    
                  Contact obj3=new Contact(name,number,email);
                  contactlist.put(name.toLowerCase(),obj3);
                  System.out.println("Contact updated successfully!");

}

public void countContact(){

                 if(contactlist.isEmpty()){

                        System.out.println("ContactBook Empty!");
                   }
                 else{
 
                        System.out.println("Total Contacts:"+ contactlist.size());
                  }
}
}
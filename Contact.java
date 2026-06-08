class Contact{

      String name;
      Long number;
      String email;
  
      Contact(String name, Long number, String email){
      this.name=name;
      this.number=number;
      this.email=email;
     
      }
public void display(){
    
      


      System.out.println("Name:"+name+"      Number:"+number+"      Email:"+email);
    

}

public long getNumber(){return number;}
}
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
    
      System.out.println("Contact Details\n");


      System.out.println("Name:"+name);
      System.out.println("Number:"+number);
      System.out.println("Email:"+email);


}
}
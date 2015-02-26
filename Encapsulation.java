//Encapsulate class

class Encapsulation{

   public static void main(String args[]){
      EncapTest encap = new EncapTest();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("\n Name : " + encap.getName()+ "\n Age : "+ encap.getAge() + "\n Employ Id : " +encap.getIdNum()+ "\n");
    }
}
 
 // Wrapper Class 
 
 class EncapTest extends Encapsulation
{

   private String name;
   private String idNum;
   private int age;

   public int getAge()
   {
      return age;
   }
	public void setAge( int newAge)
   {
      age = newAge;
	  System.out.println("Test Age");
   }

   public String getName()
   {
      return name;
   }
   public void setName(String newName)
   {
      name = newName;
	  System.out.println("Test Name");
   }

   public String getIdNum()
   {
      return idNum;
   }
   public void setIdNum( String newId)
   {
      idNum = newId;
	  System.out.println("Test Id Number");
   }
   
}

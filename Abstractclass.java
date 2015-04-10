abstract class Bike{  
  abstract void run();
abstract	void racer();
}  
  
class Abstractclass extends Bike{  
void run()
{System.out.println("running safely..");}
void racer()
{System.out.println("Raccer Method running safely..");}  
  
public static void main(String args[]){  
 Bike obj = new Honda4();  
 obj.run();  
 obj.racer();
}  
} 
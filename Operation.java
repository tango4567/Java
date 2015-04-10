class Operation{  
 int data=50;  

 void unchange(int data){  
data=data+100; 
}
 void change(int data){  

 this.data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
   System.out.println("before change "+op.data);
   
   op.unchange(500);  
   System.out.println("after change "+op.data);  
   op.change(500);  
   System.out.println("after change "+op.data);  
 }  
}  
import java.io.*;
import java.util.*;
class Thread1 extends Thread{  
 public void run(){
   for(int i=0;i<5;i++)
   {
     try {
      Thread.sleep(12550); 
     } catch (InterruptedException e){
       System.out.println(e);
     }
     System.out.println(i);
   }  
   System.out.println("task one");  
 }
   public  void dis()
   {
    System.out.println("hai");
   }
   
 public static void main(String args[]){  
  Thread1 t1=new Thread1();  
  Thread1 t2=new Thread1();  
  Thread1 t3=new Thread1();  
  // t2.dis();
 // t1.run();  
 System.out.println("1");
 
  t3.start(); 
  System.out.println("2"); 
 t2.dis();
 System.out.println("3");
 t1.start();  
 }  
}
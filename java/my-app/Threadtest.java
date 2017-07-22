class Threadtest{  
 public static void main(String args[]){  
  Runnable r1=new Runnable(){  
    public void run(){  
      System.out.println("task one");  
    }  
  };  
  
  Runnable r2=new Runnable(){  
    public void run(){  
      System.out.println("task two");  
    }  
  };  
      
  Threadtest t1=new Threadtest(r1);  
  Threadtest t2=new Threadtest(r2);  
  
  t1.start();  
  t2.start();  
 }  
}  
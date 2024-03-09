package thread19;

 /*class Demo extends Thread {
  public void run(){
   for(int i=1; i<= 10; i++){
    System.out.println("Sudarshan");
   }
  }
}*/
class Demo implements Runnable{

  @Override
  public void run() {
   for(int i=1; i<= 10; i++){
    System.out.println("Sudarshan");
   }
  }
 }
public class DemoThread{
 public static void main(String args[]){
 /* Demo d = new Demo();
  d.start();*/
  Demo d = new Demo();
  Thread t1 = new Thread(d);
  t1.start();
  for(int i = 1; i<=10; i++){
   System.out.println("main");
  }
 }
}
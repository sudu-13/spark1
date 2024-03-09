package feb22;


class Shape {  // parent class
    void draw(){
        System.out.println("drawing shape");
    }
}

class Circle extends Shape{ //child class
    void draw() {
        System.out.println("drawing circle");
    }
}
class Rectrangle extends Shape{  // child class
    void draw(){
        System.out.println("drawing rectangle");
    }
}
public class Test{
     public static void main(String args[]){
         Shape shape = new Shape();
         shape.draw();
         Circle circle = new Circle();
         circle.draw();
         Rectrangle rectrangle = new Rectrangle();
         rectrangle.draw();

         System.out.println("--------------------------------------------");

         Shape shape1=new Circle();
         shape1.draw();
         Shape shape2=new Rectrangle();
         shape2.draw();

     }
}

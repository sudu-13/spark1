package feb29;

interface vehicle1{
    public  int  speedcalcuated();
    int i =10;
}
class truck implements vehicle1{

    @Override
    public int speedcalcuated() {
        return 80;
    }
}

class train implements vehicle1{

    @Override
    public int speedcalcuated() {
        return 200;
    }
}

class superbike implements vehicle1{

    @Override
    public int speedcalcuated() {
        return 300;
    }
}
public class usingInterface {
    public static void main(String args[]){
        vehicle1 tr = new truck();
        vehicle1 tr1 = new train();
        vehicle1 sb = new superbike();
        System.out.println("speed of truck = " + tr.speedcalcuated());
        System.out.println("speed of truck = " + tr1.speedcalcuated());
        System.out.println("speed of truck = " + sb.speedcalcuated());
    }
}

package feb22;

import org.omg.Messaging.SyncScopeHelper;

class jungle {
     void makeNoise() {
         System.out.println("jungle sound");
     }
}
class cat extends jungle{


}
public class overriding1{
    public static void main(String args[]){
        cat co = new cat();
        System.out.print("child object :-");
        co.makeNoise();

        jungle ju = new jungle();
        ju.makeNoise();
    }

}

package feb29;

public class typeCasting1 {
    public static void main(String args[]){
        //implicit (widening) casting
        int num = 70;
        System.out.println("value of int num :" +num );

        char sk = (char)num;
        System.out.println("value of char  :" +sk );


        double s = num;
        System.out.println("value of double num :" +s );

        double ak = 10.11;
        System.out.println("value of double num :" +ak );

        int f = (int)ak;
        System.out.println("value of int num :" +f );

    }
}

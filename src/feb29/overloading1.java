package feb29;


public class overloading1 {
    public static void sum(int... x){
        int res = 0;
        for(int i = 0; i<x.length; i++){
            res = res + x[i];
        }
        System.out.println(res);
    }
    public static void main(String args[]){
        sum(10);
        sum(10,10,10);
    }
}

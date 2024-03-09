package feb17;

public class stringAndStringBuffer {
    public static void main(String args[]){
       /* String s1 ="hello";
       String s2 = s1.concat("india");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        */
        String ap = new String("ajay");
        String sa =ap.concat("kumar"); // hold the value for another object
        System.out.println(sa);

        //append()
        StringBuffer sb = new StringBuffer("sudarshan");
        sb.append("Kumar");
        System.out.println(sb);

        //insert()
        sb.insert(2,13);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);

        //replace
        sb.replace(3,7,"it is boss");
        System.out.println(sb);
    }
}

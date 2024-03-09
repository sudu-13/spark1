public class stringDemo {
    public static void main(String args[]){
        String s1="sudarshan";
        System.out.println(s1);
        String s2="mahto";
        System.out.println(s2);
        String s3="sudarshan";
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s3.length());
        int len = s2.length();
        System.out.println(len);
    }
}

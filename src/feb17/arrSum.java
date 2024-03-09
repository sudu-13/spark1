package feb17;

public class arrSum {
    public static void main(String arg[]){
        int arr[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }
}

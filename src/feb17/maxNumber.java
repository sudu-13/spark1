package feb17;

public class maxNumber {
    public static void main(String args[]){
        int []arr={29,56,34,65,2,34,35};
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

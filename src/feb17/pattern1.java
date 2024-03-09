package feb17;

public class pattern1 {
    public static void main(String args[]){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
            for(int i=5;i>=1;i--){
                for(int j=1; j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


        System.out.print("**********************************************");
          int k=1;
        for(int i=0; i<=5; i++){
            for(int j=0; j<i; j++) {
                System.out.print(k+ " ");
                k++;
            }

            System.out.println();
        }

        System.out.print("**********************************************");

        for(int i=0; i<=5; i++){
            for(int j=0; j<i; j++) {
                System.out.print(j + " ");

            }

            System.out.println();
        }
    }

}

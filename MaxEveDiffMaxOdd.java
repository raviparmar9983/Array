import java.util.Scanner;

public class MaxEveDiffMaxOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxEven=0;
        int countEven=0;
        int countOdd=0;
        int minOdd=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
                if(maxEven<arr[i]){
                    maxEven=arr[i];
                }
            }
            else{
                countOdd++;
                if(arr[i]<minOdd){
                    minOdd=arr[i];
                }
            }
        }
        if(countEven==0){
            maxEven=0;
        }
        else if(countOdd==0){
            minOdd=0;
        }
        System.out.println(maxEven-minOdd);


    }
}

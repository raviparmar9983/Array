import java.util.Scanner;

public class Pair {
    public static int sum(int arr[],int n,int sum){
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    return 1;
                }
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }
        int sum=sc.nextInt();
        System.out.println(sum(arr,arr.length,sum));

    }
}

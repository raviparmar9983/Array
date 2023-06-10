import java.util.Scanner;
public class SecondLargest {
    public static int SecondLarges(int arr[],int n,int max){
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max==arr[i]){
                continue;
            }
            else if(max2<arr[i]){
                max2=arr[i];
            }
        }
        if(max2<0){
            return -1;
        }
        else{
            return max2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int SecondLargest=SecondLarges(arr,n,max);
        System.out.println(SecondLargest);

    }
}

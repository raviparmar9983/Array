import java.util.Scanner;

public class ElementPresent{
    public static int presentORNot(int arr[],int N,int key){
        for(int i=0;i<N;i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int res=presentORNot(arr,N,key);
        System.out.println(res);
    }
}
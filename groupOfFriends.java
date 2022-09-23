import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String s=in.next();
            String[] arr=s.split("0",0);
            // System.out.println(Arrays.toString(arr));
             print(arr);
        }
        
    }
    public static void print(String[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("")){
                count++;
            }
        }
        System.out.println(count);
    }
}//01100111101110 -// 0 represents number of emptyseat 1 represent number of friends

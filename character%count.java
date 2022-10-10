import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            String str=in.next();
           char ch=in.next().charAt(0);
              check(str,ch);
        }
       
    }
    public static void check(String str,char k){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==k){
                count++;
                 
            }
        }
        int l=str.length();
        // System.out.println(l);
        double i=((double)count/l)*100;
        System.out.println((int)i);
    }
    
}
